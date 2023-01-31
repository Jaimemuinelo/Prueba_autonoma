package Capítulo5;

import java.util.Scanner;
//Leer 5 nums y mostrarlos en orden
public class Leertabla {
    public static void main (String args[]){
        int t[];
        Scanner sc = new Scanner (System.in);
        t = new int[5];

        for (int i = 0; i< 5; i++){
            System.out.println("Introduce un número:");
            t[i] = sc.nextInt();
        }

        System.out.println("Los números son:");
        for(int i = 4; i>= 0; i--){
           System.out.print(t[i] + ", ");
        }
        sc.close();

    }
}
