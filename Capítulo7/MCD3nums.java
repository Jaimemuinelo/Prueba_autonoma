package Capítulo7;
import java.util.Scanner;
//Mismo que MCD.java pero con 3 números
public class MCD3nums {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n1, n2, n3, div1[], div2[], div3[], MCD;

        System.out.println("Introduce el primer número:");
        n1 = sc.nextInt();
        div1 = divisores(n1);//Tabla con los divisores de n1

        System.out.println("Introduce el segundo número:");
        n2 = sc.nextInt();
        div2 = divisores(n2);

        System.out.println("Introduce el tercer número:");
        n3 = sc.nextInt();
        div3 = divisores(n3);
        sc.close();

        MCD = MaxComDiv(div1, div2, div3);
        System.out.println("El MCD (Máximo Común Divisor) de "+n1+", "+n2+" y "+n3+" es: "+MCD);
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
        return(div);
    }
    static int MaxComDiv(int n[], int m[], int p[]){
        int MaxDivisor=1;
        for(int i=0; i<n.length; i++){
            for(int j=0; j<m.length; j++){
                for(int k=0; k<p.length; k++){
                    if(n[i] == m[j] && n[i] == p[k] && m[j] == p[k]){
                        MaxDivisor = n[i];
                    } /*else{
                        System.out.println(n[i]+"+"+m[j]);
                    }*/
                }
            }
        }
        return(MaxDivisor);
    }
    
}
