/*Escribe un programa que muestre por pantalla la lista de los N primeros números primos. 
Realiza una función que reciba N, devuelve un array conteniendo los N primeros números primos y 
posteriormente imprima el array en el main. */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        int N = determinarN();
        int[] numerosPrimos = Primos(N);
        System.out.println("Los numeros primos son: " +numerosPrimos);

    }

    public static int determinarN(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero de primos que desea ver:");
        int N = leer.nextInt();
        return N;
    }
    public static int[] Primos(int N){
        int[] primos = new int [N];
        if(N == 0 || N == 1 || N == 4){
            // continue da error
        } else {
            for (int x = 2; x < N / 2; x++){
                if (N % x == 0){
                    primos[N]=x;
                }
            }
        }
        return primos;
    }
    
}



