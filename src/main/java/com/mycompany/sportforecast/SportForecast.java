/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sportforecast;

import java.util.List;

/**
 *
 * Este trabajo esta realizado en colaboracion por:
 * - Ezequiel Criscueli - criscuelieduardo@gmail.com
 * - Daniela Bastias - danybastias@outlook.com
 * - Ricardo jorge herrera - Ricardherrera35@gmail.com 
 * - Melina Díaz - melinaydiaz@gmail.com
 * - Javier Lopez - jglopezr.018@gmail.com
 */

public class SportForecast {
    
    public static void main(String[] args) {
        ListaParticipantes participantes = new ListaParticipantes();
        play(participantes);
    }
    
    public static void play(ListaParticipantes participantes) {
        System.out.println(participantes.getSortedParticipantes());
    }
/*pronosticoByParticipante += 
                    "\n" + "Pronostico " + pronostico.getIdPronostico() + 
                    " el equipo " + equiposByPartido[pronostico.getIdEquipo() - 1].getNombre() +
                    " será: " + pronosticoResult + "\n" +
                    "El partido terminó " +
                    equiposByPartido[0].getNombre() + " = " + partido.getGolesEquipo1() + 
                    " vs " + equiposByPartido[1].getNombre() + " = " + partido.getGolesEquipo2() + "\n" + 
                    "El equipo " + equiposByPartido[pronostico.getIdEquipo() - 1].getNombre() + " tuvo resultado " +
                    resultadoEquipoByPartido + "\n";
            
            
            int[] scoreAndId = { participante.getIdParticipante(), assertedPronosticoCounter};
            System.out.println(">>> El participante " + nombreParticipante +
                    " tiene los siguientes pronosticos: \n" + pronosticoByParticipante + "\n" +
                    nombreParticipante + " asertó " + assertedPronosticoCounter + " pronosticos" + "\n" +        
                    "------------------------------------");*/

}


