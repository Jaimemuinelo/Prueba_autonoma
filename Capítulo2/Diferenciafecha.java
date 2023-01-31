package Capítulo2;

import java.util.Scanner;

public class Diferenciafecha {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int d1, m1, a1, d2, m2, a2;
        int fecha1, fecha2, diferencia;
        int dF, mF, aF;

        System.out.print("Introduzca la primera fecha.");
        System.out.println(" Día:");
        d1 = sc.nextInt();

        System.out.println("Mes:");
        m1 = sc.nextInt();

        System.out.println("Año:");
        a1 = sc.nextInt();

        System.out.print("Introduzca la segunda fecha.");
        System.out.println(" Día:");
        d2 = sc.nextInt();

        System.out.println("Mes:");
        m2 = sc.nextInt();

        System.out.println("Año:");
        a2 = sc.nextInt();

        sc.close();

        if (d1<1 || d1>30 || m1>12 || m1<1 || d2<1 || d2>30 || m2>12 || m2<1){
            System.out.println("Alguna de las fechas introducidas es incorrecta.");
        } else {
            fecha1 = d1 + (m1-1)*30 + (a1-1)*30*12;
            fecha2 =  d2 + (m2-1)*30 + (a2-1)*30*12;
            if (fecha1 >= fecha2){
                diferencia = (fecha1 - fecha2);
            } else{
                diferencia = (fecha2 - fecha1);
            }
            aF = (diferencia / (30*12) );
            diferencia = (diferencia % (30*12));

            mF = diferencia / 30;
            dF = diferencia % 30;
            System.out.println("Entre la primera y segunda fecha hay una diferencia" +
            " de: " + dF +" días, "+mF+"meses y "+aF + "año/s");

        }
        /*Podemos operar utilizando meses y años como minutos y horas,
         * restando tan solo días. Contaremos sin tener en cuenta A.C
         */


    }
    
}
