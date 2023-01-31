package Capítulo2;

import java.util.Scanner;

public class Orden {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n1, n2, n3;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();

        System.out.println("Introduce un segundo número:");
        n2 = sc.nextInt();

        System.out.println("Introduzca un tercer número:");
        n3 = sc.nextInt();
        sc.close();

        if (n1 >= n2){
            if (n1>=n3){
                if (n2>=n3){
                    System.out.println(n1+ ">" + n2+ ">" + n3);
                } else{
                    System.out.println(n1+ ">" + n3+ ">" + n2);
                }
            } else{
                System.out.println(n3+ ">" + n1+ ">" + n2);
            }
        } else {
            if (n3 >= n2){
                System.out.println(n3 + ">" + n2 + ">" + n1);
            } else {
                if (n1 >= n3){
                    System.out.println(n2+ ">" + n1+ ">" + n3);
                } else{
                    System.out.println(n2+ ">" + n3+ ">" + n1);
                }
            }
        }
        /*El problema está resuelto de manera muy ilegible, se podía haber resuelto 
        del mismo modo pero utilizando AND para usar menos condicionales
         */

    }
    
}
