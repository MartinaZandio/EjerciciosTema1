/*Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. Calcular además cuantos 
hay (ver operaciones sobre arrays) y visualizar cada uno de ellos. Utilizar una función que reciba el 
número de múltiplos de 5 y devuelva un array conteniedo todos los múltiplos de 5 desde el valor del parámetro 
begin hasta el valor del parámetro end. Realizar otra función que dado un array como parámetro, lo recorra de 
inicio a fin y devuelva la suma de todos sus valores. */

public class ejercicio3 {
    public static void main(String[]args){
        int[] multiplos5 = CalcularMultiplos(1,100);
        int suma = SumaMultiplos(multiplos5);
        System.out.println("El numero de multiplos de 5 totales entre 1 y 100 es: "+multiplos5.length);
        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: "+suma);

    }
    public static int[] CalcularMultiplos(int begin, int end){
        int[] multiplos5 = new int[100];
        int contador = 0;
        int i,j;

        for(i=begin;i<end;i++){
            if(i%5==0){
                multiplos5[contador]=i;
                contador++;
                System.out.println("Un múltiplo de 5 es:"+i);
            }
        }
        
        int[] multiplosreales = new int[contador];
        for(j=0;j<contador;j++){
            multiplosreales[j]=multiplos5[j];
        }
        
        return multiplosreales;
    }  

   public static int SumaMultiplos(int[] multiplos5){
    int suma = 0;
    for(int i=0;i<multiplos5.length;i++){
        suma+=multiplos5[i];
    }
    return suma;
   }                                                                                                                                       
}
