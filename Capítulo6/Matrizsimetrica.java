package Capítulo6;
import java.util.Scanner;
//Decir si es simétrica o no
public class Matrizsimetrica {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t[][] = new int[4][4];
        boolean simetrica = true;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("Introduce el elemento de coordenadas X:" +i+" Y: "+j);
                t[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<4; i++){
            for(int j=0;j<4;j++){
                if(t[i][j] != t[j][i]){
                    simetrica = false;
                }
            }
        }
        if(simetrica==true){
            System.out.println("La tabla es simétrica.");
        } else{
            System.out.println("La tabla es asimétrica.");
        }
    }
}
