package Matrices;
import java.util.*;
//Matriz 2 filas y 5 columnas. Carga de componentes por columnas
//Imprimir luego la matriz
public class CrearMatriz04
{
	private int[][] matriz;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- CrearMatriz04 --");
		CrearMatriz04 ma = new CrearMatriz04();
		ma.cargaMatriz();
		ma.mostrarMatriz();
	}
	
	public void cargaMatriz()
	{
		leer = new Scanner(System.in);
		matriz = new int[2][5];
		
		for(int c=0; c<5; c++)
		{
			System.out.println("_Columna"+c);
			for(int f=0; f<2; f++)
			{
				System.out.print("Cargar Valor: ");
				matriz[f][c] = leer.nextInt();
			}
		}
	}
	
	public void mostrarMatriz()
	{
		for(int f=0; f<2; f++)
		{
			for(int c=0; c<5; c++)
			{
				System.out.print(matriz[f][c]+" - ");
			}
			System.out.println();
		}
	}
}