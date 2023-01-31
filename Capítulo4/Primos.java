package Capítulo4;

import java.util.Scanner;

public class Primos {
    public static void main (String args[]){
        int n, contPrimos, j;
        Scanner sc = new Scanner (System.in);
        boolean primo;

        contPrimos = 0;
        System.out.println("Introduce un número:");
        n = sc.nextInt();


        //Procesamos los números entre 1 y n
        for (int i =1; i<=n; i++){
            primo = true; //Suponemos inicialmente que i es primo
            j = 2; //j tiene los valores entre 2 y i-1
            while ( j <= i -1 && primo == true){
                if ( i % j == 0){
                    primo = false;
                }
                j++;
            }
            if (primo){ // si es primo
                contPrimos++; // se añade un primo al contador
                System.out.println(i + (" es primo"));
            }
        }
        System.out.println("En el rango 1.." + n + ", hay "
        + contPrimos+ " números primos");
        sc.close();
    }
    
}
