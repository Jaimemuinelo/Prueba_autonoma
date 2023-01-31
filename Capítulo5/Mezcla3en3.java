package Capítulo5;
import java.util.Scanner;
//Leer dos tablas de 12 elementos y mezclarlos en otra tabla de manera que quede
//3 de la A, 3 de la B, 3 de la A...
public class Mezcla3en3 {
    public static void main (String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            int a[], b[], c[];
            a = new int[12];
            b = new int[12];
            c = new int[24];
            int i, j;
            int k=0;


            for (i = 0; i<12; i++){
                System.out.println("Introducir el dato "+i+ " de la tabla A:");
                a[i] = sc.nextInt();
            }

            for (i = 0; i<12; i++){
                System.out.println("Introducir el dato "+i + " de la tabla B:");
                b[i] = sc.nextInt();
            }
            sc.close();

            
            for (i = 0; i<24; i += 0){
                for (j=0; j<=2; j++){
                    c[i] = a[k];
                    k++;
                    i++;
                }
                k-=3;
                for (j=0; j<=2; j++){
                    c[i] = b[k];
                    k++;
                    i++;
                }
            }

            for (i = 0; i<24; i++){
                System.out.print(c[i] + " ");
            }
        }
        
    }
    
}
