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
public class Empleado extends Persona {

    protected int año;
    protected int despacho;

    public Empleado(int año, int despacho, String nombre, String apellidos, String cedula, String estadoCivil) {
        super(nombre, apellidos, cedula, estadoCivil);
        this.año = año;
        this.despacho = despacho;
    }

    @Override
    public String toString() {

        return super.toString() + ", año=" + año + ", despacho=" + despacho;
    }
    
    public void cambioDespacho(){
        System.out.println("Ingrese su nuevo despacho: ");
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        despacho = entrada.nextInt();
        
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    

}
