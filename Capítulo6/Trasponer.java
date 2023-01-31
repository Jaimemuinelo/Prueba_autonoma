package Capítulo6;
import java.util.Scanner;
//Crear matriz 3x3, trasponer y mostrar
public class Trasponer {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t[][] = new int[3][3];
        int aux;

        System.out.println("Introduzca los elementos de la matriz 3x3");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Elemento ["+i+"] ["+j+"]");
                t[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for(int i=1; i<3;i++){
            for(int j=0; j<i; j++){
                aux = t[j][i]; 
                t[j][i] = t[i][j];
                t[i][j] = aux;
            }
        }

        for(int i=0; i<3; i++){
            System.out.println("");
            for(int j=0; j<3; j++){
                System.out.print(t[i][j]+" ");
            }
        }

    }
}
