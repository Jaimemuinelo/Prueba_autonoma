package Capítulo5;

public class Pruebarrays {
    public static void main (String args[]){
        int datos[]; //así se declara una tabla (también se puede int[] datos)
        datos = new int[6]; // <tabla> = new <tipo>[<tamaño>] es la sintaxis 
        //para definir el tamaño de la tabla
        // después asignamos valores a los 7 espacios de la tabla (indices de 0 a 6)
        datos[0] = 1;
        datos[1] = 6;
        datos[2] = 30;
        datos[3] = 4;
        datos[4] = 23;
        datos[5] = 5;
        
        //podemos utilizar otra forma para crear una tabla de manera que asignamos los valores
        //y le damos el tamaño necesario en un solo paso
        int t[] = {1, 6, 30, 4, 23, 5}; //hemos creado una tabla igual a la anterior en un solo paso

        System.out.println("Los tamaños son: "+ datos.length + " y " + t.length);
        // .length nos sirve para saber el tamaño de la tabla

    }
}
