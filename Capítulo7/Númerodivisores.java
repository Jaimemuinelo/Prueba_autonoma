package Capítulo7;
import java.util.Scanner;
import java.util.Locale;
/*Función a la que se le pase un número entero y devuelva el número
 * de divisores que tiene (hay que decirlos tb?). 2 versiones: todos los divisores
 * o solo los divisores primos
 */
public class Númerodivisores {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        int n, div, divPrimos;

        System.out.println("Introduzca un número entero para saber "+
        "el número de divisores que tiene:");
        n = sc.nextInt();
        sc.close();

        System.out.print("Divisores de "+n+": ");
        div = divisores(n);
        System.out.print(n);
        //divisoresPrimos(n);
        divPrimos = divisoresPrimos(n);

        System.out.println();
        System.out.println("Tiene "+divPrimos+" divisores primos y "+div+" en total");
    }

    static int divisores(int n){
        int contadorDiv=1;
        for(int i=1; i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                contadorDiv++;
            }
        }
        return(contadorDiv);
    }

    static int divisoresPrimos(int n){
        int contadorPrimos = 0;
        boolean primo;
        for(int i=2; i<=n; i++){
            primo=true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if(primo == true && n%i==0){
                contadorPrimos++;
                System.out.print("\n"+i+"");
            }
        }
        //comprobar a la vez q sean primos y divisores;
        return(contadorPrimos);
    }
}
