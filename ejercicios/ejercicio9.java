/*Escribir un programa que solicite al usuario dos vectores de N elementos y que imprima su producto escalar. 
Utilice un array para representar el vector de N elementos. Realice la entrada de usuario por teclado en 
una función que reciba las dimensiones del vector a la que se invoca dos veces (una por vector) y otra 
función que calcule el producto escalar recibiendo dos arrays que representan dos vectores. */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int[] vector1 = LLenarVector();
        int[] vector2 =LLenarVector();
        int productoEscalar = ProductoEscalar(vector1, vector2);
        System.out.println("El productor escalar es: " +productoEscalar);
     }
    
     public static int[] LLenarVector(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero de elementos del vector:");
        int numeroelementosvector = leer.nextInt();
        int[] vector = new int [numeroelementosvector];
        for (int i=0; i<numeroelementosvector;i++){
            System.out.println("Elemento"+i+":");
            vector[i]=leer.nextInt();
        }
        return vector;
     }

}
