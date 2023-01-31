package Capítulo5;
import java.util.Scanner;
//Leer 5 números de forma crec, guardarlos en una tabla de tamaño 10. Leer número N e insertarlo
//para q la tabla siga ordenada
public class Inserciónordenada {
    public static void main (String args[]){
        int t[] = new int[10];
        Scanner sc = new Scanner (System.in);
        int n;

        System.out.println("Introduce 5 elementos en orden creciente.");
        for(int i=0; i<5; i++){
            System.out.println("Elemento de índice "+i);
            t[i] = sc.nextInt();
        }

        System.out.println("Introduzca el elemento N: ");
        n = sc.nextInt();
        sc.close();

        int i = 4;

        while (t[i]>n){
            t[i+1]=t[i];
            i--;
        }
        t[i+1] = n;
        

        for(i=0; i<6;i++){
            System.out.print(t[i]+ " ");
        }
    }
}
