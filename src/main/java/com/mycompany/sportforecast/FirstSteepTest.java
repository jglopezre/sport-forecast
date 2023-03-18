/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import ownclasses.*;
/**
 *
 * @author javierl
 */
public class FirstSteepTest {
    
    // Test Equipo Class here
    
    private void testEquipoClass(String equipo, String descripcion) {
        Equipo myEquipo = new Equipo();
        
        myEquipo.setNombre(equipo);
        myEquipo.setDescripcion(descripcion);
        
        System.out.println(myEquipo);
    }
    
    public void testEquipo() {
        this.testEquipoClass("River Plate", "El equipo del rojo y negro");
    }
    
}
