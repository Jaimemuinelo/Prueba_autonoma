package Capítulo5;
import java.util.Scanner;
//Leer notas de 5 alumnos en 3 trimestres. Mostrar la media de cada trimestre
//El usuario escoge un alumno y también ve su media a lo largo de los trimestres
public class Notas {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int t1[] = new int[5];//Cada tabla representa las notas de los 5 alumnos en un trimestre
        int t2[] = new int[5];//De esta manera cada índice representará un alumno
        int t3[] = new int[5];
        int num, suma=0;
        double media1, media2, media3, mediaAlumno;

        System.out.println("Introduce las notas de los 5 alumnos en el 1er trimestre:");
        for(int i=0; i<5;i++){
            System.out.println("Alumno "+(i+1));
            t1[i] = sc.nextInt();
        }

        System.out.println("Introduce las notas de los 5 alumnos en el 2o trimestre:");
        for(int i=0; i<5;i++){
            System.out.println("Alumno "+(i+1));
            t2[i] = sc.nextInt();
        }
        
        System.out.println("Introduce las notas de los 5 alumnos en el 3er trimestre:");
        for(int i=0; i<5;i++){
            System.out.println("Alumno "+(i+1));
            t3[i] = sc.nextInt();
        }
        System.out.println("Alumno del que quiera saber la media:");
        num = sc.nextInt();
        sc.close();
        num--;

        for(int i=0; i<5;i++){
            suma += t1[i];
        }
        media1 = (double) suma / 5;
        
        suma=0;
        for(int i=0; i<5;i++){
            suma += t2[i];
        }
        media2 = (double) suma / 5;

        suma=0;
        for(int i=0; i<5;i++){
            suma += t3[i];
        }
        media3 = (double) suma / 5;

        suma=0;
        suma = t1[num] + t2[num] + t3[num];
        mediaAlumno = (double) suma/3;

        System.out.println("Media 1er Trimestre: "+media1);
        System.out.println("Media 2o Trimestre: "+media2);
        System.out.println("Media 3er Trimestre: "+media3);
        System.out.println("Media total del alumno seleccionado:"+ mediaAlumno);


    }
    
}
