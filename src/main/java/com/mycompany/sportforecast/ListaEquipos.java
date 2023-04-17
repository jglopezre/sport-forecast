/*
Clase ListaEquipos para el ejercicio 6_3
 */
package com.mycompany.sportforecast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaEquipos {
    // atributo
    private List<Equipo> equipos;
    private final String defaultDB = "./pronosticos.db";
    private final String CONSULTA_EQUIPOS = "SELECT idEquipo, nombre, descripcion FROM Equipos";

    public ListaEquipos() {
        this.equipos = loadEquiposData();
    }
    
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }
    public void removeEquipo(Equipo equipo) {
        this.equipos.remove(equipo);
    }

    @Override
    public String toString() {
        return "ListaEquipos{ " + "equipos= " + equipos + '}';
    }

    public String listar() {
        String lista = "";
        for (Equipo equipo: equipos) {
            lista += "\n" + equipo;
        }           
        return lista;
    }
    
    private List<Equipo> loadEquiposData() {
        List<Equipo> equipos = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+this.defaultDB);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(CONSULTA_EQUIPOS);
            
            //Una vez ejecutada la consulta, analizamos los valores recibidos de cada equipo
            while (rs.next()) {
                Equipo equipo = new Equipo(
                   rs.getInt("idEquipo"),
                    rs.getString("nombre"),
                 rs.getString("descripcion")
                );
                equipos.add(equipo);
            }
        } catch(SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return equipos;
    }
    
    public Equipo getEquipo (int idEquipo) {
        Equipo found = null;
        for (Equipo equipo : this.getEquipos()) {
            if (equipo.getIdEquipo() == idEquipo) {
                found = equipo;
                break;
            }
        }
        return found;
    }
}
