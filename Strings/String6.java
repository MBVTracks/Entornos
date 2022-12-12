package Strings;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        /*6.	Hacer un programa que:
1.	Permita obtener la parte izquierda de una cadena de caracteres, indicando el número de caracteres que se desean
2.	Inicialice la cadena de caracteres a una cadena texto por ejemplo “HOLA MUNDO” y
extraiga los 7 primeros caracteres para comprobar que funciona
*/
        String cadena = new String();
        int num;
        char frase = ' ';
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        cadena = lector.nextLine();
        System.out.println("Introduzca el numero de caracteres que desea ver: ");
        num = lector.nextInt();
        lector.close();
        for (int i = 0; i <= num; i++) {
            frase = cadena.charAt(i);
            System.out.print(frase);
        }
        String cadena2 = "Hola mundo";
        System.out.println("\nLos 7 primeros caracteres de la frase " + cadena2 + " son: " + cadena.substring(0,7));
    }
}
