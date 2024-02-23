/*Escribe un programa que visualice por pantalla la tabla de multiplicar de los 10 primeros números naturales. 
Utilizar una función que reciba un número N y devuelva un array de arrays con las tablas de multiplicar de 0 a 9 de 
los N números. */

import java.util.Scanner;

public class ejercicio5 {
    public static void main (String[] args){
        int N = determinarN();
        int[][] tablasN = TablasMultiplicarN(N);
        System.out.println("Las tablas de multiplicar de los N numeros son:" +tablasN[N][10]);
    }    
    public static int determinarN(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero de tablas que desea ver: ");
        int N = leer.nextInt();
        return N;
    }
   
    public static int[][] TablasMultiplicarN(int N){
        int i, j;
        int[][] tablasN = new int [N][10];
        for(i=0;i<=N;i++){
            for(j=0;j<10;j++){
                tablasN[i][j] = i*j;
                System.out.println(i + "x" + j + "=" + tablasN[i][j]);
            }
        }
        return tablasN;
    }

}


