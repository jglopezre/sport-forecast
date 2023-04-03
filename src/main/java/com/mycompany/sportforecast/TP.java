/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sportforecast;

import com.mycompany.sportforecast.PronosticoDeportivo;

public class TP {

    private PronosticoDeportivo PRODE;
  
    public void executeMain() {
        
        PRODE = new PronosticoDeportivo();
        PRODE.cargarEquipos();   
        System.out.println ("=== EQUIPOS ===");
        System.out.println (PRODE.listarEquipos());
        
        System.out.println("*".repeat(40));

        PRODE.cargarParticipantes();   
        System.out.println ("=== PARTICIPANTES ===");
        System.out.println (PRODE.listarParticipantes());
        
        System.out.println("*".repeat(40));

        PRODE.cargarPartidos();   
        System.out.println ("=== PARTIDOS ===");
        System.out.println (PRODE.listarPartidos());
        
        System.out.println("*".repeat(40));

        PRODE.cargarPronosticos();   
        System.out.println ("=== PRONOSTICO ===");
        System.out.println (PRODE.listarPronosticos());
        
    }
    
}