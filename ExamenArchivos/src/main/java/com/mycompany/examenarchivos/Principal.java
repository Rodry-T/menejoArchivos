/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenarchivos;

import java.util.Scanner;

/**
 *
 * @author RODRIGO
 */
public class Principal {

    public static void main(String[] args) {
        int opc = 0;
        boolean continuar = true;
        Operaciones obj = new Operaciones();
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Crear archivo");
            System.out.println("2. Registrar Hospital");
            System.out.println("3. Guardar los registros");
            System.out.println("4. Mostrar Datos");
            System.out.println("5. Buscar Especialidad");
            System.out.println("7. salir");
            System.out.println("Digite una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.crearDirectorio();
                    obj.crearArchivo();
                    break;
                case 2:
                    leer.nextLine();
                    obj.CrearHospital();

                    break;
                case 3:
                    obj.guardarObjetos();
                    break;
                case 4:
                    obj.leeer();
                    obj.mostrarHospital();
                    break;
                case 5:
                    obj.leeer();
                    leer.nextLine();
                    System.out.println("Digite la especialidad a Buscar");
                    String es=leer.nextLine();
                    obj.BuscarEspecialidad(es);
                    break;
                case 6:
                    obj.leeer();
                    leer.nextLine();
                    
                    obj.Buscar();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
