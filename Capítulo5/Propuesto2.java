package Capítulo5;
import java.util.Scanner;
//A partir de una tabla con los datos desordenados(ej:[3,5,1,4])
//crear una segunda tabla que especifica el lugar que ocupan de forma ordenada los elementos
//(ej: [2,0,3,1])
public class Propuesto2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int t[] = new int[4];
        int c[] = new int[4];
        int indices[] = new int[4];
        int indiceMax;

        for(int i=0; i<4; i++){
            System.out.println("Introducir elemento de índice: "+i);
            t[i] = sc.nextInt();
        }
        sc.close();
        c = t.clone();

        for(int k=0; k<4; k++){
            indiceMax = k;
            for(int i=0; i<4; i++){
                if(c[i]>=c[indiceMax]){
                    indiceMax = i;
                }
            }
            indices[k]=indiceMax;
            System.out.println(indices[k]);
            c[indiceMax]=0;

            /*System.out.println();
            for(int i=0; i<4; i++){
                System.out.print(c[i]+" ");
            }
            System.out.println();*/
        }

        System.out.println();
        for(int i=0;i<4;i++){
            System.out.print(t[i]+" ");
        }
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.print(indices[i]+" ");
        }
    }
}
