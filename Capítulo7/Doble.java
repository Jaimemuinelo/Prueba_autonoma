package Capítulo7;
import java.util.Scanner;
/*Mostrar el doble del número que se pase como parámetro */
public class Doble {
    static void doble(int n){
        int doble;
        doble = n*2;
        System.out.println("El doble es: "+doble);
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un número:");
        n = sc.nextInt();
        sc.close();;
        doble(n);
    }
}