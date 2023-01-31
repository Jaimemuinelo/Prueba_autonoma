package Capítulo5;
import java.util.Scanner;
//Leer 10 elementos, pedir una posición y eliminar el elemento de dicha posición
public class Borrado {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t[] = new int[10];
        int borrar;

        for(int i=0; i<10; i++){
            System.out.println("Introduce el elemento "+i);
            t[i] = sc.nextInt();
        }
        System.out.println("Introduce el índice del número a borrar (del 0 al 9)");
        borrar = sc.nextInt();
        sc.close();

        for(int i=borrar+1; i<10; i++){
            t[i-1] = t[i];
        }
        t[t.length-1]=0;

        for(int i=0; i<10; i++){
            System.out.print(t[i]+" ");
        }
        
    }
    
}
