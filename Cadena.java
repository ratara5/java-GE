import java.util.Scanner;

public class Cadena{
    public static void main(String args[]){
        String ingresada="", cortada="";
        int numCaracteres=0, primerPunto=0, segundoPunto=0;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Por favor, ingrese la cadena: ");
        ingresada=entrada.nextLine();

        numCaracteres=ingresada.length();
        System.out.println("La cadena: "+ingresada+ " tiene "+numCaracteres+ "caracteres");
        System.out.println("");

        System.out.println("Ingrese el primer punto de corte");
        primerPunto=entrada.nextInt();
        System.out.println("Ingrese el segundo punto de corte");
        segundoPunto=entrada.nextInt();

        cortada=ingresada.substring(primerPunto, segundoPunto);
        System.out.println("Esta es la cadena cortada: "+cortada);
        }
}