package Capítulo5;
import java.util.Scanner;
//Introducir sueldos de los encuestados (sin saber el número de encuestados). Para finalizar
//la  entrada de datos introducimos -1. Después mostramos los sueldos ordenados de forma
//decreciente, el sueldo max y el min y la media de sueldos.
public class Propuesto1 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int sueldos[] = new int[10];
        int suma=0, max, min, aux;
        double media;

        for(int i=0; i<10; i++){
            System.out.println("Introduce el sueldo del empleado "+(i+1));
            sueldos[i]=sc.nextInt();
        }
        sc.close();

        for(int i=0; i<10; i++){
            suma += sueldos[i];
        }
        media = suma/10;
        System.out.println("La media de los sueldos es de "+media+" $");

        for(int i=0;i<10-1;i++){
            for(int j=0; j<10-1-i; j++){
                if(sueldos[j]>sueldos[j+1]){
                    aux = sueldos[j];
                    sueldos[j] = sueldos[j+1];
                    sueldos[j+1] = aux;

                }
            }
        }
        
        max = sueldos[sueldos.length-1];
        min = sueldos[0];

        System.out.println("El sueldo mínimo es: "+min+" $");
        System.out.println("El sueldo máximo es: "+max+" $");
        for(int i=9; i>=0; i--){
            System.out.print(sueldos[i]+" ");
        }


        
    }
}
