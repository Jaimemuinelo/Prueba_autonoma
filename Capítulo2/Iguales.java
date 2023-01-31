package Capítulo2;

import java.util.Scanner; 

public class Iguales {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        int n1, n2;

        System.out.println("Introduzca un número: ");
        n1 = sc.nextInt();

        System.out.print("\nIntroduzca el segundo número:\n");
        n2 = sc.nextInt();
        sc.close();

        if (n1 == n2) {
            System.out.println( "Los números introducidos son iguales.");
        } else {
            System.out.println("Los números introducidos son distintos.");
        }



    }
    
}
