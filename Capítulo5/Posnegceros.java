package Capítulo5;

import java.util.Scanner;
//Leer 5 nums por teclado y hacer media de positivos, negativos y contar ceros.
public class Posnegceros {
    public static void main (String args[]){
        double mediaPos, mediaNeg;
        int ceros, sumapos, sumaneg, contadorP, contadorN;
        int t[] = new int[5];
        Scanner sc = new Scanner (System.in);

        ceros = 0;
        sumapos = 0;
        sumaneg = 0;
        contadorP = 0;
        contadorN = 0;

        for (int i=0; i<=4; i++){
            System.out.println("Introduzca un número:");
            t[i] = sc.nextInt();
        }

        for (int i=0; i<=4; i++){
            if (t[i] == 0){
                ceros++;
            } else if (t[i]>0){
                sumapos = t[i]+ sumapos;
                contadorP++;
            } else{
                sumaneg = t[i] + sumaneg;
                contadorN++;
            }

        }

        if (contadorP == 0){
            System.out.println("La media de los positivos no se puede realizar.");
        } else{
            mediaPos = (double) sumapos / contadorP;
            System.out.println("La media de los positivos es: " +mediaPos);
        }

        if (contadorN == 0){
            System.out.println("La media de los negativos no se puede realizar.");
        } else{
            mediaNeg = (double) sumaneg / contadorN;
            System.out.println("La media de los negativos es: " +mediaNeg);
        }

        System.out.println("El número de ceros es de: " +ceros);
        sc.close();
        

    }
    
}
