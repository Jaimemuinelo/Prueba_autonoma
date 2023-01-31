package Capítulo5;
import java.util.Scanner;
//Leer dos tablas de 10 números y mezclarlas (1A 1B 2A 2B...)
public class Mezclatablas {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int tA[] = new int[20];
        int tB[] = new int[10];
        int tC[] = new int[20];
        int pos = 0;

        System.out.println("Rellene la tabla A:");
        for (int i=0; i <=9; i++){
            System.out.println("Introduce la posición " + (i+1));
            tA[i] = sc.nextInt();
        }

        System.out.println("Rellene la tabla B:");
        for (int i=0; i <=9; i++){
            System.out.println("Introduce la posición " + (i+1));
            tB[i] = sc.nextInt();
        }
        
        for (int i=0; i<=19; i+=2){
            tC[i] = tA[pos];
            tC[i+1] = tB[pos];
            pos++;

        }

        for (int i=0; i<=19; i++){
            System.out.println(tC[i]);
        }
        sc.close();


    }
    
}
