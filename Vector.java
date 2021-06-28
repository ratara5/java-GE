import java.util.Scanner;

public class Vector{
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int longitud=0;
        int numeros[]=new int[5];
        System.out.println("Ingrese la longitud deseada para el vector");
        longitud=entrada.nextInt();
        for(int i=0; i<longitud; i++){
            System.out.println("Ingrese el elemento en la posición "+i+" del vector");
            numeros[i]=entrada.nextInt();
        }
        System.out.print("El vector construido es: [");
        for(int i=0; i<longitud; i++){
            if(i<longitud-1){
                System.out.print(numeros[i]+", ");
            } else {
               System.out.print(numeros[i]); 
            }
        }
        System.out.print("]");
        
    }
}