# PracticaNo1
PROGRAMA DE CUENTAS
Crear una clase llamada Cuenta que tendrá los siguientes atributos:
1. Nombre del titular.
2. Saldo
El nombre del titular de la cuenta es obligatorio y el saldo es opcional por lo tanto debe de
crear dos constructores de la clase.
a. Constructor con el titular de la cuenta
b. Constructor con el titular y el saldo de la cuenta.
El objetivo de esta cuenta es ingresar y retirar una cantidad monetaria a la cuenta por lo tanto
se piden realizar los siguientes métodos:
a. ingresar(double cantidad): Este método recibe una cantidad como parámetro el cual
sumara a la cuenta actual. Si la cantidad en negativa no debe de sumar nada.
b. retirar(double cantidad): Este método recibe una cantidad como parámetro el cual
restara a la cuenta actual. Si la cantidad a retirar es mayor a la cantidad actual no se
puede restar y debe de sacar un mensaje de “SALDO INSUFICIENTE”.
PROGRAMA DE AGENDA TELEFÓNICA
Realizar una agenda telefónica de 15 contactos, para esto debe de tener en cuenta:
1. Un contacto tiene los atributos de (Nombre, teléfono y correo)
2. Un contacto es igual a otro cuando su nombre es igual.
Las funcionalidades de la agenda son las siguientes:
1. agregarContacto(Contacto c): Agrega un contacto a la agenda teniendo en cuenta, si no
puede agregar más a la agenda debe de informar al usuario “AGENDA SIN ESPACIO” y no
se pueden duplicar nombres en la agenda.
2. buscarContacto(String nombre): Valida si existe o no el nombre de un contacto en la
agenda.
3. listarContactos(): Lista todos los contactos de la agenda.
4. agendaLlena(): Me indica si la agenda ya esta llena o no.
5. espacioLibre(): Me indica cuantos espacios libres hay en la agenda.
Se debe de crear un menú con opciones por consola para probar las funcionalidades, con un
while.
Por ejemplo:
“Ingrese una opción:”
A) Para agregar un contacto
B) Para buscar contacto.
C) Listar agenda.
D) Ver si la agenda esta llena.
E) Ver espacios libres de la agenda
S) Para salir del programa
