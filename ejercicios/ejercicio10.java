/*Escribir un programa que rellene una matriz cuadrada (las dimensiones de la matriz serán un parámetro 
que se pida al usuario) con números aleatorios de tal modo que la matriz sea simétrica. 
Imprimir la matriz por pantalla. Realice todo en una única función a la que se llama desde el main. */

import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int dimensionmatriz;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensión de la matriz cuadrada: ");
        dimensionmatriz = leer.nextInt();

        int[][] matrizsimetrica = RellenarYVisualizarMatriz(dimensionmatriz);
        }

    public static int[][] RellenarYVisualizarMatriz(int dimensionmatriz){
        Random random = new Random();
        int[][] matriz = new int[dimensionmatriz][dimensionmatriz];
        int i, j;
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[0].length; j++){
                matriz[i][j] = random.nextInt()%1000;
            }
        }
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[0].length; j++){
                System.out.println(matriz[i][j] + "");
            }
            System.out.println(); //no se imprimir la matriz de forma que quede cuadrada
        }
        return matriz;

    }

    
}
