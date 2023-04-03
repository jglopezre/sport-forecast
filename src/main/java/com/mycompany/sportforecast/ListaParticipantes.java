/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sportforecast;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javierl
 */
public class ListaParticipantes {
    private List<Participante> participantes;
    private String nombreArchivo;
    private String defaultFile = "./csvFiles/participantes.csv";
    
    public ListaParticipantes(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.participantes = readParticipanteFile(this.nombreArchivo);
    }
    
    public ListaParticipantes() {
        this.nombreArchivo = this.defaultFile;
        this.participantes = readParticipanteFile(this.nombreArchivo);
    }
    
    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
    
    public List<Participante> getParticipantes() {
        return this.participantes;
    }
    
    public void addParticipante(Participante participante) {
        this.participantes.add(participante);
    }
    
    public void removeParticipante(Participante participante) {
        this.participantes.remove(participante);
    }
    
    @Override
    public String toString() {
        return "Listar Participantes {" + "Participantes =" + participantes + "}";
    }
    
    public String Listar() {
        String list = "";
        for(Participante participante : this.participantes) {
            list += "\n" + participante;
        }
        
        return list;
    }
    
    private List<Participante> readParticipanteFile(String file) {
        String[] participantesArray;
        Participante participante;
        List<Participante> participantes = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File(file));
            sc.useDelimiter("\n");
            sc.next();  //Jump Colums Names Row
            while (sc.hasNext()) {                
                participantesArray = sc.next().split(",");
                participante = new Participante(
                        Integer.parseInt(participantesArray[0]),
                        participantesArray[1]
                );
                participantes.add(participante);
            }
        }
        catch(IOException exception) {
            System.out.println("Mensaje" + exception.getMessage());
        }
        
        return participantes;
    }
    
    public Participante getParticipante (int id) {
        Participante found = null;
        for (Participante participante : this.getParticipantes()) {
            if (participante.getIdParticipante() == id) {
                found = participante;
                break;
            }
        }
        return found;
    }
}