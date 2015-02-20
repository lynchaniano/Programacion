package Matrices;
import java.util.*;
//Matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena.
public class SizeMatriz02
{
	private Scanner leer;
	private int[][] matriz;
	
	public static void main(String[] args)
	{
    	System.out.println("  -- Tama�oMatriz02 --");
    	SizeMatriz02 ma = new SizeMatriz02();
        ma.cargarMatriz();
        ma.mostrarMatriz();
        ma.mostrarMayor();
	}
	
	public void cargarMatriz()
	{
		int filas, columnas;
		leer = new Scanner(System.in);
		
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
	
	public void mostrarMayor()
	{
    	int numeroMayor = matriz[0][0];
    	int filamay = 0;
    	int columnamay = 0;
    	
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
                if (matriz[f][c]>numeroMayor)
                {
                    numeroMayor = matriz[f][c];
                    filamay = f;
                    columnamay = c;
                }
            }
        }
        
        System.out.println("El N� mayor es: "+numeroMayor);
        System.out.println("En la fila: "+filamay+ " y columna: "+columnamay);
    }

}