/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaPronosticos {
    private List<Pronostico> pronosticos;
    private final String defaultDB = "./pronosticos.db";
    private final String CONSULTA_PRONOSTICOS = "SELECT idPronostico, idParticipante, idPartido, idEquipo, resultado FROM Pronosticos";
    
    public ListaPronosticos(int idParticipante) {
        pronosticos = this.loadPronosticoData(idParticipante);
    }
    
    public ListaPronosticos() {
        pronosticos = this.loadPronosticoData(0);
    }
    
    public List<Pronostico> getPronosticos() {
        return pronosticos;
    } 
    
    public void setPronosticos(List<Pronostico> pronosticosList) {
        this.pronosticos = pronosticosList;
    }
    
    public void addPronostico(Pronostico pronostico) {
        this.pronosticos.add(pronostico);
    }
    
    public void removePronostico(Pronostico pronostico) {
        this.pronosticos.remove(pronostico);
    }
    
    public Pronostico getPronostico (int id) {
        Pronostico found = null;
        for (Pronostico pronostico : this.getPronosticos()) {
            if (pronostico.getIdPronostico() == id) {
                found = pronostico;
                break;
            }
        }
        return found;
    }
    
    @Override
    public String toString() {
        return "Listar Pronosticos {" + "Pronostico = " + this.pronosticos + "}";
    }
    
    public int listSize() {
        return pronosticos.size();
    }
    
    public String Listar() {
        String lista = "";
        for(Pronostico pronostico : this.pronosticos){
            lista += "\n" + pronostico;
        }
        return lista;
    }
    
    private List<Pronostico> loadPronosticoData(int idParticipante) {
        List<Pronostico> pronosticos = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+this.defaultDB);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(CONSULTA_PRONOSTICOS + " WHERE idParticipante=" + idParticipante);
            
            //Una vez ejecutada la consulta, analizamos los valores recibidos de cada equipo
            while (rs.next()) {
                Pronostico pronostico = new Pronostico(
                    rs.getInt("idPronostico"),
                    rs.getInt("idParticipante"),
                    rs.getInt("idPartido"),
                    rs.getInt("idEquipo"),
                    rs.getString("resultado").charAt(0)
                );
                pronosticos.add(pronostico);
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
        return pronosticos;
    }
    
    
}
