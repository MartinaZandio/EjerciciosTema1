/*Escribe un programa que acepte una cadena de caracteres (que podrá contener cualquier carácter a 
excepción del retorno de carro) y que la escriba al revés. Reutiliza la función del ejercicio para la 
entrada de teclado y otra función que invierta la cadena */

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        String palabraleer = leer();
        String palabrainvertida = invertirPalabra(palabraleer);
        System.out.println("palabra:"+palabraleer+"\npalabra invertida:"+palabrainvertida);
    }
    
    public static String leer(){
        Scanner leer = new Scanner(System.in);
        System.out.println("palabra:");
        String palabra = leer.nextLine();
        return palabra;
    }

    public static String invertirPalabra(String palabraleer){
        String palabrainvertida = "";
        for(int i=palabraleer.length()-1;i>=0;i--){
            palabrainvertida += palabraleer.charAt(i);
        }
        return palabrainvertida;
    }
}
