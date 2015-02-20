package Matrices;
import java.util.*;
//Matriz de 3 filas por 4 columnas. Imprimir la primer fila, la última fila e imprimir la primer columna.
public class CrearMatriz03
{
	private int[][] matriz;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- CrearMatriz03 --");
		CrearMatriz03 ma = new CrearMatriz03();
		ma.cargarMatriz();
		ma.mostrarMatriz();
	}

	public void cargarMatriz()
	{
		leer = new Scanner(System.in);
		matriz = new int[3][4];
		
		for(int f=0; f<3; f++)
		{
			for(int c=0; c<4; c++)
			{
				System.out.print("Introducir Valor: ");
				matriz[f][c] = leer.nextInt();
			}
		}
	}
	
	public void mostrarMatriz()
	{
		System.out.println("- Prmera Fila");
		for(int f=0; f<1; f++)
		{
			for(int c=0; c<4; c++)
			{
				System.out.print(matriz[f][c]+" - ");
			}
			System.out.println();
		}
		
		System.out.println("- Ultima Fila");
		for(int f=2; f<3; f++)
		{
			for(int c=0; c<4; c++)
			{
				System.out.print(matriz[f][c]+" - ");
			}
			System.out.println();
		}
		
		System.out.println("- Primera Columna");
		for(int f=0; f<3; f++)
		{
			for(int c=0; c<=0; c++)
			{
				System.out.print(matriz[f][c]+" - ");
			}
			System.out.println();
		}
	}
}