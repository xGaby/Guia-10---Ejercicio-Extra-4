/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleado;
import Entidades.PersonalServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class PersonalServicioServicio extends EmpleadoServicio {

    private final Scanner entrada;
    private ArrayList<PersonalServicio> persServicios;

    public PersonalServicioServicio() {
        this.persServicios = new ArrayList();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public PersonalServicio crearPersonalS() {

        //ServicioPersona s1 = new ServicioPersona();
        //Persona p1 = s1.crearPersona();
        Empleado ep1 = super.crearEmpleado();

        System.out.print("Ingrese su seccion: ");
        String seccion = entrada.next();

        PersonalServicio ps1 = new PersonalServicio(seccion, ep1.getAño(), ep1.getDespacho(),
                ep1.getNombre(), ep1.getApellidos(), ep1.getCedula(), ep1.getEstadoCivil());

        return ps1;
    }

    public void agregarPersonalS(PersonalServicio ps1) {

        persServicios.add(ps1);

    }

    public void mostrarPersonalS() {

        System.out.println("El personal de servicio actual es: ");
        for (PersonalServicio aux : persServicios) {
            System.out.println(aux.toString());

        }
    }

    public void fabricaPersonalS() {

        System.out.println("Ingrese el personal de servicio.");
        PersonalServicio personalCreado = crearPersonalS();
        agregarPersonalS(personalCreado);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo personal: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarPersonalS(crearPersonalS());
            } else {
                bandera = true;
            }

        }

    }
}
