/*Escribe un programa que acepte una cadena de caracteres (que podrá contener cualquier 
carácter a excepción del retorno de carro) y que diga cuántas vocales contiene. 
Realice la entrada de teclado en una función (lectura de una string) y el cálculo de 
vocales de una string en otra función independiente que reciba una string y devuelva 
un entero */

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        String palabraleer = leer();
        String vocalespalabra = contarVocales(palabraleer);
        System.out.println("Palabra: "+palabraleer+"\nvocales: "+vocalespalabra);

    }

    public static String leer(){
        Scanner leer = new Scanner(System.in);
        System.out.println("palabra:");
        String palabra = leer.nextLine();
        return palabra;
    }
    
    public static String contarVocales(String palabraleer){
        int cont=0;
        for (int i=0; i<palabraleer.length(); i++){
            if (palabraleer.charAt(i)=='a' || palabraleer.charAt(i)=='e' || palabraleer.charAt(i)=='i' || palabraleer.charAt(i)=='o' || palabraleer.charAt(i)=='u'){
                cont++;
            }
        }
        return Integer.toString(cont); //iba a poner cont pero hay q convertir string a int para poder tener cont 
    }
}
