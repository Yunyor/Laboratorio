import java.util.Scanner;

public class LlenarMatriz {
  
    public static void main(String[] args) {
        Recursividad matriz_recursiva = new Recursividad();
        int[][] matriz = matriz_recursiva.llenar_matriz(0, 0, 3, 5);
        
        System.out.println("Matriz Generada:");
        System.out.println("");
        System.out.println("");
        matriz_recursiva.mostrar_matriz(0, 0, 3, 5);
    }
}