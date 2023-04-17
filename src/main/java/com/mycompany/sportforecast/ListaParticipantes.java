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
import java.util.List;
import java.util.ArrayList;

public class ListaParticipantes {
    private List<Participante> participantes;
    private final String defaultDB = "./pronosticos.db";
    private final String CONSULTA_PARTICIPANTES = "SELECT idParticipante, nombre FROM Participantes";
    
    //Constructores
    public ListaParticipantes(String nombreArchivo) {
        this.participantes = readParticipanteDB(nombreArchivo);
    }
    
    public ListaParticipantes() {
        this.participantes = readParticipanteDB(this.defaultDB);
    }
    
    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
    
    public List<Participante> getParticipantes() {
        return this.participantes;
    }
    
    public void addParticipante(Participante participante) {
        this.participantes.add(participante);
    }
    
    public void removeParticipante(Participante participante) {
        this.participantes.remove(participante);
    }
    
    @Override
    public String toString() {
        return "Listar Participantes {" + "Participantes =" + participantes + "}";
    }
    
    public String Listar() {
        String list = "";
        for(Participante participante : this.participantes) {
            list += "\n" + participante;
        }
        
        return list;
    }
    
    private List<Participante> readParticipanteDB(String db) {
        List<Participante> participantes = new ArrayList<>();
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+db);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(CONSULTA_PARTICIPANTES);
            
            //Una vez ejecutada la consulta, analizamos los valores recibidos de cada equipo
            while (rs.next()) {
                Participante participante = new Participante(
                        rs.getInt("idParticipante"),
                        rs.getString("nombre")
                );
                participantes.add(participante);
            }
        } catch(SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return participantes;
    }
    
    public Participante getParticipante (int id) {
        Participante found = null;
        for (Participante participante : this.getParticipantes()) {
            if (participante.getIdParticipante() == id) {
                found = participante;
                break;
            }
        }
        return found;
    }
}