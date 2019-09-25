/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1.cuenta;

import java.util.Scanner;

/**
 *
 * @author 19H1
 */
public class PrincipalCuenta {

    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("*************** Programa de Cuentas **************************");

        System.out.println("\n" + "Ingrese el nombre del titular de la cuenta");
        String titular = scanner.next();

        System.out.println("¿Desea ingresar saldo a la cuenta? S) SI  N) NO");
        String opcionSaldo = scanner.next();

        if (opcionSaldo.equals("S")) {
            System.out.println("Ingrese el saldo: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(titular, saldoInicial);
            menu(cuenta);
        } else {
            Cuenta cuenta2 = new Cuenta(titular);
            menu(cuenta2);
        }

    }

    /**
     * Permite seleccionar las opciones de operación que se pueden realizar
     * sobre la cuenta
     *
     * @param cuenta contiene los datos ingresados para realizar la operacion
     */
    public static void menu(Cuenta cuenta) {

        System.out.println("Ingrese una opción: A) Ingresar B) Retirar S) Salir");
        String opcion = scanner.next();

        while (!opcion.equals("S")) {

            if (opcion.equals("A")) {
                System.out.println("Ingrese la cantidad: ");
                double cantidadIngresar = scanner.nextDouble();

                cuenta.ingresar(cantidadIngresar);

            } else if (opcion.equals("B")) {
                System.out.println("Ingrese la cantidad a retirar: ");
                double cantidadRetirar = scanner.nextDouble();
                cuenta.retirar(cantidadRetirar);
            } else {
                opcion = "S";
            }

            System.out.println("Ingrese una opción: A) Ingresar B) Retirar S) Salir");
            opcion = scanner.next();

        }
    }
}
