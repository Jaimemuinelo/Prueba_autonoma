package Capítulo4;

import java.util.Scanner;

public class Cuadrado {
    public static void main (String args []){
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca la longitud del lado:");
        n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
