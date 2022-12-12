package Strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        /*2.	Hacer un menú que permita al usuario conocer el uso de 5 métodos de la clase StringBuffer.
        El programa debe dar la opción 6 para poder salir del mismo. */
        int opcion;
        StringBuffer frase = new StringBuffer("Hola");
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduzca una opcion para conocer los metodos de la clase \"StringBuffer\": \n1. Append. \n2. Capacity. \n3. codePointAt. \n4. Delete. \n5. Reverse. \n6. Salir.");
            opcion = lector.nextInt();
            if (opcion == 1){
                // Añade contenido al final del StringBuffer.
                frase.append(" de");
                frase.append(" nuevo.");
                System.out.println(frase);
            }if (opcion == 2){
                // Permite encontrar el espacio total de memoria que esta se encuentra dentro del objeto StringBuffer.
                System.out.println(frase.capacity());
            }if (opcion == 3){
                // Devuelve el valor del caracter (ASCII), del indice especificado.
                System.out.println("El caracter de la posicion 4 es: " + frase.codePointAt(3));
            }if (opcion == 4){
                // Elimina los valores de los caracteres seleccionados mediante un indice de inicio y fin.
                System.out.println(frase.delete(1,3));
            }if (opcion == 5){
                // Imprime la secuencia comenzando desde el final.
                System.out.println(frase.reverse());
            }if (opcion == 6){
                // Salida.
                System.out.println("Adios!");
            }
        }while(opcion !=6);
    }
}
