package Capítulo6;
import java.util.Scanner;
/*Hay 10 plazas para una competición de salto de longitud. Los datos se irán introduciendo
 * en el mismo orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las 
 * siguientes opciones: 1. Inscribir un participante 2. Mostrar listado de datos 3. Mostrar listado
 * por marcas 2011 4. Finalizar el programa.
 * Si se elige 1, se introducirán los datos de un participante: número de dorsal (no pueden repetirse)
 * mejor marca 2011, mejor marca 2010 y mejor marca 2009.
 * Si se elige 2, debemos mostrar un listado ordenado por número de dorsal.
 * La 3 mostrará un listado ordenado por la marca del 2011, de mayor a menor.
 * Tras procesar cada opción se debe mostrar de nuevo el menú hasta que se seleccione 4, que termina
 * el programa */
public class Saltodelongitud {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int pos[][] = new int[10][4];
        int accion, atleta=0, aux;
        final int D=0, M09=1, M10 = 2, M11=3;
        int i=0, j;
        boolean repetido= false, inter;

        do{
        System.out.println();
        System.out.println("MENU: \n 1. Inscribir un participante \n 2. Mostrar listado de datos"+
        "\n 3. Mostrar listado por marcas 2011 \n 4. Finalizar el programa");
        System.out.println("Elija una de las anteriores acciones:");
        accion = sc.nextInt();

        switch(accion){
            case 1:
            if(atleta==10){
                System.out.println("Plazas llenas.");
            } else{
                //Categoría 0-->D
                do{
                    System.out.println("Introducir dorsal atleta "+(atleta+1));
                    pos[i][D]=sc.nextInt();//asigno el dorsal a un atleta
                    for(int k=0; k<10; k++){
                        if(pos[i][D]==pos[k][D] && i!=k){//compruebo que el dorsal no es repetido
                            repetido=true;
                            System.out.println("Dorsal ya introducido. Elija otro:");
                            break;//salgo de este bucle para q no se repita indefinidamente
                        } else{
                        repetido=false;//no hay ningún dorsal repetido
                        }
                    }
                }while(repetido==true);//si hay un dorsal repetido debemos repetir el proceso
                //Paso a la siguiente categoría-->M11

                System.out.println("Introduzca su mejor marca del 2011 (no use decimales)");
                pos[i][M11]=sc.nextInt();
                //Paso a la siguiente categoría-->marcas 2010

                System.out.println("Introduzca su mejor marca del 2010:");
                pos[i][M10]=sc.nextInt();
                //Paso a la siguiente categoría-->marcas 2009

                System.out.println("Introduzca su mejor marca del 2009:");
                pos[i][M09]=sc.nextInt();

                i++;//Todos los datos del primer atleta han sido completados
                //Paso al siguiente atleta
            }
            
            atleta++;//No puede haber más de 10 atletas
            break;
            case 2:
            inter = true;
            while(inter == true){
                inter=false;
                for(j=0; j<atleta-1; j++){
                    if(pos[j][D]>pos[j+1][D]){
                        for(int k=0; k<4; k++){//El segundo bucle sirve para cambiar todas los elementos
                            //de la columna de posición
                            aux = pos[j][k];
                            pos[j][k]=pos[j+1][k];
                            pos[j+1][k] = aux;
                        }
                        inter=true;
                    }
                }
            }
            System.out.println("Listado de participantes ordenados por dorsal:");
            System.out.println("dorsal - marcas");
            for(j=0; j<atleta; j++){
                System.out.println();
                for(int k=0; k<4; k++){
                    System.out.print(pos[j][k]+" ");
                }
            }

            break;

            case 3:
            inter = true;
            while(inter == true){
                inter=false;
                for(j=0; j<atleta-1; j++){
                    if(pos[j][M11]>pos[j+1][M11]){
                        for(int k=0; k<4; k++){//El segundo bucle sirve para cambiar todas los elementos
                            //de la columna de posición
                            aux = pos[j][k];
                            pos[j][k]=pos[j+1][k];
                            pos[j+1][k] = aux;
                        }
                        inter=true;
                    }
                }
            }
            System.out.println("Listado de participantes ordenados por MARCA 2011:");
            System.out.println("dorsal - marcas");
            for(j=0; j<atleta; j++){
                System.out.println();
                for(int k=0; k<4; k++){
                    System.out.print(pos[j][k]+" ");
                }
            }

            break;
        }
        } while(accion!=4);
        System.out.println("Programa finalizado.");
        sc.close();
    }
}
