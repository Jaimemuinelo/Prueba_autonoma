package Capítulo5;
import java.util.Scanner;
//Leer 10 enteros y guardar en otra tabla primero pares y luego impares
public class Tablaparimpar {
    public static void main (String args[]){
        int t[] = new int[10];
        int c[] = new int[10];
        int j=0;
        Scanner sc = new Scanner (System.in);

        for(int i=0; i<=9; i++){
            System.out.println("Introduce el elemento de índice "+i);
            t[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<=9; i++){
            if(t[i]%2==0){
                c[j] = t[i];
                j++;
            }
        }
        for(int i=0; i<=9; i++){
            if(t[i]%2!=0){
                c[j] = t[i];
                j++;
            }
        }// en esta versión tengo en cuenta los valores introducidos y no su índice

        for(int i=0; i<=9; i++){
            System.out.print(c[i]+" ");
        }
    }
}

