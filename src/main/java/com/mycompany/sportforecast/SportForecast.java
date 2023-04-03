/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sportforecast;

import java.util.List;

/**
 *
 * @author javierl
 */

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
    //private static TP tp;
    private static ListaParticipantes listaParticipantes;
    private static ListaEquipos listaEquipos;
    private static ListaPartidos listaPartidos;
    private static ListaPronosticos listaPronosticos;
    
    public static void main(String[] args) {
        //tp = new TP();
        //tp.executeMain();   //Executes mainly function of TP class imported here
        
        listaParticipantes = new ListaParticipantes();
        System.out.println(listaParticipantes);
        System.out.println("mi busqueda = " + listaParticipantes.getParticipante(1));
        
        listaEquipos = new ListaEquipos();
        System.out.println(listaEquipos);
        System.out.println("mi busqueda = " + listaEquipos.getEquipo(4));
        
        listaPartidos = new ListaPartidos();
        System.out.println(listaPartidos);
        System.out.println("mi busqueda = " + listaPartidos.getPartido(6));
        
        listaPronosticos = new ListaPronosticos();
        System.out.println(listaPronosticos);
        System.out.println("mi busqueda = " + listaPronosticos.getPronostico(2));
    }
}
