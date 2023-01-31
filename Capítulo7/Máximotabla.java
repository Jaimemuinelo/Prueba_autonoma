package Capítulo7;
/*Versión que calcule el máximo de una tabla de n elementos */
public class Máximotabla {
    static int maximo(int t[]){
        int max=t[0];
        for(int i=1; i<t.length-1; i++){
            if(t[i]>max){
                max = t[i];
            }
        }
        return(max);
    }
    public static void main (String args[]){
        int t[] = new int[10];
        int max;

        for(int i=0; i<t.length; i++){
            t[i] = (int) (Math.random() *100 +1);
        }
        max = maximo(t);
        System.out.println("El valor máximo de la tabla es: "+max);
        System.out.println("El resto de la tabla es: ");
        for(int i=0; i<t.length; i++){
            System.out.print(t[i]+" ");
        }
    }
    
}
