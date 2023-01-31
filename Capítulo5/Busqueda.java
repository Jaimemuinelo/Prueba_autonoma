package Capítulo5;
import java.util.Scanner;
//Leer 10 nums ordenados crecientemente. Leer num y buscarlo mostrando la posición en que esté
public class Busqueda {
    public static void main (String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            int t[] = new int[10];
            int num, i;

            System.out.println("Introduce 10 elementos (ordenados crecientemente).");
            for(i=0; i<10; i++){
                System.out.println("Elemento de índice "+i+":");
                t[i] = sc.nextInt();
            }

            System.out.println("¿Qué número de los introducidos desea buscar?");
            num = sc.nextInt();
            sc.close();

            while(i<10 && t[i]<num){
                i++;
            }

            if(i==10){
                System.out.println("Número no encontrado");
            } else if(t[i] == num){
                System.out.println("El número se encuentra en la posición: " +i);
            } else{
                System.out.println("Número no encontrado");
            }
        }
    }
}