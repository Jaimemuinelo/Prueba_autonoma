package Capítulo6;
import java.util.Scanner;
//Sumar matrices
public class Sumamatriz {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t1[][] = new int[3][3];
        int t2[][] = new int[3][3];
        int suma[][]= new int[3][3];

        System.out.println("Rellene la Tabla 1:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Elemento ["+i+"] ["+j+"]");
                t1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Rellene la Tabla 2:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Elemento ["+i+"] ["+j+"]");
                t2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                suma[i][j] = t1[i][j]+t2[i][j];
            }
        }

        System.out.println("La suma de ambas matrices es:");
        for(int i=0; i<3;i++){
            System.out.println("");
            for(int j=0; j<3;j++){
                System.out.print(suma[i][j]+" ");
            }
        }
        
    }
}
