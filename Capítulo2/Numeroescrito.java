package Capítulo2;

import java.util.Scanner;

/*La tarea es introducir un número de 1 a 99 y mostrarlo escrito */
public class Numeroescrito {
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        int num, u, d;
        System.out.println("Introduzca un número entre 1 y 99:");
        num = sc.nextInt();
        sc.close();

        if (num<1 || num > 99){ //Me aseguro de que es correcto el número
            System.out.println("Número no válido, repita desde el principio.");
        } else{
             u = num % 10; //Determino unidades
             d = num / 10; //Determino decenas
             switch (d){
                case 0:
                      System.out.print(" ");
                      break;
                case 1:
                      System.out.print("Diez");
                      break;
                case 2:
                      System.out.print("Veinte");
                      break;
                    case 3:
                      System.out.print("Treinta");
                      break;
                    case 4:
                      System.out.print("Cuarenta");
                      break;
                    case 5:
                      System.out.print("Cincuenta");
                      break;
                    case 6:
                      System.out.print("Sesenta");
                      break;
                    case 7:
                      System.out.print("Siete");
                      break;
                    case 8:
                      System.out.print("Ochenta");
                      break;
                    case 9:
                      System.out.print("Noventa");
                      break;
             }

             System.out.print(" y ");
             switch (u){
                case 0:
                System.out.print(" ");
                break;
                    case 1:
                      System.out.print("uno");
                      break;
                    case 2:
                      System.out.print("dos");
                      break;
                    case 3:
                      System.out.print("tres");
                      break;
                    case 4:
                      System.out.print("cuatro");
                      break;
                    case 5:
                      System.out.print("cinco");
                      break;
                    case 6:
                      System.out.print("seis");
                      break;
                    case 7:
                      System.out.print("siete");
                      break;
                    case 8:
                      System.out.print("ocho");
                      break;
                    case 9:
                      System.out.print("nueve");
                      break;
                    }


            }
                
    }

}
