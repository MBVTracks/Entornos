package Strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        /*4.	Entrar una serie de caracteres en una tabla, y mirar si esta es un “palíndromo” o no lo es.
        Un palíndromo son aquellas palabras que se leen igual de izquierda a derecha que de derecha a izquierda,
        por ejemplo ALLA.*/
        String palindromo = new String();
        String reverso = new String();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce palabra para saber si es palindromo:");
        palindromo = lector.next();
        lector.nextLine();
        for (int i = palindromo.length()-1; i >= 0 ; i--) {
            reverso += palindromo.charAt(i);
        }
        if (palindromo.equalsIgnoreCase(reverso))
            System.out.println("La palabra " + palindromo + " es palindromo ya que se lee igual de derecha a izquierda y viceversa.");
        else
            System.out.println("La palabra " + palindromo + " NO es palindromo puesto que no se lee igual de derecha a izquierda y viceversa.");
    }
}
