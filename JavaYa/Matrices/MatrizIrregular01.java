package Matrices;
import java.util.*;
//Crear Matriz irregular y luego imprimir la matriz en forma completa.
public class MatrizIrregular01
{
    private Scanner leer;
    private int[][] matriz;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- MatrizIrregular01 --");
        MatrizIrregular01 ma = new MatrizIrregular01();
        ma.cargarMatriz();
        ma.mostrarMatriz();
    } 
    
    public void cargarMatriz()
    {
    	int filas, columnas;
        leer = new Scanner(System.in);
        
        System.out.print("Nº Filas: ");
        filas = leer.nextInt();
        matriz = new int[filas][];
        
        for(int f=0; f<matriz.length; f++)
        {
            System.out.print("Nº columnas en la fila " + f + ": ");
            columnas = leer.nextInt();
            matriz[f] = new int[columnas];
            
            for(int c=0; c<matriz[f].length; c++)
            {
                System.out.print("Ingrar Valor: ");
                matriz[f][c] = leer.nextInt();
            }
        }
    }
    
    public void mostrarMatriz()
    {
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }  
}