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
public class Persona implements Serializable{
    static final long serialVersionUID=42L;
    private String Nombre;
    private String Paterno;
    private String Materno;
    
    public void Llenar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("******  Datos del Personales ******");
        System.out.println("Digite Nombre");
        this.Nombre=leer.nextLine();
        System.out.println("Digte Apelledo Paterno");
        this.Paterno=leer.nextLine();
        System.out.println("Digite Apellido Materno");
        this.Materno=leer.nextLine();
    }
    public void Mostrar(){
        System.out.println("===================");
        System.out.println("Datos del Personal");
        System.out.println("===================");
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Paterno: "+this.Paterno);
        System.out.println("Materno: "+this.Materno);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }
    
    
    
}
