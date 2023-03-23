/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class Persona {

    protected String nombre;
    protected String apellidos;
    protected String cedula;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String cedula, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }

//    public void cambiarEstadoCivil() {
//        System.out.println("Ingrese su nuevo estado civil: ");
//        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
//        estadoCivil = entrada.next();
//    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", cedula=" + cedula + ", estadoCivil=" + estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
}
