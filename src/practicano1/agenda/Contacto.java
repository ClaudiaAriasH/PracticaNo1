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
public class Contacto {

    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor
    public Contacto(String nombre, String telefono, String correo) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + ", Telefono:" + telefono + ", Correo:" + correo;
    }

}
