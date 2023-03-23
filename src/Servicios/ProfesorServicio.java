/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleado;
import Entidades.Persona;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class ProfesorServicio extends EmpleadoServicio {

    private final Scanner entrada;
    //private ArrayList<Persona> profesores;

    public ProfesorServicio() {
        super.personas = new ArrayList();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public Profesor crearProfesor() {

        //ServicioPersona s1 = new ServicioPersona();
        //Persona p1 = s1.crearPersona();
        Empleado ep1 = super.crearEmpleado();

        System.out.print("Ingrese su departamento: ");
        String departamento = entrada.next();

        Profesor pf1 = new Profesor(departamento, ep1.getAño(), ep1.getDespacho(),
                ep1.getNombre(), ep1.getApellidos(), ep1.getCedula(), ep1.getEstadoCivil());

        return pf1;
    }

    public void agregarProfesor(Profesor pf1) {

        super.personas.add(pf1);

    }

    public void mostrarProfesores() {

        System.out.println("Los profesores actuales son: ");
        for (Persona aux : super.personas) {
            System.out.println(aux.toString());

        }
    }

    public void fabricaProfesores() {

        System.out.println("Ingrese el profesor.");
        Profesor profesorCreado = crearProfesor();
        agregarProfesor(profesorCreado);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo profesores: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarProfesor(crearProfesor());
            } else {
                bandera = true;
            }

        }

    }

}
