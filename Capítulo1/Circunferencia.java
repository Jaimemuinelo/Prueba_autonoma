package Capítulo1;

import java.util.Scanner;

public class Circunferencia {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        double radio, longitud, area;

        System.out.println("Introduzca el radio de la circunferencia (en cm):");
        radio = sc.nextDouble();

        longitud = 2* Math.PI * radio;
        
        area = Math.PI * Math.pow(radio,2);

        System.out.println("La circunferencia de radio "+ radio+"cm tendrá una longitud de "
        + longitud+ "cm y un área de " + area);
        sc.close();

        double a;
        a=1/0;
        System.out.println(a);
    }
}
