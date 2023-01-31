package Capítulo7;
import java.util.Scanner; 
import java.util.Locale;
/*Mismo ejercicio que Cilindro.java pero devolviendo una tabla de tamaño dos */
public class Tablacilindro {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        double radio, alt;
        double resultado[];//no necesita más declaración pq apunta a la de la otra función

        System.out.println("Introduzca el radio de la base del cilindro (en cm):");
        radio = sc.nextDouble();

        System.out.println("Introduzca la altura del cilindro (en cm):");
        alt = sc.nextDouble();
        sc.close();

        resultado = cilindroAreaVolumen(radio, alt);
        System.out.println("El área es " + resultado[0]);
        System.out.println("El volumen es " + resultado[1]);
    }
    static double[] cilindroAreaVolumen(double r, double a){
        double calculo[] = new double[2];//0 es area y 1 es volumen
        calculo[0] = 2*Math.PI * r *(a+r);
        calculo[1] = Math.PI * r * r * a;
        return(calculo);
    }
}
