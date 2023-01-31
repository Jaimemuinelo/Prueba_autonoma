package Capítulo3;

import java.util.Scanner;

public class Posneg {
    public static void main (String args[]){
       int num;
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Introduzca un número:");
       num = sc.nextInt();

       while(num != 0){
        if (num > 0 ){
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }
        System.out.println("Introduzca otro número:");
        num = sc.nextInt();
       }
       sc.close();

    }
    
}
