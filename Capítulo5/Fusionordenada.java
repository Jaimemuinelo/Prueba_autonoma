package Capítulo5;
import java.util.Scanner;
//Leer dos tablas de 10 nums, copiar ambas en una tercera que quede ordenada
public class Fusionordenada {
    public static void main (String args[]){
        int t1[] = new int[10];
        int t2[] = new int[10];
        int fusion[] = new int[20];
        Scanner sc = new Scanner (System.in);
        int i1=0, i2=0,j;

        //Los números serán introducidos de manera ordenada
        System.out.println("-->Los elementos de cada tabla deberán"
        +" introducirse ordenados de manera creciente");

        System.out.println("Tabla 1");
        for(int i=0; i<10; i++){
            System.out.println("Introduce el elemento de índice "+i);
            t1[i]=sc.nextInt();
        }

        System.out.println("Tabla 2");
        for(int i=0; i<10; i++){
            System.out.println("Introduce el elemento de índice "+i);
            t2[i]=sc.nextInt();
        }
        sc.close();
        
        for(j=0;j<20;j++){
            if(t1[i1]<=t2[i2]){
                fusion[j]=t1[i1];
                i1++;
                if(i1==10){
                    break;
                }
                System.out.println(i1 + ", "+i2+", "+j);
            } else{
                fusion[j]=t2[i2];
                i2++;
                if(i2==10){
                    break;
                }
                System.out.println(i1 + ", "+i2+", "+j);
            }
        }
        while(i1<10){
            fusion[j]=t1[i1];
            j++;
            i1++;
        }
        while(i2<10){
            fusion[j]=t2[i2];
            j++;
            i2++;
        }
        
        for(int i=0; i<20; i++){
            System.out.print(fusion[i]+" ");
        }
    }
    
}
/*Hay algo mal hecho en este ejercicio
 * el qué, ni idea
 */