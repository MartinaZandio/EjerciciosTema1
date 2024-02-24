/*Escribe un programa que lea un número entero de teclado, lo guarde en una variable, 
lo envíe a una función que lo descomponga en factores primos, y dicha función devuelva un array 
que contenga los factores primos. Posteriormente imprima el array en el main. ; por ejemplo 40 = 2 * 2
* 2 * 5. */

import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] args){
        int numeroAdescomponer = determinarNumero();
        int[] factores = descomposicion(numeroAdescomponer);
        System.out.println("Los factores primos de dicho numero son: " +factores);
    }

    public static int determinarNumero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Número que desea descomponer: ");
        int numerointroducido = leer.nextInt();
        return numerointroducido;
    }

    public static int[] descomposicion(int numeroAdescomponer){
        int[] factoresPrimos = new int [numeroAdescomponer];
        int factor;

        for(factor=2;factor<=numeroAdescomponer;factor++){
            if (numeroAdescomponer % factor ==0){
                numeroAdescomponer = numeroAdescomponer / factor;
                factor--;
                factoresPrimos[factor]=factor;
            }
        }
        return factoresPrimos;
    }
    
}
