/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Gabriela
 */
public class Estudiante extends Persona {

    private String curso;

    public Estudiante(String curso, String nombre, String apellidos, String cedula, String estadoCivil) {
        super(nombre, apellidos, cedula, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + ", curso=" + curso + '}';
    }

}
