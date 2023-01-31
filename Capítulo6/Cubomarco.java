package Capítulo6;
//Crear una matrizz 9x9x9 en la que las caras sean 1 y el interior 0
public class Cubomarco {
    public static void main (String args[]){
        int cubo[][][] = new int[9][9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                for(int k=0; k<9; k++){
                    if(i==0||i==8||j==0||j==8||k==0||k==8){
                        cubo[i][j][k]=1;
                    }
                }
            }
        }
/*
        for(int i=0; i<9; i++){
            System.out.println();
            for(int j=0; j<9; j++){
                System.out.println();
                for(int k=0; k<9; k++){
                    System.out.print(cubo[i][j][k]+" ");                    
                }
            }
        }*/

        System.out.println("Matriz: ");
        for(int i=0; i<9; i++){
            System.out.println("Capa: "+i);
            for(int j=0; j<9; j++){
                for(int k =0; k<9; k++){
                    System.out.print(cubo[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }
    }
}
