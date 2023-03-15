/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ownclasses;

/**
 *
 * @author javierl
 */
public class Partido {
    private String equipo1, equipo2;
    private int golesEquipo1, golesEquipo2;
    
    public Partido (
            String equipo1,
            String equipo2,
            int golesEquipo1,
            int golesEquipo2) {
    
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
}
