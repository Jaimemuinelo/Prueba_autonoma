package Capítulo1;

import java.util.Scanner;


public class Redondeo {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);

        double decimal;
        int num;

        System.out.println("Introduzca un número con un decimal");
        decimal = sc.nextDouble();
        num = (int) (decimal +0.5);
        System.out.println(num);

        sc.close();


    }
    
}
