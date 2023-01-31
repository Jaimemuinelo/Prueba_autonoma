package Capítulo3;

import java.util.Scanner;

public class Factorial { 
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num;
        int factorial = 1;

        System.out.println("Introduzca un número:");
        num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            factorial = i * factorial;


        }
        System.out.println("El factorial de " + num + " es: "+factorial);
        sc.close();

    }
    
}
