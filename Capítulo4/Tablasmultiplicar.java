package Capítulo4;

public class Tablasmultiplicar {
    public static void main (String args []){
        int producto;
        System.out.println("Las tablas de multiplicar son:");
        for (int i =0; i <=10 ; i++){
            System.out.println("Tabla del "+ i);
            for (int j = 0; j<=10; j++){
                producto = i*j;
                System.out.println(i + "x" + j + " = " + producto);



            }
        }

    }
}
