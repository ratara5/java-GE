import java.util.Scanner;

public class Matriz{
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int canFilas=0, canColumnas=0;
        System.out.println("Ingrese la cantidad de filas deseadas");
        canFilas=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas deseadas");
        canColumnas=entrada.nextInt();
        System.out.println("Crearás una matriz de "+canFilas+" filas y "+canColumnas+" columnas");

        int matriz[][]=new int [canFilas][canColumnas];
        for(int i=0; i<=canFilas-1; i++){
            for(int j=0; j<=canColumnas-1; j++){
                System.out.println("Ingrese el elemento de la fila "+i+", columna "+j);
                matriz[i][j]=entrada.nextInt();
            }        
        }
        for(int i=0; i<=canFilas-1; i++){
            System.out.print("Fila "+i+" [");
            for(int j=0; j<=canColumnas-1; j++){
                if(j<=canColumnas-1-1){
                    System.out.print(matriz[i][j]+", ");
                } else {
                    System.out.print(matriz[i][j]);
                }     
            }        
            System.out.println("]");
        }

    }
}