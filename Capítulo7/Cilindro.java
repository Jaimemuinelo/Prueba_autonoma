package Capítulo7;
import java.util.Scanner;
import java.util.Locale;
/*Realizar una función que calcule (mostrando en pantalla) el área o el volumen de un
 * cilindro, según se especifique. Para distinguir se usará a o v. Además, hemos de pasarle
 * el radio de la base y la altura.
*/
public class Cilindro {
    public static void main (String args[]){
    double radio, altura;
    char opc;
    Scanner sc = new Scanner (System.in).useLocale(Locale.US);

    System.out.println("Introduzca el radio de la base del cilindro (en cm):");
    radio = sc.nextDouble();

    System.out.println("Introduzca la altura del cilindro (en cm):");
    altura = sc.nextDouble();

    System.out.println("Si desea calcular el área escriba \"a\"");
    System.out.println("Si desea calcular el volumen escriba \"v\"");
    opc = sc.next().charAt(0);
    sc.close();

    cilindroAreaVolumen(radio, altura, opc);

    }
    static void cilindroAreaVolumen(double r, double a, char o){
        double volumen, area;
        switch(o){
            case 'a':
            area = 2* Math.PI * r * (a + r);
            System.out.println("El área del cilindro es de "+area+" cm^2.");
            break;
            case 'v':
            volumen = Math.PI * r * r * a;
            System.out.println("El volumen del cilindro es de "+volumen+" cm^3.");
            break;
            default:
            System.out.println("ERROR");
        }
    }
}
