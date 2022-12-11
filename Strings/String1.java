package Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        /*1.	Hacer un menú que permita al usuario conocer el uso de 10 métodos de la clase String.
        El programa debe dar la opción 11 para poder salir del mismo.*/
        int opcion;
        String frase = new String();
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduzca una opcion para conocer los distintos metodos de la clase \"String\": \n1. Metodo Length. \n2. Metodo charAt. \n3. Metodo subString. \n4. Metodo toUpperCase. \n5. Metodo indexOff. \n6. Metodo equals. \n7. Metodo equalsIgnoreCase. \n8. Metodo trim. \n9. Metodo endsWith \n10. Metodo compareTo. \n11. Salir.");
            opcion = lector.nextInt();
            if (opcion ==1) {
                System.out.println("Metodo que nos permite conocer la longitud de una cadena de caracteres (string). \nIntroduce frase:");
                frase = lector.next();
                System.out.println("La palabra \"" + frase + "\" , tiene " + frase.length() + " caracteres.");
                lector.nextLine();
            }if (opcion == 2){
                System.out.println("Muestra que caracter se encuentra en la posición solicitada entre parentesis. \nIntroduce frase:");
                frase = lector.next();
                System.out.println("El caracter solicitado de la posicion 3 es: " + "\""+ frase.charAt(2) +"\"");
                lector.nextLine();
            }if (opcion == 3){
                System.out.println("Devuelve una subcadena que se encuentra entre los valores de n1 y n2-1. \nIntroduce una frase:");
                frase = lector.next();
                System.out.println("La subcadena es: " + "\"" + frase.substring(4,10) + "\"");
                lector.nextLine();
            }if (opcion == 4){
                System.out.println("Convierte toda la frase de la cadena a mayusculas. \nIntroduce una frase:");
                frase = lector.next();
                System.out.println("La frase convertida en mayusculas es: \n" + frase.toUpperCase());
                lector.nextLine();
            }if (opcion == 5){
                System.out.println("Devuelve la posicion de un caracter especifico en la frase. \nIntroduce tu correo electronico: ");
                frase = lector.next();
                int posicion = frase.indexOf("@");
                System.out.println("La posicion del @ en tu correo es: " + posicion);
                lector.nextLine();
            }if (opcion == 6){
                System.out.println("Compara dos cadenas y nos informa si son o no iguales mediante la palabra \"True\". \nIntroduca una frase: ");
                frase = lector.next();
                String frase2 = lector.next();
                if (frase.equals(frase2))
                    System.out.println("La dos frases son iguales.");
                else
                    System.out.println("Las dos frases NO son iguales.");
                lector.nextLine();
            }if (opcion == 7){
                System.out.println("Compara si una primera frase es igual a una segunda, sin tener en cuenta mayusculas. \nIntroduzca frase:");
                frase = lector.next();
                String frase2 = lector.next();
                if (frase.equalsIgnoreCase(frase2))
                    System.out.println("Las dos frases son iguales.");
                else
                    System.out.println("Las dos frases NO son iguales.");
                lector.nextLine();
            }if (opcion == 8){
                System.out.println("Devuelve una copia de la frase y elimina los espacios en blanco (si los hubiera) de los extremos de la frase, pero no afecta a los espacios intermedios de esta. \nIntroduzca una frase: ");
                frase = lector.next();
                System.out.println(frase.trim());
                lector.nextLine();
            }if (opcion == 9){
                System.out.println("Comprueba si la frase termina con un sufijo especifico. \nIntroduzca frase: ");
                frase = lector.next();
                System.out.println(frase.endsWith("037"));
                lector.nextLine();
            }if (opcion == 10){
                System.out.println("Comprueba la igualdad entre dos frases introducidas. Si son iguales devuelve como dato un 0. Si es alfabeticamente menor la primera cadena sobre la segunda, " +
                        "se devolvera un <0 y si es mayor alfabeticamente, se devolvera un >0. \nIntroduzca una frase: ");
                frase = lector.next();
                System.out.println("Introduzca otra frase: ");
                String frase2 = lector.next();
                System.out.println(frase.compareTo(frase2));
                lector.nextLine();
            }if (opcion == 11){
                System.out.println("Adios!");
                lector.close();
            }
        }while(opcion !=11);
    }
}
