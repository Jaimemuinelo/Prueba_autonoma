package Capítulo3;

public class Productoimpares {
    public static void main (String args[]){
        int n, producto;
        producto = 1;
        n=1;
        
        for (int i = 1; i<=10; i++){
            producto = producto * n;
            n += 2;

        }
        System.out.println("El producto de los primeros 10 números impares es: "+ producto);
    }
    
}
