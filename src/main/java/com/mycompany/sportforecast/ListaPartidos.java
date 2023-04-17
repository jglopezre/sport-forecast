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

public class ListaPartidos {
    private List<Partido> partidos;
    private final String defaultDB = "./pronosticos.db";
    private final String CONSULTA_PARTIDOS = "SELECT idPartido, idEquipo1, idEquipo2, golesEquipo1, golesEquipo2 FROM Partidos";
    
    public ListaPartidos() {
        this.partidos = this.loadPartidosData(this.defaultDB);
    }
    
    public List<Partido> getPartidos() {
        return this.partidos;
    }
    
    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
    
    public void addPartido(Partido partido) {
        this.partidos.add(partido);
    }
    
    public void removePartido(Partido partido) {
        this.partidos.remove(partido);
    }
    
    @Override
    public String toString() {
        return "Listar Partidos { " + "Partidos = " + this.partidos + "}";
    }
    
    public String Listar() {
        String lista = "";
        for(Partido partido : this.partidos){
            lista += "\n" + partido;
        }
        return lista;
    }
    
    private List<Partido> loadPartidosData(String db) {
        List<Partido> partidos = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+db);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(CONSULTA_PARTIDOS);
            
            //Una vez ejecutada la consulta, analizamos los valores recibidos de cada equipo
            while (rs.next()) {
                Partido partido = new Partido(
                    rs.getInt("idPartido"),
                    rs.getInt("idEquipo1"),
                    rs.getInt("idEquipo2"),
                  rs.getInt("golesEquipo1"),
                  rs.getInt("golesEquipo2")
                );
                partidos.add(partido);
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
        return partidos;
    }
    
    public Partido getPartido (int id) {
        Partido found = null;
        for (Partido partido : this.getPartidos()) {
            if (partido.getIdPartido() == id) {
                found = partido;
                break;  //for exit from for loop by find first coinsidence
            }
        }
        return found;
    }
}

