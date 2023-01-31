package Capítulo3;

import java.util.Scanner;

public class Mediaposnegyceros {
    public static void main (String args[]){
        int n, sumapos, sumaneg, contpos, contneg, contceros;
        double mediaPos, mediaNeg;
        Scanner sc = new Scanner (System.in);

        sumapos = 0;
        sumaneg = 0;
        contpos = 0;
        contneg = 0;
        contceros = 0;

        for (int i=1 ; i<=10 ; i++){
            System.out.println("Introduce un número:");
            n = sc.nextInt();

            if (n == 0){
                contceros++;

            } else {
                if (n<0) {
                contneg++;
                sumaneg = sumaneg + n;
                } else {
                contpos++;
                sumapos = sumapos + n;
                }
            }

        }
        
        System.out.println("Se han recogido los siguientes datos:");
        System.out.println("Número de ceros introducidos: " +contceros);

        if (contpos == 0){
            System.out.println("No se puede hacer la media de los positivos.");
        } else {
            mediaPos = (double) sumapos / contpos;
            System.out.println("Media de números positivos: " + mediaPos);
        }

        if (contneg == 0){
            System.out.println("No se puede hacer la media de los negativos.");
        } else{
            mediaNeg = (double) sumaneg/contneg;
            System.out.println("Media de números negativos: " +mediaNeg);
        }
        sc.close();

    }
}
