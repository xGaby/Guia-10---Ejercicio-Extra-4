/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleado;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class EmpleadoServicio extends PersonaServicio {

    private final Scanner entrada;
    //private ArrayList<Persona> empleados;

    public EmpleadoServicio() {
        super.personas = new ArrayList<>();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public Empleado crearEmpleado() {

        //ServicioPersona s1 = new PersonaServicio();
        //Persona p1 = s1.crearPersona();
        Persona p1 = super.crearPersona();

        System.out.print("Ingrese su año de incorporación: ");
        int año = entrada.nextInt();

        System.out.print("Ingrese su número de despacho: ");
        int despacho = entrada.nextInt();

        Empleado ep1 = new Empleado(año, despacho, p1.getNombre(), p1.getApellidos(), p1.getCedula(), p1.getEstadoCivil());

        return ep1;
    }

    public void agregarEmpleado(Empleado ep) {

        super.personas.add(ep);

    }

    public void mostrarEmpleados() {

        System.out.println("Los empleados actuales son: ");
        for (Persona aux : super.personas) {
            System.out.println(aux.toString());

        }
    }

    public void fabricaEmpleados() {

        System.out.println("Ingrese el estudiante.");
        Empleado empleadoCreado = crearEmpleado();
        agregarEmpleado(empleadoCreado);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo estudiantes: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarEmpleado(crearEmpleado());
            } else {
                bandera = true;
            }

        }

    }

}
