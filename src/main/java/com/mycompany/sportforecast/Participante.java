/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.util.ArrayList;
import java.util.List;

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
    
    public List<Pronostico> getPronosticoById(ListaPronosticos pronosticos) {
        List<Pronostico> pronosticosById = new ArrayList<>();
        
        for(Pronostico pronostico : pronosticos.getPronosticos()) {
            if(pronostico.getIdParticipante() == this.getIdParticipante()) {
                pronosticosById.add(pronostico);
            }
        }
        if(pronosticosById.size() <= 0) {
            System.out.println("Pronosticos no encontrados en la lista");
        }
        return pronosticosById;
    }
}
