package Capítulo2;

import java.util.Scanner;

public class Múltiplo {
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        int n1, n2;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();

        System.out.println("Introduce un segundo número:");
        n2 = sc.nextInt();

        if (n1 % n2 == 0){
            System.out.println("El primer número(" +n1+") es múltiplo del segundo("+n2+")");
        } else {
            System.out.println("El primer número(" +n1+") NO es múltiplo del segundo("+n2+")");
        }
        sc.close();


    }
    
}
