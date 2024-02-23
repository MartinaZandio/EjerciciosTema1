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
        for(int i=0;i<=N;i++){
            for(int j=2;j<N;j++){
                if(i%j==0){
                    break;
                }else {
                    primos[i]=j;
                }
            }
        }
        return primos;
    }
}
