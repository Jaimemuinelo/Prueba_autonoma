package Capítulo1;

import java.util.Scanner;

public class Tiempo {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        int tiempo, segundos, minutos, horas;
        System.out.println("Introduzca la cantidad de tiempo (en segundos):");
        tiempo = sc.nextInt();

        segundos = tiempo % 60; // Los segundos serán el resto de la división del tiempo entre 60
        minutos = (tiempo / 60) % 60; //Dividiendo entre 60 obtenemos los minutos (pero no las horas)
        //para obtener realmente minutos sin tener en cuenta las horas usamos el resto de los minutos entre 60
        horas = tiempo / 3600;

        System.out.println("Serán " +horas+ "h "+minutos+"min "+segundos+"s");
        sc.close();


    }
    
}
