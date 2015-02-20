package Matrices;
import java.util.*;
//Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la �ltima fila.
public class SizeMatriz01
{
    private Scanner leer;
    private int[][] matriz;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Tama�oMatriz01 --");
    	SizeMatriz01 ma = new SizeMatriz01();
        ma.cargarMatriz();
        ma.mostrarMatriz();
        ma.mostrarUltimaFila();
    } 
    
    public void cargarMatriz()
    {
    	int filas, columnas;
        leer = new Scanner(System.in);
        
        System.out.print("N� de filas: ");
        filas = leer.nextInt();
        System.out.print("N� de columnas: ");
        columnas = leer.nextInt();
        
        matriz = new int[filas][columnas];
        
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
                System.out.print("Cargar Valor: ");
                matriz[f][c]=leer.nextInt();
            }
        }
    }
    
    public void mostrarMatriz()
    {
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
                System.out.print(matriz[f][c]+" - ");
            }
            System.out.println();
        }
    }
    
    public void mostrarUltimaFila()
    {
    	System.out.println("Ultima fila");
    	
        for(int c=0; c<matriz[matriz.length-1].length; c++)
        {
             System.out.print(matriz[matriz.length-1][c]+" - ");
        }
    }  
}