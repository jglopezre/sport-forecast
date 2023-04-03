/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import com.mycompany.sportforecast.Partido;
import com.mycompany.sportforecast.Equipo;


public class Pronostico {
    private int idPronostico, idParticipante, idPartido, idEquipo;
    private char resultado;

    public Pronostico(int idPronostico, int idParticipante, int idPartido, int idEquipo, char resultado) {
        this.idPronostico = idPronostico;
        this.idParticipante = idParticipante;
        this.idPartido = idPartido;
        this.idEquipo = idEquipo;
        this.resultado = resultado;
    }
    
    public Pronostico() {
        this.idPronostico = 0;
        this.idParticipante = 0;
        this.idPartido = 0;
        this.idEquipo = 0;
        this.resultado = '\0';
    }
    public int getIdPronostico() {
        return this.idPronostico;
    }
    
    public void setIdPronostico(int id) {
        this.idPronostico = id;
    }
    
    public int getIdParticipante() {
        return this.idParticipante;
    }
    
    public void setIdParticipante(int id) {
        this.idParticipante = id;
    }
    
    public int getIdEquipo() {
        return this.idEquipo;
    }
    
    public void setIdEquipo(int id) {
        this.idEquipo = id;
    }

    public int getIdPartido() {
        return this.idPartido;
    }

    public void setIdPartido(int id) {
        this.idPartido = id;
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{ " +
                "idPronostico= " + idPronostico +
                ", idParticipante= " + idParticipante +
                ", partido= " + idPartido +
                ", equipo= " + idEquipo +
                ", resultado= " + resultado +
                " }";
    }
    
    public int puntos(int puntos) {
        return 0;
    }
}