import java.util.Scanner;

public class Calculadora{
    public static void main(String []args){
        Scanner opcionSel=new Scanner(System.in);
        int opcion=0, num1=0, num2=0, resultado=0;

        System.out.println("Selecciona 1: suma / 2:resta / 3:multiplicación");
        opcion=opcionSel.nextInt(); /* Leer de derecha a izquierda. Método nextInt(); hace una pausa a espera de que usuario ingrese un entero y dé enter. Tambièn està el mètodo nextLine(); . Alt + Z para activar ajuste automàtico de línea*/

        System.out.println("Dame el primer número");
        num1=opcionSel.nextInt();
        
        System.out.println("Dame el segundo número");
        num2=opcionSel.nextInt();
        
        if(opcion==1){
            resultado=num1+num2;
        }else if(opcion==2){
            resultado=num1-num2;
        }
        else if(opcion==3){
            resultado=num1*num2; 
        }
        System.out.println("El resultado de la operación dada por la opción "+opcion+" es: "+resultado);
    }
}