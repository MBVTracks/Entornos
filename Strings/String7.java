package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        //Programa que ordene por orden alfabetico varias palabras.
        Scanner lector = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduzca el numero de palabras que desea ordenar alfabeticamente: ");
        num = lector.nextInt();
        String palabra[] = new String[num];
        String orden[] = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Introduzca palabra: ");
            palabra[i] = lector.next();
        }
        Arrays.sort(palabra);
        System.out.print(Arrays.toString(palabra));

    }
}
