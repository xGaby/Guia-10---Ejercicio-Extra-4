/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class PersonaServicio {

    protected Scanner entrada;
    protected ArrayList<Persona> personas;

    public PersonaServicio() {
        this.personas = new ArrayList();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public Persona crearPersona() {

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.next();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.next();

        System.out.print("Ingrese su cedula: ");
        String cedula = entrada.next();

        System.out.print("Ingrese su estado civil : ");
        String estadoCivil = entrada.next();

        Persona p = new Persona(nombre, apellido, cedula, estadoCivil);
        agregarPersona(p);

        return p;

    }

    public void agregarPersona(Persona p) {

        personas.add(p);

    }

    public void cambiarEstadoCivil() {

        System.out.println("Ingrese el nombre de la persona a cambiar: ");
        String nombreBuscar = entrada.next();
        System.out.println("Ingrese su nuevo estado civil: ");
        String estadoCivil = entrada.next();
        for (Persona aux : personas) {
            if (aux.getNombre().equals(nombreBuscar)) {
                aux.setEstadoCivil(estadoCivil);
            }
        }

    }

    public void mostrarPersonas() {

        System.out.println("Las personas actuales son: ");
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
    }

}
