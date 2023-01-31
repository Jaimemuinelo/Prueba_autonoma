package Capítulo7;
import java.util.Scanner;
/*Diseñar una función a la que se le pase como parámetro un número n,
 * y muestre por pantalla n veces el mensaje: Módulo ejecutándose
 */
public class Mostrarnveces {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Introduce un número:");
        n=sc.nextInt();
        sc.close();
        mostrar(n);
    }    

    static void mostrar(int n){
        for(int i=0; i<n; i++){
            System.out.println("Módulo ejecutándose");
        }
    }
}
