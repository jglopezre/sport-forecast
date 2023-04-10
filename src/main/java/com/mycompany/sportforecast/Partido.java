/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

public class Partido {
    private int idPartido, idEquipo1, idEquipo2, golesEquipo1, golesEquipo2;
    
    public Partido(
            int idPartido,
            int idEquipo1,
            int idEquipo2,
            int golesEquipo1,
            int golesEquipo2) {
    
        this.idPartido = idPartido;
        this.idEquipo1 = idEquipo1;
        this.idEquipo2 = idEquipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
    public Partido() {
        
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }
    
    public void setIdPartido(int id) {
        this.idPartido = id;
    }
    
    public int getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdEquipo1(int idEquipo) {
        this.idEquipo1 = idEquipo;
    }
    
    public int getIdEquipo1() {
        return this.idEquipo1;
    }
    
    public void setIdEquipo2(int idEquipo) {
        this.idEquipo2 = idEquipo;
    }
    
    public int getIdEquipo2() {
        return this.idEquipo2;
    }
    
    public void setGolesEquipo1(int goles) {
        this.golesEquipo1 = goles;
    }
    
    public int getGolesEquipo1() {
        return this.golesEquipo1;
    }
    
    public void setGolesEquipo2(int goles) {
        this.golesEquipo2 = goles;
    }
    
    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }

    @Override
    public String toString() {
        String response = 
                "Partido id = " + this.idPartido + "\n" +
                "-----------------------------------------\n"+
                this.idEquipo1 + " vs. " + this.idEquipo2 + "\n" +
                "Resultado: "+ this.golesEquipo1 + " a " + this.golesEquipo2 + "\n" +
                "-----------------------------------------\n";
        return response;
    }
    
    public char getResultado (Equipo equipo) {
        char resultado = 'X';
        
        if (equipo.getIdEquipo() == idEquipo1) {
            if (this.golesEquipo1 > this.golesEquipo2) {
                resultado = 'G';
            } else if (this.golesEquipo1 < this.golesEquipo2) {
                resultado = 'P';
            } else {
                resultado = 'E';
            }
        } else if (equipo.getIdEquipo() == idEquipo2) {
            if (this.golesEquipo2 > this.golesEquipo1) {
                resultado = 'G';
            } else if (this.golesEquipo2 < this.golesEquipo1) {
                resultado = 'P';
            } else {
                resultado = 'E';
            }
        } 
        return resultado;
    }
}
