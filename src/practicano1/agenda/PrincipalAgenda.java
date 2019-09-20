/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1.agenda;

import java.util.Scanner;

/**
 *
 * @author 19H1
 */
public class PrincipalAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************** Programa de Agenda Telefónica**************************");

        Agenda agenda = new Agenda();
        Contacto contacto;

        System.out.println("\n" + "Ingrese una opción: A) Agregar contacto B) Buscar contacto C) Listar agenda D) Ver si la agenda está llena E) Ver espacios libres de la agenda S) Salir");
        String opcion = scanner.next();

        while (!opcion.equals("S")) {

            System.out.println("La opción seleccionada es: " + opcion);

            switch (opcion) {
                case "A":

                    
                    System.out.println("Ingrese el nombre");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el telefono");
                    String telefono = scanner.next();
                    System.out.println("Ingrese el correo");
                    String correo = scanner.next();
                    contacto = new Contacto(nombre, telefono, correo);
                    agenda.agregarContacto(contacto);

                    break;

                case "B":
                    System.out.println("Ingrese el nombre que desea buscar");
                    nombre = scanner.next();

                    if (agenda.buscarContacto(nombre)) {
                        System.out.println("El contacto existe la agenda");
                    } else {
                        System.out.println("No se encontró un contacto en la agenda con este nombre");
                    }
                    break;

                case "C":
                    agenda.listarContactos();
                    break;

                case "D":

                    if (agenda.agendaLlena() == true) {
                        System.out.println("Si hay espacio disponible en la agenda");
                    } else {
                        System.out.println("La agenda está llena");
                    }
                    break;

                case "E":
                    agenda.espacioLibre();
                    break;

                default:
                    opcion = "S";
            }

            System.out.println("Ingrese una opción: A) Agregar contacto B) Buscar contacto C) Listar agenda D) Ver si la agenda está llena E) Ver espacios libres de la agenda");
            opcion = scanner.next();
        }

    }
}
