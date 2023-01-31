package Capítulo5;
import java.util.Scanner;
//Leer 10 números e indicar si la tabla está ordenada (crec o decrec) o si está desordenada
public class Ordenodesorden {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t[] = new int[10];
        boolean creciente = false;
        boolean decreciente = false;

        //leo la tabla
        for (int i=0; i<10; i++){
            System.out.println("Introduce el elemento " +(i+1));
            t[i] = sc.nextInt();
        }
        sc.close();

        //debo determinar si la tabla está ordenada de alguna forma o si está desordenada

        for(int i=0; i<9; i++){
            if (t[i]<t[i+1]){
                //el elemento es menor que el siguiente
                //lo comprobamos con todos los elementos
                creciente = true;

            } else if (t[i]>t[i+1]){
                decreciente = true;

            }
        }
        if (creciente == true && decreciente == false){
            System.out.println("Tabla creciente.");
        } else if (creciente == false && decreciente == true){
            System.out.println("Tabla decreciente.");
        }else {
            System.out.println("Tabla desordenada.");
        }

        
    }
}
