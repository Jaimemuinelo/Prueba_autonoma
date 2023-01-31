package Capítulo7;
import java.util.Scanner;
/*Función a la que se le pasen dos números enteros y muestre todos los números entre 
 * el primero y el segundo
 */

public class Intervalo {
    static void creciente(int a, int b){
        int n=a+1;
        if(n!=b){
            System.out.print(n+" ");
            creciente(n, b);
        }
    }
/*Más fácil sería usar variables llamadas mayor y menor que según el caso tomaran los 
 * de a o de b respectivamente y luego usar un bucle for(int i=menor; i<mayor; i++) que 
 * enseñe el valor de la i.
 */
    static void decreciente(int a, int b){
        int n=a-1;
        if(n!=b){
            System.out.print(n+" ");
            decreciente(n, b);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.println("Introduzca dos números para obtener los"+
        " números naturales entre estos.");
        System.out.println("Primer número");
        a=sc.nextInt();

        System.out.println("Segundo número");
        b=sc.nextInt();
        sc.close();

        if(a<b){
            System.out.println("La lista de números es: ");
            System.out.print(a+" ");
            creciente(a,b);
            System.out.print(b);
        } else{
            System.out.println("La lista de números es: ");
            System.out.print(a+" ");
            decreciente(a,b);
            System.out.print(b);
        }
    }
    
}
