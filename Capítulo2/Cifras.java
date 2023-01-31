package Capítulo2;

import java.util.Scanner;

public class Cifras {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.println("Introduce un número entre 0 y 9.999");
        num = sc.nextInt();
        sc.close();

        if (num < 0 || num > 9999){
            System.out.println("Número introducido no válido.");
        } else{
            if ( (num / 10) != 0){
                if ((num / 100) != 0){
                    if ((num / 1000) != 0){
                        System.out.println("Número de 4 cifras.");
                    } else{
                        System.out.println("Número de 3 cifras.");
                    }
                } else {
                    System.out.println("Número de 2 cifras.");
                }
            } else {
                System.out.println("Número de 1 cifra.");

                }

        }
    }
    
}
/* Las condiciones podían ser simplemente num < 10, num < 100... 
COMPLICACIÓN INNECESARIA
 */
