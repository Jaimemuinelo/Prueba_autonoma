package Capítulo7;
import java.util.Scanner;
/*Repite Numerodivisores.java pero diseña una función que devuelva
 * una tabla con los divisores primos.
 */
public class TablaPrimos {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        final int TAM = 10000;
        int num;
        int[] primos = new int[TAM];
        System.out.println("Introduce el número para saber sus divisores primos:");
        num = sc.nextInt();
        sc.close();

        primos = divisores(num);
        for(int i=0; i<TAM; i++){
            if(primos[i]!=0){
                System.out.print(primos[i]+" ");
            }
        }

    }

    static int[] divisores(int n){
        final int TAM = 10000;
        int div[] = new int[TAM];
        boolean primo;
        int indice=0;
        for(int i=1; i<n; i++){
            primo = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if (primo == true && n%i==0){
                div[indice]=i;
                System.out.print("\n"+i+" ");
                indice++;
            }
        }
        return(div);
    }
}
