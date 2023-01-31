package Capítulo6;
import java.util.Scanner;
//Cargar matriz 5x9 y trasponerla en una segunda 9x5
public class Trasp5x9 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int m1[][] = new int[5][9];
        int m2[][] = new int[9][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.println("Elemento ["+i+"] ["+j+"]");
                m1[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<5; i++){
            System.out.println("");
            for(int j=0; j<9; j++){
                System.out.print(m1[i][j]+" ");
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                m2[j][i] = m1[i][j];
            }
        }

        for(int i=0; i<9; i++){
            System.out.println("");
            for(int j=0; j<5; j++){
                System.out.print(m2[i][j]+" ");
            }
        }


    }
    
}
