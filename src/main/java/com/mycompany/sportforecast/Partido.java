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
    
    public int setGolesEquipo1() {
        return this.golesEquipo1;
    }
    
    public void setGolesEquipo2(int goles) {
        this.golesEquipo2 = goles;
    }
    
    public int setGolesEquipo2() {
        return this.golesEquipo2;
    }

    @Override
    public String toString() {
        return "Partido{ " + 
                "idPartido= " + idPartido +
                ", equipo1= " + idEquipo1 +
                ", equipo2= " + idEquipo2 +
                ", golesEquipo1=" + golesEquipo1 +
                ", golesEquipo2=" + golesEquipo2 +
                " }";
    }
    
    
    public char resultado(Equipo equipo) {
        return 'G';
    }
    
}
