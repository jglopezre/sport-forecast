/*
Clase ListaEquipos para el ejercicio 6_3
 */
package com.mycompany.sportforecast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEquipos {
    // atributo
    private List<Equipo> equipos;
    private String defaultFile = "./csvFiles/equipos.csv";
    private String nombreArchivo;

    // constructores
    public ListaEquipos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public ListaEquipos() {
        this.nombreArchivo = this.defaultFile;
        equipos = readEquiposFile(nombreArchivo);
    }
    
    //set y get
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    // add y remove elementos
    public void addEquipo(Equipo e) {
        this.equipos.add(e);
    }
    public void removeEquipo(Equipo e) {
        this.equipos.remove(e);
    }

    @Override
    public String toString() {
        return "ListaEquipos{" + "equipos=" + equipos + '}';
    }

    public String listar() {
        String lista = "";
        for (Equipo equipo: equipos) {
            lista += "\n" + equipo;
        }           
        return lista;
    }
    
    private List<Equipo> readEquiposFile(String file) {
        String[] equiposArray;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("\n");
            sc.next();  //Jump Colums Names Row
            
            while(sc.hasNext()){
                equiposArray = sc.next().split(",");
                equipo = new Equipo(
                        Integer.parseInt(equiposArray[0]),
                        equiposArray[1],
                        equiposArray[2]
                );
                equipos.add(equipo);
            }
        } catch(IOException exception) {
            System.out.println("Mensaje " + exception.getMessage());
        }
        return equipos;
    }
    
    public Equipo getEquipo (int idEquipo) {
        Equipo found = null;
        for (Equipo equipo : this.getEquipos()) {
            if (equipo.getIdEquipo() == idEquipo) {
                found = equipo;
                break;
            }
        }
        return found;
    }
}
