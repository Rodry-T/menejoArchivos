/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenarchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RODRIGO
 */
public class Operaciones {

    private Doctor doctor;
    private Hospital hos;
    private List<Hospital> Lista;
    Scanner leer = new Scanner(System.in);

    public Operaciones() {
        Lista = new ArrayList<>();
    }

    //CREANDO UN ARCHIVO
    public void crearDirectorio() {
        Path path = Paths.get("E:\\PROGRAIII");
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("directorio creado");
            } else {
                System.out.println("Ya existe el directorio");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo() {
        Path path = Paths.get("E:\\PROGRAIII\\archivoHospital.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("El archivo se creo correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
        }
    }

    //guardando la listacliente dentro del archivo creado con anterioridad
    public void guardarObjetos() {
        String ruta = "E:\\PROGRAIII\\archivoHospital.txt";
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(archivo);
            oos.writeObject(Lista);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //cargamos los datos del archivo a un list<Cliente>
    public void leeer() {
        String ruta = "E:\\PROGRAIII\\archivoHospital.txt";
        try {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(archivo);
            if (ois != null) {
                Lista = (List<Hospital>) ois.readObject();
            } else {
                System.out.println("El objeto es nulo");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CrearHospital() {
        Hospital hos = new Hospital();
        String res = "s";
        System.out.println("Digite nombre del Hospital");
        hos.setNombreH(leer.nextLine());
        System.out.println("Digite Direccion del Hospital");
        hos.setDireccion(leer.nextLine());
        System.out.println("Digite Nivel del Hospital");
        hos.setNivel(leer.nextInt());
        while (res.equalsIgnoreCase("s")) {
            doctor = new Doctor();
            doctor.Llenar();
            hos.AdicionarDoc(doctor);
            leer.nextLine();
            System.out.println("Desea seguir registrando clientes S/N");
            res = leer.nextLine();
        }
        Lista.add(hos);

        System.out.println("DATOS REGISTRADOS");
    }

    public void mostrarHospital() {
        if (Lista != null) {
            System.out.println("--- HOSPITAL ---");
            for (Hospital hopital : Lista) {
                hopital.mostrarHospital();
            }
        }
    }

    public void BuscarEspecialidad(String es) {
        int sw = 0;
        if (Lista != null) {
            System.out.println("--- HOSPITAL ---");
            for (Hospital hospital : Lista) {
                if (hospital.getListaDoctor() != null) {
                    for (Doctor e : hospital.getListaDoctor()) {
                        if (e != null) {
                            if (e instanceof Doctor) {
                                Doctor lib = (Doctor) e;
                                if (es.equalsIgnoreCase(lib.getEspecialidad())) {
                                    lib.Mostrar();
                                    sw = 1;
                                }
                            }

                        }
                    }
                }

            }
            if (sw == 0) {
                System.out.println("LA ESPECIALIDAD NO EXISTE");
            }
        }

    }

    public void Buscar() {

        if (Lista != null) {
            System.out.println("--- HOSPITAL ---");
            System.out.println("Digite");
            String ar = leer.nextLine();
            for (Hospital hopital : Lista) {

                hopital.BuscarEspecialidaddos(ar);
            }
        }

    }

}
