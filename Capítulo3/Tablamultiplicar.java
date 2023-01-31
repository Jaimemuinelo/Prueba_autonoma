package Capítulo3;

import java.util.Scanner;

public class Tablamultiplicar {
    public static void main (String args[]){
        /*Suponemos que el número introducido está entre 0 y 10 siempre. */
        int num, producto;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número entre 0 y 10.");
        num = sc.nextInt();

        System.out.println("La tabla de multiplicar del número es: ");
        for (int i= 0; i <= 10; i++){
            producto = i * num;
            
            System.out.println(num + "x" + i + " = " + producto);
        }
        sc.close();

    }
    
}
