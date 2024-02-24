/*Escribir un programa que multiplique dos matrices. Sus dimensiones y valores deben de solicitarse al 
usuario por teclado y tras realizar la multiplicación debe visualizarse en pantalla ambas matrices y el
resultado de la multiplicación. Cree una nueva función similar al ejercicio 9 pero que recibirá vectores 
de varias dimensiones. Realice otra función multiplicar matrices que reciba dos arrays de dos dimensiones 
que representan 2 vectores y devuelva otro array de dos dimensiones que contenga su multiplicación. 
En caso de no ser compatibles las dimensiones la función indicará que ha habido un error. */

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Columnas matriz1: ");
        int col1 = leer.nextInt();
        System.out.println("Filas matriz1: ");
        int fil1 = leer.nextInt();
        System.out.println("Columnas matriz2: ");
        int col2 = leer.nextInt();
        System.out.println("Filas matriz2: ");
        int fil2 = leer.nextInt();

        if(col1 != fil2){
            System.out.println("ERROR;no se pueden multiplicar matrices con estas dimensiones");
            return;
        }

        int[][] matriz1 = new int[fil1][col1];
        int[][] matriz2 = new int[fil2][col2];
        int[][] matrizresultado = multiplicarMatrices(matriz1, matriz2);

        System.out.println("Valores matriz1:");
        int i=0;
        int j=0;
        for (i = 0; i < fil1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print("posición (" + i + ", " + j + "): ");
                matriz1[i][j] = leer.nextInt();
            }
            
        }
        System.out.println(matriz1[i][j]+ "");

        System.out.println("Valores matriz2:");
        int m=0;
        int n=0;
        for (m = 0; m < fil2; m++) {
            for (n = 0; n < col2; n++) {
                System.out.print("posición (" + m + ", " + n + "): ");
                matriz2[m][n] = leer.nextInt();
            }
            
        }
        System.out.println(matriz2[m][n] + "");

        System.out.println("Matriz resultado: " +matrizresultado);

        }

        public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2){
            int fil1 = matriz1.length;
            int col1 = matriz1[0].length;
            int fil2 = matriz2.length;
            int col2 = matriz2[0].length;
            int[][] matrizresultante = new int[fil1][col2];
            
            for (int i = 0; i < fil1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        matrizresultante[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            return matrizresultante;

     }
}
