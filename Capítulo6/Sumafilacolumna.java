package Capítulo6;
import java.util.Scanner;
//MAtriz 4x4 y mostrar suma de filas y de columnas.
public class Sumafilacolumna {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t[][] = new int[4][4];
        int sumafila;
        int sumacolumna;

        System.out.println("Introduzca los elementos de la matriz.");
        for(int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                System.out.println("Elemento ["+i+"] ["+j+"]");
                t[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for(int j=0; j<4; j++){
            sumacolumna=0;
            for(int i=0; i<4; i++){
                sumacolumna+=t[i][j];
            }
            System.out.println("Columna "+(j+1)+": "+sumacolumna);
        }

        for(int i=0; i<4; i++){
            sumafila=0;
            for(int j=0; j<4; j++){
                sumafila+=t[i][j];
            }
            System.out.println("Fila "+(i+1)+": "+sumafila);
        }

    }
    
}
