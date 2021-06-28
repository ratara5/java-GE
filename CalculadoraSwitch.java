import java.util.Scanner;

public class CalculadoraSwitch{
    public static void main(String []args){
        Scanner seleccion=new Scanner(System.in);
        int operacion=0, num1=0, num2=0, resultado=0;
        System.out.println("CALCULADORA");
        System.out.println("Selecciona la operación \n1. Suma \n2. Resta \n3. Multiplicación \n4. División");
        operacion=seleccion.nextInt();
        System.out.println("Ingresa el primer número");
        num1=seleccion.nextInt();
        System.out.println("Ingresa el segundo número");
        num2=seleccion.nextInt();
        switch(operacion){
            case 1: resultado=num1+num2;
                    System.out.println("El resultado de la suma es: "+resultado);
                    break;
            case 2: resultado=num1-num2;
                    System.out.println("El resultado de la resta es: "+resultado);
                    break;
            case 3: resultado=num1*num2;
                    System.out.println("El resultado de la multiplicación es: "+resultado);
                    break;
            case 4: resultado=num1/num2;
                    System.out.println("El resultado de la división es: "+resultado);
                    break;
            default: System.out.println("La opción ingresada no existe");
                     break;
        }

    }
}