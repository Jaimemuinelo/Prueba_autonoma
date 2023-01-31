package Capítulo7;
import java.util.Scanner;
/*Diseñar una función que calcule el máximo de 3 números */
public class Máximode3 {
    static int maximo(int a, int b, int c){
        return( (a>b) ? (a>c) ? a:(b>c) ?b:c: (b>c)?b:c);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        int max;

        System.out.println("Introduzca tres números para determinar cuál es mayor:");
        System.out.println("Primer número: ");
        a=sc.nextInt();

        System.out.println("Segundo número: ");
        b=sc.nextInt();

        System.out.println("Tercer número: ");
        c=sc.nextInt();
        sc.close();
        max=maximo(a,b,c);
        System.out.println("El número mayor es: "+max);
    }
    
}
