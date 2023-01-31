package Capítulo3;

import java.util.Scanner;

public class Juegomayormenor {
    public static void main (String args[]){
        int n, num;
        Scanner sc = new Scanner (System.in);
        n = (int) (Math.random() *100 ) +1;

        System.out.println("Introduce un número entre 1 y 100");
        num= sc.nextInt();
        while (n != num){
            if (n > num){
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
            System.out.println("Introduce otro número:");
            num = sc.nextInt();

            }
            sc.close();
            System.out.println("¡Correcto!");
        
    }
    
}
