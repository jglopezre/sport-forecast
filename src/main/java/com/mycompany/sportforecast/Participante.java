/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

public class Participante {
    private int idParticipante;
    private String nombre;
    //private Pronostico[] pronosticos;

    public Participante(int idParticipante, String nombre) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
    }
    
    public Participante() {
        this.nombre = "";
    }

    public void setIdParticipante(int id) {
        this.idParticipante = id;
    }
    
    public int getIdParticipante() {
        return this.idParticipante;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }*/

    @Override
    public String toString() {
        return  "\n" +
                "Participante{ " +
                "id= " + idParticipante + " " +
                this.nombre +
                " }";
    }
    
    public void cargarPronostico(){
        
    }
    
    
}
