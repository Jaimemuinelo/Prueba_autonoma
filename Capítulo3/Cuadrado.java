package Capítulo3;

import java.util.Scanner;

public class Cuadrado {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Introduce un número para saber su cuadrado:");
        num = sc.nextInt();

        while (num > 0){
            num = num * num;
            System.out.println(" El cuadrado es: " +num);
            System.out.println("Introduzca otro número");
            num = sc.nextInt();
        }
        sc.close();

        
    }
    
}
