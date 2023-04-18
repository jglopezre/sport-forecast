/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sportforecast;

import de.vandermeer.asciitable.AsciiTable;

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
        AsciiTable atable = new AsciiTable();
        
        atable.addRule();
        atable.addRow("Nombre", "puntos");
        atable.addRule();
        
        for(Participante participante : participantes.getSortedParticipantes()) {
            atable.addRow(
                    participante.getNombre().replaceAll("\"", ""),
                    participante.getScorePronostico()
            );
            atable.addRule();
        }
        
        System.out.print(atable.render());
    }
}


