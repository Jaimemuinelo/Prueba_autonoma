package Capítulo6;
//Crear matriz 8x6 en la que todos los elementos son 0 a excepción de los bordes
public class Matrizmarco {
    public static void main (String args[]){
        int marco[][] = new int[8][6];

        for(int i=0; i<8; i++){
            for(int j=0; j<6; j++){
                if(i==0 || i==7 || j==0 || j==5){
                    marco[i][j]=1;
                } else{
                    marco[i][j]=0;
                }
            }
        }

        for(int i=0; i<8; i++){
            System.out.println(" ");
            for(int j=0; j<6; j++){
                System.out.print(marco[i][j]+" ");
            }
        }
    }
    
}
