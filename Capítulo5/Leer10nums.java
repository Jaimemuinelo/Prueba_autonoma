package Capítulo5;
import java.util.Scanner;
public class Leer10nums {
    public static void main (String args []){
        int t[] = new int[10];
        Scanner sc = new Scanner (System.in);

        for( int i=0; i<=9; i++){
            System.out.println("Introduce un número:");
            t[i] = sc.nextInt();
        }

        System.out.println("Los números introducidos son:");
        for(int i=0; i<=4; i++){
            System.out.print(t[i] + ", " + t[9-i] + ", ");
        }
        sc.close();

    }
    
}
