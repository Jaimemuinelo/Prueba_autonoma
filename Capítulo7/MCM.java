package Capítulo7;
import java.util.Scanner;
//Función que saque el MCM de dos números.
public class MCM {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n1, n2, div1[], div2[], MCM;

        System.out.println("Introduce el primer número:");
        n1 = sc.nextInt();
        div1 = divisores(n1);//Tabla con los divisores de n1

        System.out.println("Introduce el segundo número:");
        n2 = sc.nextInt();
        sc.close();
        div2 = divisores(n2);

        MCM = MinComMult(div1, div2);
        System.out.println("El MCD (Máximo Común Divisor) de "+n1+" y "+n2+" es: "+MCM);
    }

    static int contador(int n){
        int contadorDiv=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                contadorDiv++;
            }
        }
        return(contadorDiv+1);
    }

    static int[] divisores(int n){
        int tam = contador(n); //El tamaño de la tabla es el número de divisores del número
        int div[] = new int[tam];//Tabla del tamaño correspondiente
        int indice=0;
        for(int i=1; i<n; i++){
            if (n%i==0){
                div[indice]=i;
                indice++;
            }
        }
        div[tam-1]=n;
        for(int i=0; i<tam;i++){
            System.out.print(div[i]+" ");
        }
        return(div);
    }
    static int MinComMult(int n[], int m[]){
        int MaxDivisor=1;
        for(int i=0; i<(n.length); i++){
            for(int j=0; j<(m.length); j++){
                if(n[i] == m[j]){
                    MaxDivisor = n[i];
                } /*else{
                    System.out.println(n[i]+"+"+m[j]);
                }*/
            }
        }
        return(MaxDivisor);
    }
}
