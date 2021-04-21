/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenarchivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RODRIGO
 */
public class Hospital implements Serializable {

    static final long serialVersionUID = 44L;
    private String nombreH;
    private String Direccion;
    private int nivel;
    
    private List<Doctor> ListaDoctor;

    public Hospital() {
        ListaDoctor = new ArrayList<Doctor>();
    }
    
    public void mostrarHospital() {
        System.out.println("------- HOSPITAL ------");
        System.out.println("Nombre: " + this.nombreH);
        System.out.println("Direccion: " + this.Direccion);
        System.out.println("Nivel: " + this.nivel);

        if(ListaDoctor!=null){
            
            for(Doctor doc:ListaDoctor){
                System.out.println("--- DOCTOR ---");
                doc.Mostrar();
                
            }
            System.out.println("***********************************");
        } else {
            System.out.println("ERROR");
        }

    }

    public void AdicionarDoc(Doctor doc) {
        ListaDoctor.add(doc);
        System.out.println("DOCTOR ADICIONADO");
    }
    public void BuscarEspecialidaddos(String es) {
        int sw = 0;
        if(ListaDoctor!=null){       
            for(Doctor doc:ListaDoctor){
                System.out.println("--- DOCTOR ---");
                if (doc.getEspecialidad().equalsIgnoreCase(es)) {
                    doc.Mostrar();
                    sw=1;
                }
            }
            if (sw==0) {
                        System.out.println("no existe");
                    }
        } else {
            System.out.println("ERROR");
        }
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Doctor> getListaDoctor() {
        return ListaDoctor;
    }

    public void setListaDoctor(List<Doctor> ListaDoctor) {
        this.ListaDoctor = ListaDoctor;
    }
    
    

}
