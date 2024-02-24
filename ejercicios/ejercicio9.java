/*Escribir un programa que solicite al usuario dos vectores de N elementos y que imprima su producto escalar. 
Utilice un array para representar el vector de N elementos. Realice la entrada de usuario por teclado en 
una función que reciba las dimensiones del vector a la que se invoca dos veces (una por vector) y otra 
función que calcule el producto escalar recibiendo dos arrays que representan dos vectores. */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int dimension;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensión:");
        dimension = leer.nextInt();
        int[] vector1 = LLenarVector(dimension);
        int[] vector2 = LLenarVector(dimension);
        int productoEscalar = ProductoEscalar(vector1, vector2, dimension);
        System.out.println("El productor escalar es: " +productoEscalar);
     }
    
     public static int[] LLenarVector(int dimension){
        int[] vector = new int [dimension];
        for (int i=0; i<dimension;i++){
            Scanner leerdimension = new Scanner(System.in);
            System.out.println("Elemento"+i+":");
            vector[i]=leerdimension.nextInt();
        }
        return vector;
     }

     public static int ProductoEscalar(int[] vector1, int[] vector2, int dimension){
        int productoEscalar = 0;
        for(int i=0;i<dimension;i++){
            productoEscalar += vector1[i]*vector2[i];
        }
        return productoEscalar;
     }

}
