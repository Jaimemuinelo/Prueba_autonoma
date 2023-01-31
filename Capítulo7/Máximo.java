package Capítulo7;
import java.util.Scanner;
/*Diseñar una función que tenga como parámetros dos números enteros y que calcule
 * el máximo.
 */
public class Máximo {
    public static void main (String[] args){
        int n, m;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca dos números para saber cuál es mayor:");
        System.out.println("Primer número:");
        n = sc.nextInt();

        System.out.println("Segundo número:");
        m = sc.nextInt();
        sc.close();
        System.out.print(mayor(n, m));
    }

    static int mayor(int x, int y){
            System.out.print("El número mayor es ");
            return(x>y?x:y);
    }
    
}
