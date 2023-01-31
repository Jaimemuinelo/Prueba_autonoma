package Capítulo5;
import java.util.Scanner;
//Leer 10 números y desplazar todos una posición a la dcha
public class Rotartabla {
    public static void main (String args[]){
        int t[] = new int[10];
        Scanner sc = new Scanner (System.in);
        int aux;

        for(int i=0; i<10; i++){
            System.out.println("Introduce un número para la posición " + i);
            t[i] = sc.nextInt();
        }
        sc.close();

        //Desplazo los elementos una posición a la derecha
        aux = t[9];

        for(int i = 8; i>=0; i--){
            t[i+1] = t[i];
        }
        t[0] = aux;
        
        for(int i=0; i<t.length; i++){
            System.out.print(t[i] + " ");
        }
    }
    
}
