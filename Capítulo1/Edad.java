package Capítulo1;

import java.util.Scanner;

public class Edad {
    public static void main (String args[]){

        int año, nacimiento, edad; //declaración de variables
        Scanner sc = new Scanner(System.in); //creo el scanner

        System.out.println("Introduzca el año en el que se encuentre:"); //pido el año
        año = sc.nextInt();

        System.out.println("Introduzca el año de nacimiento:");
        nacimiento = sc.nextInt();

        edad = año-nacimiento;
        System.out.println("Su edad es de " + edad + " años.");

        sc.close();

    }
    
}
