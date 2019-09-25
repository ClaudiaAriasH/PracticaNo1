/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1.agenda;

/**
 *
 * @author 19H1
 */
public class Agenda {

    private Contacto[] arrayContactoInfo;

    //Constructor 
    public Agenda() {
        this.arrayContactoInfo = new Contacto[15];
    }

    /**
     * Agrega un contacto a la agenda teniendo en cuenta, si no puede agregar
     * más a la agenda debe de informar al usuario “AGENDA SIN ESPACIO” y no se
     * pueden duplicar nombres en la agenda.
     *
     * @param c es el contacto a agendar en la agenda con su información
     */
    public void agregarContacto(Contacto c) {

        if (!agendaLlena()) {
            System.err.println("AGENDA SIN ESPACIO");
        } else if (buscarContacto(c.getNombre())) {
            System.out.println("El contacto " + c.getNombre() + " ya existe en la agenda");
        } else {

            for (int i = 0; i < arrayContactoInfo.length; i++) {
                if (arrayContactoInfo[i] == null) {
                    arrayContactoInfo[i] = c;
                    System.out.println("Contacto agregado");
                    break;
                }
            }
        }
    }

    /**
     * Valida si existe o no el nombre de un contacto en la agenda.
     *
     * @param nombre es el contacto a buscar en la agenda
     * @return retorna si existe o no en la genda
     */
    public boolean buscarContacto(String nombre) {

        boolean existe = false;

        for (int i = 0; i < arrayContactoInfo.length; i++) {
            if (arrayContactoInfo[i] != null) {
                if (arrayContactoInfo[i].getNombre().equals(nombre.trim())) {
                    existe = true;
                }
            }

        }

        return existe;
    }
    /*
     Lista todos los contactos de la agenda.

     */

    public void listarContactos() {
        for (int i = 0; i < arrayContactoInfo.length; i++) {
            System.out.println(arrayContactoInfo[i]);

        }

    }

    /*
     Me indica si la agenda ya esta llena o no
     */
    public Boolean agendaLlena() {
        boolean estado = false;
        for (int i = 0; i < arrayContactoInfo.length; i++) {
            if (arrayContactoInfo[i] == null) {
                estado = true;
            }
        }
        return estado;
    }

    /*
     Me indica cuantos espacios libres hay en la agenda.
     */
    public void espacioLibre() {

        int cont = 0;
        for (int i = 0; i < arrayContactoInfo.length; i++) {
            if (arrayContactoInfo[i] == null) {
                cont = cont + 1;
            }
        }

        System.out.println("Hay " + cont + " espacios libres en la agenda telefónica");
        cont = 0;
    }

}
