package Capítulo5;
import java.util.Scanner;
//Leer 8 elementos en una tabla de 10, pedir un número y una posición e insertarlo en ese punto
public class Insertar {
    public static void main (String args []){
        int t[] = new int[10];
        int num, pos;
        Scanner sc = new Scanner (System.in);
        
        for(int i= 0; i<8; i++){
            System.out.println("Introduce el elemento de índice " + i);
            t[i] = sc.nextInt();
        }

        for(int i=0; i<2; i++){
            System.out.println("Introduce el número que quiera insertar:");
            num = sc.nextInt();

            System.out.println("Introduce la posición donde quiera introducirlo (de 0 a 9):");
            pos = sc.nextInt();
            
            
            for(int j = 8; j>=pos; j--){
                t[j+1] = t[j];

            }
            t[pos] = num;
        }
        
        for(int i=0; i<10; i++){
            System.out.print(t[i] + " ");
        }
        sc.close();

    }
    
}
