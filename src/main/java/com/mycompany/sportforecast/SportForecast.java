/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sportforecast;

import de.vandermeer.asciitable.AsciiTable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Este trabajo esta realizado en colaboracion por:
 * - Ezequiel Criscueli - criscuelieduardo@gmail.com
 * - Daniela Bastias - danybastias@outlook.com
 * - Ricardo Jorge Herrera - Ricardherrera35@gmail.com 
 * - Melina Díaz - melinaydiaz@gmail.com
 * - Javier Lopez - jglopezr.018@gmail.com
 */

public class SportForecast {
    
    public static void main(String[] args) {
        ListaParticipantes participantes = new ListaParticipantes();
        play(participantes);
    }
    
    public static void play(ListaParticipantes participantes) {
        AsciiTable atable = new AsciiTable();
        List<Participante> winners = new ArrayList<>();
        boolean firstLoop = true;
        int maxScore = 0;
        
        atable.addRule();
        atable.addRow("Nombre", "puntos");
        atable.addRule();
        
        for(Participante participante : participantes.getSortedParticipantes()) {
            int participanteScore = participante.getScorePronostico();
            atable.addRow(
                    participante.getNombre().replaceAll("\"", ""),
                    participanteScore
            );
            atable.addRule();
            
            if(firstLoop) {
                firstLoop = false;
                maxScore = participanteScore;
            }
            
            if(maxScore == 0 || maxScore == participanteScore) {
                winners.add(participante);
            }
        }
        
        System.out.print(atable.render());
        
        if(winners.size() >= 2) {
            System.out.println("\n >>> Ganadoras(es): ");
            winners.forEach(elem -> {
                System.out.println(
                    "\t * " + elem.getNombre().replace("\"", "")
                );
            });
        } else if (winners.size() == 1){
            System.out.println(
                ">>> Ganador(a): \n" +
                winners.get(0).getNombre().replace("\"", "") + 
                "!!!"
            );
        } else {
            System.out.println(">>> No hubo Ganador!!! <<<");
        }
    }
}


