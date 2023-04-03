/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javierl
 */
public class ListaPartidos {
    private List<Partido> partidos;
    String defaultFile = "./csvFiles/partidos.csv";
    String nombreArchivo;
    
    public ListaPartidos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.partidos = this.cargaDeArchivo(nombreArchivo);
    }
    
    public ListaPartidos() {
        this.nombreArchivo = this.defaultFile;
        this.partidos = this.cargaDeArchivo(nombreArchivo);
    }
    
    public List<Partido> getPartido() {
        return this.partidos;
    }
    
    public void setPartido(List<Partido> partidos) {
        this.partidos = partidos;
    }
    
    public void addPartido(Partido partido) {
        this.partidos.add(partido);
    }
    
    public void removePartido(Partido partido) {
        this.partidos.remove(partido);
    }
    
    @Override
    public String toString() {
        return "Listar Partidos { " + "Partidos = " + this.partidos + "}";
    }
    
    public String Listar() {
        String lista = "";
        for(Partido partido : this.partidos){
            lista += "\n" + partido;
        }
        return lista;
    }
    
    private List<Partido> cargaDeArchivo(String file) {
        String[] partidosArray;
        Partido partido;
        List<Partido> partidos = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("\n");
            sc.next();
            
            while(sc.hasNext()) {
                partidosArray = sc.next().split(",");
                partido = new Partido(
                    Integer.parseInt(partidosArray[0]),
                    Integer.parseInt(partidosArray[1]),
                    Integer.parseInt(partidosArray[2]),
                    Integer.parseInt(partidosArray[3]),
                    Integer.parseInt(partidosArray[4])
                );
                partidos.add(partido);
            }
        } 
        catch(IOException exception) {
            System.out.println("Mensaje" + exception.getMessage());
        }
        
        return partidos;
    }
}

