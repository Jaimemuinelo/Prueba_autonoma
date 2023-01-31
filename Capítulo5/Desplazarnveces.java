package Capítulo5;
import java.util.Scanner;
//Leer 10 elementos y desplazarlos a la dcha tantas posiciones como indique el usuario
public class Desplazarnveces {
    public static void main (String args[]){
        int t[] = new int[10];
        Scanner sc = new Scanner (System.in);
        int n, aux;

        for(int i = 0; i<10; i++){
            System.out.println("Introducir elemento de posición "+i);
            t[i] = sc.nextInt();
        }

        System.out.println("Introduzca el número de veces que quiera que se desplacen" +
        "los elementos a la derecha:");
        n = sc.nextInt();
        sc.close();

        for(int j=0;j<n;j++){

        aux = t[9];

        for(int i = 8; i>=0; i--){
            t[i+1] = t[i];
        }
        t[0] = aux;
    }

        for(int i=0; i<=9; i++){
            System.out.print(t[i]+" ");
        }

    }
}
