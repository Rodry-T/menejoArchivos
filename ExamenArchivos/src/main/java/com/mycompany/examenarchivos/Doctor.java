/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenarchivos;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author RODRIGO
 */
public class Doctor extends Persona implements Serializable{
    static final long serialVersionUID=43L;
    private String Especialidad;
    private int NumMatricula;
    
    @Override
    public void Llenar(){
        super.Llenar();
        Scanner leer=new Scanner(System.in);
        System.out.println("******  Datos del Doctor ******");
        System.out.println("Digite su Especialidad");
        this.Especialidad=leer.nextLine();
        System.out.println("Digite su numero de matricula");
        this.NumMatricula=leer.nextInt();
        
    }
    @Override
    public void Mostrar(){
        super.Mostrar();
        System.out.println("Especialidad: "+this.Especialidad);
        System.out.println("Numero de matricula: "+this.NumMatricula);
        System.out.println("·····························");
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getNumMatricula() {
        return NumMatricula;
    }

    public void setNumMatricula(int NumMatricula) {
        this.NumMatricula = NumMatricula;
    }
    
}
