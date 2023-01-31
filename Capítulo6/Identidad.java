package Capítulo6;
//Crear matriz identidad 7x7
public class Identidad {
    public static void main (String args[]){
        int t[][] = new int[7][7];

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(i!=j){
                    t[i][j]=0;
                } else{
                    t[i][j]=1;
                }
            }
        }

        for(int i=0; i<7; i++){
            System.out.println("");
            for(int j=0; j<7; j++){
                System.out.print(t[i][j]+" ");
            }
        }
    }
}
