/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ownclasses;


public class Partido {
    private String equipo1, equipo2;
    private int golesEquipo1, golesEquipo2;
    
    public Partido(
            String equipo1,
            String equipo2,
            int golesEquipo1,
            int golesEquipo2) {
    
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
    public Partido() {
        this.equipo1 = "";
        this.equipo2 = "";
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }
    
    public void setEquipo1(String equipo) {
        this.equipo1 = equipo;
    }
    
    public String getEquipo1() {
        return this.equipo1;
    }
    
    public void setEquipo2(String equipo) {
        this.equipo2 = equipo;
    }
    
    public String getEquipo2() {
        return this.equipo2;
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
        return "Partido{" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + '}';
    }
    
    
    public char resultado(Equipo equipo) {
        return 'G';
    }
    
}
