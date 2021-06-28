import java.util.Scanner;

public class Comparacion{
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
            String nombre1="";
            String nombre2="";
        System.out.println("Por favor, ingrese el primer nombre: ");
        nombre1=entrada.nextLine();
        System.out.println("Por favor, ingrese el segundo nombre: ");
        nombre2=entrada.nextLine();
        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres ingresados son IGUALES");
        } else {
            System.out.println("Los nombres ingresados NO son IGUALES");
        } 
    }
}