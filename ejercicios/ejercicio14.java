/*Escribe un programa que lee una cadena de caracteres de teclado e indique si es o no palíndroma 
(se lee igual de izquierda a derecha que de derecha a izquierda, sin tener en cuenta los espacios en 
blanco y las mayúsculas). Por ejemplo: "dábale arroz a la zorra el abad". Reutilice la función del ejercicio 12 
para la entrada de teclado y cree otra función que dada una cadena de caracteres devuelva un boolean indicando si e
s o no palíndroma */

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        String palabraleer = leer();
        boolean palabrapalindroma = palabraPalindroma(palabraleer);
        System.out.println(""+palabrapalindroma);
    }
    
    public static String leer(){
        Scanner leer = new Scanner(System.in);
        System.out.println("palabra:");
        String palabra = leer.nextLine();
        return palabra;
    }

    public static boolean palabraPalindroma(String palabraleer){
        String palabrainvertida = "";
        boolean palindroma;
        for(int i=palabraleer.length()-1;i>=0;i++){
            palabrainvertida+=palabraleer.charAt(i);
        }
        if(palabraleer.equals(palabrainvertida)){
            palindroma = true; 
            System.out.println("palabra palindroma");
        }else{
            palindroma = false;
            System.out.println("palabra no palindroma");
        }
        return palindroma;
    
    }
}
