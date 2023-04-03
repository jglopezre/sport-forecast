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
public class ListaPronosticos {
    private List<Pronostico> pronosticos;
    private String defaultFile = "./csvFiles/pronosticos.csv";
    private String nombreArchivo;
    
    public ListaPronosticos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        pronosticos = this.cargarDeArchivo(this.nombreArchivo);
    }
    
    public ListaPronosticos() {
        this.nombreArchivo = this.defaultFile;
        pronosticos = this.cargarDeArchivo(this.nombreArchivo);
    }
    
    public List<Pronostico> getPronosticos() {
        return pronosticos;
    } 
    
    public void setPronostico(List<Pronostico> pronosticosList) {
        this.pronosticos = pronosticosList;
    }
    
    public void addPronostico(Pronostico pronostico) {
        this.pronosticos.add(pronostico);
    }
    
    public void removePronostico(Pronostico pronostico) {
        this.pronosticos.remove(pronostico);
    }
    
    public String toString() {
        return "Listar Pronosticos {" + "Pronostico = " + this.pronosticos + "}";
    }
    
    public String Listar() {
        String lista = "";
        for(Pronostico pronostico : this.pronosticos){
            lista += "\n" + pronostico;
        }
        return lista;
    }
    
    private List<Pronostico> cargarDeArchivo(String file) {
        String[] pronosticosArray;
        Pronostico pronostico;
        List<Pronostico> pronosticos = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("\n");
            sc.next();
            
            while(sc.hasNext()) {
                pronosticosArray = sc.next().split(",");
                pronostico = new Pronostico(
                        Integer.parseInt(pronosticosArray[0]),
                        Integer.parseInt(pronosticosArray[1]),
                        Integer.parseInt(pronosticosArray[2]),
                        Integer.parseInt(pronosticosArray[3]),
                        pronosticosArray[4].charAt(1)
                );
                pronosticos.add(pronostico);
            }
        }
        catch(IOException exception){
            System.out.println("Mensaje " + exception.getMessage());
        }
        
        return pronosticos;
    }
}
