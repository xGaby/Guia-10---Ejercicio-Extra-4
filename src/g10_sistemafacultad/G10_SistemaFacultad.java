/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10_sistemafacultad;

import Entidades.Estudiante;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Servicios.EstudianteServicio;
import Servicios.PersonaServicio;
import Servicios.PersonalServicioServicio;
import Servicios.ProfesorServicio;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class G10_SistemaFacultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
//        Estudiante e1 = new Estudiante("noveno", "gaby", "matinez", 
//                "11050", "soltera");
//        
//        Profesor p1 = new Profesor("mate", 2015, 5, "marco",
//                "cardenas", "1234", "soltero");
//        
//        PersonalServicio ps1 = new PersonalServicio("secretaria", 2013, 1, 
//                "susana", "armijos", "7897", "casada");
//        
//        System.out.println(e1.toString());
//        System.out.println(p1.toString());
//        System.out.println(ps1.toString());
//        
//        e1.cambiarEstadoCivil();
//        
//        System.out.println(e1.toString());
//        
//        EstudianteServicio es1 = new EstudianteServicio();
//        
//        Estudiante e3 = es1.crearEstudiante();
//        System.out.println(e3.toString());

        int opcionP;
        int opcion;
        EstudianteServicio es1 = new EstudianteServicio();
        ProfesorServicio pfs1 = new ProfesorServicio();
        PersonalServicioServicio ps1 = new PersonalServicioServicio();
        PersonaServicio p1 = new PersonaServicio();

        do {
            System.out.println("SISTEMA GESTION FACULTAD");

            System.out.println("---Menú Principal---");
            System.out.println("1. Agregar Personal (estudiantes, profesores, personal de servicio)");
            System.out.println("2. Cambiar de estado civil");
            System.out.println("3. Reasignar despacho a empleado");
            System.out.println("4. Matricular nuevo estudiante");
            System.out.println("5. Trasladar de sección a un empleado");
            System.out.println("6. Imprimir personal");
            System.out.println("7. Salir");
            System.out.print("Elija la opcion: ");

            opcionP = entrada.nextInt();

            switch (opcionP) {
                case 1:
                    do {

                        System.out.println("Seleccione la persona a ingresar: ");
                        System.out.println("1. Estudiante\t2. Profesor\t3.Personal Servicio\t4.Salir");
                        System.out.print("Opción... : ");

                        opcion = entrada.nextInt();

                        switch (opcion) {
                            case 1:
                                //Crear Estudiantes
                                es1.fabricaEstudiantes();
                                break;
                            case 2:
                                //Crear Profesores
                                pfs1.fabricaProfesores();
                                break;
                            case 3:
                                //Crear Personal Servicio
                                ps1.fabricaPersonalS();
                                break;
                            case 4:
                                System.out.println("Salir");
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } while (opcion != 4);

                    break;
                case 6:
                    System.out.println("Estudiantes: ");
                    es1.mostrarEstudiantes();
                    System.out.println("Profesores: ");
                    pfs1.mostrarProfesores();
                    System.out.println("Personal Servicio: ");
                    ps1.mostrarPersonalS();
                    break;

                case 2:
                    p1.cambiarEstadoCivil();
                    break;
                case 7:
                    System.out.println("Saliendo del Sistema...");
                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcionP != 7);
        
        
        
        //es1.fabricaEstudiantes();
        pfs1.fabricaProfesores();
        p1.mostrarPersonas();
        

    }

}
