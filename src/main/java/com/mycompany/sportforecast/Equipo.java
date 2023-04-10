/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;


public class Equipo {
    private int idEquipo;
    private String nombre;
    private String descripcion;

    public Equipo(int idEquipo, String nombre, String descripcion) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Equipo() {
        this.nombre = "";
        this.descripcion = "";
    }

    public void setIdEquipo(int id) {
        this.idEquipo = id;
    }
    
    public int getIdEquipo() {
        return this.idEquipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\n" +
                "id " + this.idEquipo + " " +
                "nombre " + this.nombre +
                " (" + this.descripcion +
                ")";
    }
}
