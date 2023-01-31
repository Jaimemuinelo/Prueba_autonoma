package Capítulo7;
import java.util.Scanner;
/*Función que indique si un número es o no primo */
public class Primo {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.println("Introduzca un número para saber si es primo:");
        n = sc.nextInt();
        sc.close();

        primo(n);
    }

    static void primo(int n){
        boolean primo = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                primo=false;
            }
        }
        if(primo==true){
            System.out.println("El número "+n+" es primo.");
        } else{
            System.out.println("El número "+n+" NO es primo.");
        }
    }
    
}
