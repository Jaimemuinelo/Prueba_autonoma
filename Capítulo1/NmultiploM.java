package Capítulo1;

import java.util.Scanner;

public class NmultiploM{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n, modulo, m;
        /*El objetivo es conseguir sumar un número a n para que sea divisible por m */

        System.out.println("Introduzca un número entero:");
        n = sc.nextInt();

        System.out.println("Introduzca de qué número ha de ser múltiplo:");
        m = sc.nextInt();

        modulo = n % m; //calculo el resto de la división entre n y m
        modulo = (modulo - m) % m;

        System.out.println("A "+ n +" debemos sumarle " + Math.abs(modulo) +
        " para que sea divisible por m.");

        sc.close();

    }
}