/*Escribe un programa que calcule el mínimo y el máximo de una lista de números enteros positivos 
introducidos por el usuario. La lista finalizará cuando se introduzca un número negativo. */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        int numMIN = Integer.MAX_VALUE;
        int numMAX = Integer.MIN_VALUE;
        int num;
        Scanner leer = new Scanner (System.in);
        do{
            System.out.println("Introduce un numero entero positivo:");
            num = leer.nextInt();

            if (num>numMAX){
                numMAX = num;
            }else if (num<numMIN){
                numMIN = num;
            }
        }while(num>=0);
        System.out.println("Numero máximo: "+numMAX);
        System.out.println("Nummero mínimo:"+numMIN);
    }
}
