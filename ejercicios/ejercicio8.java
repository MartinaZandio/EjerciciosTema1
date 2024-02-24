/*Empleando un array, escribir un programa que pida al usuario números enteros hasta que 
se introduzca el número 0. A continuación, calcular la media, el mínimo y el máximo de los datos introducidos. 
Utilice funciones independientes para: a) recibir N números enteros por teclado hasta que el usuario 
introduzca un 0; b) Calcule la media de los elementos de un array; c) calcule el mínimo de los elementos 
de un array; y d) Calcule el máximo de los elementos de un array. */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] array = LlenarArray();
        double media = CalcularMedia(array);
        System.out.println("La media es " +media);
        int minimo = CalcularMinimo(array);
        System.out.println("El menor numero de la lista es " +minimo);
        int maximo = CalcularMaximo(array);
        System.out.println("El mayor numero de la lista es " +maximo);
    }

    public static int[] LlenarArray(){
        Scanner leer = new Scanner(System.in);
        int[] array = new int [100];
        int i = 0;
        int numero;
        do{
            System.out.println("Numero para la lista: ");
            numero = leer.nextInt();
            array[i]=numero;
            i++;
        }while(numero !=0);

        return array;
    }

    public static double CalcularMedia(int[] array){
        double media = 0;
        for(int i=0;i<array.length;i++){
            media = (media + i) / array.length;
        }
        return media;
    }

    public static int CalcularMinimo(int[] array){
        int minimo = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int CalcularMaximo(int[]array){
        int maximo = array[0];
        for(int j=0;j<array.length;j++){
            if(array[j]>maximo){
                maximo = array[j];
            }
        }
        return maximo;
    }
    
}
