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
            int assertedPronosticoCounter = 0;
            for(Pronostico pronostico : getPronosticoById(participante.getIdParticipante())) {
                Partido partido = this.partidos.getPartido(pronostico.getIdPartido());
                Equipo[] equiposByPartido = {
                    this.equipos.getEquipo(partido.getIdEquipo1()),
                    this.equipos.getEquipo(partido.getIdEquipo2())
                };
                char pronosticoResult = pronostico.getResultado();
                char resultadoEquipoByPartido = partido.getResultado(equiposByPartido[pronostico.getIdEquipo() - 1]);
                assertedPronosticoCounter += pronosticoResulCompare(pronosticoResult, resultadoEquipoByPartido);
                
                
                pronosticoByParticipante += 
                        "\n" + "Pronostico " + pronostico.getIdPronostico() + 
                        " el equipo " + equiposByPartido[pronostico.getIdEquipo() - 1].getNombre() +
                        " será: " + pronosticoResult + "\n" +
                        "El partido terminó " +
                        equiposByPartido[0].getNombre() + " = " + partido.getGolesEquipo1() + 
                        " vs " + equiposByPartido[1].getNombre() + " = " + partido.getGolesEquipo2() + "\n" + 
                        "El equipo " + equiposByPartido[pronostico.getIdEquipo() - 1].getNombre() + " tuvo resultado " +
                        resultadoEquipoByPartido + "\n";
            }
            
                    
            System.out.println(">>> El participante " + nombreParticipante +
                    " tiene los siguientes pronosticos: \n" + pronosticoByParticipante + "\n" +
                    nombreParticipante + " asertó " + assertedPronosticoCounter + " pronosticos" + "\n" +        
                    "------------------------------------");
            
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
    
    private int pronosticoResulCompare(char equipoPartidoResult, char equipoPronosticoResult) {

        if(equipoPartidoResult == equipoPronosticoResult){
            return 1;
        } else {
            return 0;
        }
    }
    
    
    
    
    
}
