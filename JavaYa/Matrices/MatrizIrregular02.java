package Matrices;
import java.util.*;
//Matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila... (crearla sin la intervención del operador)
public class MatrizIrregular02
{
	private Scanner leer;
	private int[][] matriz;
	
	public static void main(String[] args)
	{
    	System.out.println("  -- MatrizIrregular02 --");
        MatrizIrregular02 ma = new MatrizIrregular02();
        ma.cargarMatriz();
        ma.mostrarMatriz();
	}
	
	public void cargarMatriz()
	{
		leer = new Scanner(System.in);
		matriz = new int[5][];
		matriz [0] = new int[1];
		matriz [1] = new int[2];
		matriz [2] = new int[3];
		matriz [3] = new int[4];
		matriz [4] = new int[5];
		
		for(int f=0; f<matriz.length; f++)
		{
			for(int c=0; c<matriz[f].length; c++)
			{
				System.out.print("Ingresar Valor(linea"+f+"): ");
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
				System.out.print(matriz[f][c]+" - ");
			}
			System.out.println();
		}
	}
}