/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.util.ArrayList;
import java.util.List;

public class Participante implements Comparable<Participante>{
    private int idParticipante;
    private String nombre;
    private final ListaPronosticos pronosticos;

    public Participante(int idParticipante, String nombre) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
        this.pronosticos = new ListaPronosticos(idParticipante);
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
    
    public List<Pronostico> getPronosticos() {
        List<Pronostico> pronosticosById = new ArrayList<>();
        
        for(Pronostico pronostico : this.pronosticos.getPronosticos()) {
            if(pronostico.getIdParticipante() == this.getIdParticipante()) {
                pronosticosById.add(pronostico);
            }
        }
        if(pronosticosById.size() <= 0) {
            System.out.println("Pronosticos no encontrados en la lista");
        }
        return pronosticosById;
    }
    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos.setPronosticos(pronosticos);
     }
     
    public int getScorePronostico() {
        ListaPartidos partidos = new ListaPartidos();
        ListaEquipos equipos = new ListaEquipos();
        
        int assertedPronosticoCounter = 0;
        
        for(Pronostico pronostico : this.getPronosticos()) {
                Partido partido = partidos.getPartido(pronostico.getIdPartido());
                Equipo[] equiposByPartido = {
                    equipos.getEquipo(partido.getIdEquipo1()),
                    equipos.getEquipo(partido.getIdEquipo2())
                };
                char resultadoEquipoByPartido = partido.getResultado(equiposByPartido[pronostico.getIdEquipo() - 1]);
                assertedPronosticoCounter += pronostico.resultCompare(resultadoEquipoByPartido);
            }
        return assertedPronosticoCounter;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Participante{ " +
                "id= " + this.getIdParticipante() + " " +
                "nombre= " + this.getNombre() + " " +
                "puntaje= " + this.getScorePronostico() +
                " }";
    }
    
    @Override
    public int compareTo(Participante participante) {
        int thisParticipante = this.getScorePronostico();
        int otherParticipante = participante.getScorePronostico();
        if( thisParticipante == otherParticipante) {
            return 0;
        } else if(thisParticipante > otherParticipante) {
            return 1;
        } else {
            return -1;
        }
    }
}