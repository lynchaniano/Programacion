package Matrices;
import java.util.*;
//Matriz de n * m filas. Intercambiar la 1� fila con la 2�. Imprimir luego la matriz
public class SizeMatriz03
{
	private Scanner leer;
	private int[][] matriz;
	
	public static void main (String[] args)
	{
    	System.out.println("  -- Tama�oMatriz03 --");
    	SizeMatriz03 ma = new SizeMatriz03();
        ma.cargarMatriz();
        ma.intercambiar();
        ma.mostrarMatriz();
	}

	public void cargarMatriz()
	{
		int filas, columnas;
		leer = new Scanner(System.in);
		
		System.out.println("Tama�o Vector");
		System.out.print("N� Filas: ");
		filas = leer.nextInt();
		System.out.print("N� Columnas: ");
		columnas = leer.nextInt();
		
		matriz = new int[filas][columnas];
		
		for(int f=0; f<matriz.length; f++)
		{
			for(int c=0; c<matriz[f].length; c++)
			{
				System.out.print("Cargar Valor: ");
				matriz[f][c] = leer.nextInt();
			}
		}
	}

	public void intercambiar()
	{
        for(int c=0; c<matriz[0].length; c++)
        {
            int aux = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = aux;
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