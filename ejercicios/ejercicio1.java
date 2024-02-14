/*Escribir un programa que defina variables que representen elnúmero de días de un año, 
el número de horas que tiene un día, el número deminutos que tiene una hora y el número de segundos 
que tiene un minuto.Emplear las variables que ocupen el mínimo espacio de memoria posible. 
Acontinuación, calcular el número de segundos que tiene un año y almacenarel valor del cálculo en otra variable. 
Realizar preferiblemente mediante una función que reciba como parámetros el número de años, meses y días y devuelva 
el número de segundos de los días, meses y años introducidos.*/

public class ejercicio1 {
    public static void main(String[] args) {
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);
        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);
    }

    public static int calcularSegundosEnUnAnio(int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}

