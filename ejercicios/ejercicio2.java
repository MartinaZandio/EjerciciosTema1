/*Escribir un programa que muestre por consola los mayoresnúmeros enteros que se pueden representar mediante un char, short e int*/

public class ejercicio2{
    public static void main(String[]args){
        int maxChar =  (int)Character.MAX_VALUE;
        int maxShort = (int)Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("El mayor número entero respresentado por un char es "+maxChar);
        System.out.println("El mayor número entero respresentado por un short es "+maxShort);
        System.out.println("El mayor numero entero representado por un int es "+maxInt);
    }
}