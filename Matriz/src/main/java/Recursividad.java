import java.util.Scanner;

public class Recursividad {
    private int[][] matrizval = new int[3][5];
    int val1 = 0;
    int val2 = 0;
   
    public int[][] llenar_matriz(int i, int j, int filas, int columnas) {
        Scanner teclado = new Scanner(System.in);
        if (val1 == 0) {
            if (i < filas) {
                if (j < columnas) {
                    
                    System.out.println("Digite numero Entero de posicion: " + "["+i +"]["+j+"]");
                    matrizval[i][j] = teclado.nextInt(); // la puta madreeeeeeee >.< 
                    llenar_matriz(i, j + 1, filas, columnas);
                }
                if (j == columnas) {
                    llenar_matriz(i + 1, 0, filas, columnas);
                }
            } else {
                System.out.println("La Matriz se ha llenado");
                val1 = 1;
            }
        }
        return this.matrizval;
    }

    public void mostrar_matriz(int i, int j, int filas, int columnas) {
        if (val2 == 0) {
            if (i < filas) {
                if (j < columnas) {
                    System.out.print(matrizval[i][j]+"-");
                    mostrar_matriz(i, j + 1, filas, columnas);
                }
                if (j == columnas) {
                    System.out.println("");
                    mostrar_matriz(i + 1, 0, filas, columnas);
                }
            } else {
                val2 = 1;
            }
        }
    }
  
}