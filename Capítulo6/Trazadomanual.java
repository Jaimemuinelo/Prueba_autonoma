package Capítulo6;
import java.util.Scanner;
//realiza una traza manual a los siguientes programas y mostrar la salida 
//que generan por pantalla
public class Trazadomanual {
    public static void main (String args[]){
    /*Scanner sc = new Scanner(System.in);
    int i, m, a;
    int t[] = new int[5];

    for(i=0; i<=4; i++){
        t[i] = sc.nextInt();
    }
    sc.close();
    
    m=0;
    for(i=0; i<=4; i++){
        if(t[i]>m){
            m = t[i];
        }
    }

    a = t[4-m];
    t[4-m] = t[m];
    t[m] = a;

    for(i=0; i<=4; i++){
        System.out.println(t[i]);
    }*/

    int n, i;
    int a[] = new int[10];
    int b[] = new int[10];
    try (Scanner sc = new Scanner (System.in)) {
        n=10;

        for(i=0; i<=n-1; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    for(i=0; i<=n/2; i++){
        b[i] = a[n-1-i];
        b[n-1-i] = a[i];
    }
    for(i=0;i<n; i++){
        if(i%2 ==0){
            System.out.println(a[i]);
        } else{
            System.out.println(b[i]);
        }
    }
    
}
}
