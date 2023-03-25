/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.util.List;


public class Participante {
    private String nombre;
    private Pronostico[] pronosticos;

    public Participante(String nombre, Pronostico[] pronosticos) {
        this.nombre = nombre;
        this.pronosticos = pronosticos;
    }
    
    public Participante() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", pronosticos=" + pronosticos + '}';
    }

    
    
}
