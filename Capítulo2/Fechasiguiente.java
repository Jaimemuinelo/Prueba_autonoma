package Capítulo2;

import java.util.Scanner;

/*En este programa supongo que la fecha introducida va a ser correcta para que no sea
 * imposible de resolver, simplemente añade un día, mes o año dependiendo de la situación.
 */
public class Fechasiguiente {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int dia, mes, año, maximo;
        maximo = 0;

        System.out.println("Introduzca la fecha deseada:\n Día:");
        dia = sc.nextInt();

        System.out.println("Mes:");
        mes = sc.nextInt();

        System.out.println("Año:");
        año = sc.nextInt();

        sc.close();


        switch (mes){ //uso del switch solo para probar cómo es, resulta más ilegible que con if.
            case 1:
              maximo = 31;
              break;
            case 2:
              maximo = 28;
              break;
            case 3: 
              maximo = 31;
              break;
            case 4:
              maximo = 30;
              break;
            case 5:
              maximo=31;
              break;
            case 6:
              maximo = 30;
              break;
            case 7:
            case 8:
              maximo =31;
              break;
            case 9:
              maximo = 30;
              break;
            case 10:
              maximo = 31;
              break;
            case 11:
              maximo = 30;
              break;
            case 12: 
              maximo = 31;
              break;
        }
        if (dia == maximo) {
            dia=1;
            if (mes == 12){
              mes = 1;
              año++;
            } else{
              mes ++;
            }        
        } else{
          dia++;
        }
        if (año == 0){
          año =1;
        }
        System.out.println("Mañana será:\n" + dia + "/" + mes+ "/" +año);

        }
    }
