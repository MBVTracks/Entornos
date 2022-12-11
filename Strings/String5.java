package Strings;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        //Programa que convierte un texto en minusculas a mayusculas.
        String fraseMinus = new String();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        fraseMinus = lector.nextLine();
        System.out.println(fraseMinus.toUpperCase());
        lector.close();
    }
}
