/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Estudiante;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EstudianteServicio extends PersonaServicio {

    private final Scanner entrada;
    private ArrayList<Persona> estudiantes;

    public EstudianteServicio() {
        this.estudiantes = new ArrayList();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public Estudiante crearEstudiante() {

        //ServicioPersona s1 = new PersonaServicio();
        //Persona p1 = s1.crearPersona();
        Persona p1 = super.crearPersona();

        System.out.print("Ingrese su curso: ");
        String curso = entrada.next();

        Estudiante e1 = new Estudiante(curso, p1.getNombre(), p1.getApellidos(), p1.getCedula(), p1.getEstadoCivil());

        return e1;
    }

    public void agregarEstudiante(Estudiante a) {

        estudiantes.add(a);

    }

    public void mostrarEstudiantes() {

        System.out.println("Los alumnos actuales son: ");
        for (Persona aux : estudiantes) {
            System.out.println(aux.toString());

        }
    }

    public void fabricaEstudiantes() {

        System.out.println("Ingrese el estudiante.");
        Estudiante estudianteCreado = crearEstudiante();
        agregarEstudiante(estudianteCreado);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo estudiantes: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarEstudiante(crearEstudiante());
            } else {
                bandera = true;
            }

        }

    }
    
    
    

}
