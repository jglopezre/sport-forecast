/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author javierl
 */
public class FirstSteepTest {
    
    public void testOwnClases() {
        Equipo equipo1 = new Equipo("Equipo 1", "Descripción equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2", "Descripción equipo 2");

        Partido partido1 = new Partido(equipo1, equipo2, 1, 0);
        Partido partido2 = new Partido(equipo2, equipo1, 2, 2);

        Pronostico pronostico1 = new Pronostico(equipo1, partido1, 'L');
        Pronostico pronostico2 = new Pronostico(equipo1, partido2, 'E');
        Pronostico pronostico3 = new Pronostico(equipo2, partido1, 'V');
        Pronostico pronostico4 = new Pronostico(equipo2, partido2, 'E');
		
        List<Pronostico> pronosticos = new ArrayList<>();
        pronosticos.add(pronostico1);
        pronosticos.add(pronostico2);
        pronosticos.add(pronostico3);
        pronosticos.add(pronostico4);

        Participante participante1 = new Participante("Participante 1", pronosticos);

        System.out.println(participante1);
    
    }
}