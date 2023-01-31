package Capítulo2;

import java.util.Scanner;

public class Revés {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int num, u, d, c, um, dm; //unidades, decenas, centenas, unidades de millar, decenas de millar

        System.out.println("Introduce un número entre 0 y 99.999:");
        num = sc.nextInt();
        sc.close();

        if (num <0 || num > 99999){
            System.out.println("Número no válido.");
        } else{
            dm = (num / 10000);
            num = (num % 10000);

            um = (num / 1000);
            num = (num % 1000);

            c = (num / 100);
            num = (num % 100);

            d = (num / 10);
            num = (num % 10);

            u = (num / 1);
            num = (num % 1);

            if (dm == 0){
                if (um == 0){
                    if (c == 0){
                        if (d == 0){
                            System.out.println("El número invertido es:\n" + u);

                        } else{
                            System.out.println("El número invertido es:\n" + u+d);

                        }
                    } else {
                        System.out.println("El número invertido es:\n" + u+d+c);

                    }
                } else{
                    System.out.println("El número invertido es:\n" + u+d+c+um);

                }
            } else{
                System.out.println("El número invertido es:\n" + u+d+c+um+dm);

            }


        }
    }
    
}
