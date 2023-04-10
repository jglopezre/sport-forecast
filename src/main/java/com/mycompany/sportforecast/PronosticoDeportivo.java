/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.util.List;
import java.util.ArrayList;
        
public class PronosticoDeportivo {
    private final ListaEquipos equipos;
    private final ListaPartidos partidos;
    private final ListaParticipantes participantes;
    private final ListaPronosticos pronosticos;
    
    public PronosticoDeportivo() {
        equipos = new ListaEquipos();
        partidos = new ListaPartidos();
        participantes = new ListaParticipantes();
        pronosticos = new ListaPronosticos();
    }
    
    public void play() {
        
        for (Participante participante : this.participantes.getParticipantes()) {
            String nombreParticipante = participante.getNombre();
            String pronosticoByParticipante = "";
            for(Pronostico pronostico : getPronosticoById(participante.getIdParticipante())) {
                Partido partido = this.partidos.getPartido(pronostico.getIdPartido());
                String[] equiposByPartido = {
                    this.equipos.getEquipo(partido.getIdEquipo1()).getNombre(),
                    this.equipos.getEquipo(partido.getIdEquipo2()).getNombre()
                };
                String pronosticoResult = String.valueOf(pronostico.getResultado());
                
                pronosticoByParticipante += 
                        "\nPronostico " + pronostico.getIdPronostico() + 
                        " el equipo " + equiposByPartido[pronostico.getIdEquipo() - 1] +
                        " será: " + pronosticoResult + "\n" +
                        "El resultado del partido fue " +
                        equiposByPartido[0] + " = " + partido.getGolesEquipo1() + 
                        " vs " + equiposByPartido[1] + " = " + partido.getGolesEquipo2() + "\n";
            }
            
                    
            System.out.println(">>> El participante " + nombreParticipante +
                    " tiene los siguientes pronosticos: \n" + pronosticoByParticipante +
                    "------------------------------------");
            
            pronosticoByParticipante = "";
        }   
    }
    
    private List<Pronostico> getPronosticoById(int idParticipante) {
        List<Pronostico> pronosticosById = new ArrayList<>();
        
        for(Pronostico pronostico : this.pronosticos.getPronosticos()) {
            if(pronostico.getIdParticipante() == idParticipante) {
                pronosticosById.add(pronostico);
            }
        }
        if(pronosticosById.size() <= 0) {
            System.out.println("Pronosticos no encontrados en la lista");
        }
        return pronosticosById;
    } 
    
    
    
    
    
    
    
}
