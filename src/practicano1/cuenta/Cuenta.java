/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1.cuenta;

/**
 *
 * @author 19H1
 */
public class Cuenta {
//Atributos

    private String nombreTitular;
    private double saldo = 0;

    //Constructores
    public Cuenta(String nombreTitular) {
        this.nombreTitular = nombreTitular;

    }

    public Cuenta(String nombreTitular, double saldoCuenta) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoCuenta;

    }

    //Procedimientos
    /**
     * Ingresa dinero en la cuenta bancaria
     *
     * @param cantidad es la cantidad que se ingresa a la cuenta bancaria
     */
    public void ingresar(double cantidad) {

        if (cantidad < 0) {
            System.out.println("Ingreso una cantidad negativa, no se puede sumar a la cuenta");
        } else {
            this.saldo = this.saldo + cantidad;
            System.out.println(this.nombreTitular + " Su nuevo saldo es: " + this.saldo);

        }
    }

    /**
     * Retirar dinero de la cuenta bancaria
     *
     * @param cantidad es la cantidad que se va a retirar de cuenta
     */
    public void retirar(double cantidad) {
        System.out.println("La cantidad a retirar es: " + cantidad);
        if (cantidad > this.saldo) {
            System.err.println("SALDO INSUFICIENTE!!");
        } else {
            this.saldo -= cantidad;
            System.out.println(this.nombreTitular + " Su nuevo saldo es: " + this.saldo);
        }
    }

}
