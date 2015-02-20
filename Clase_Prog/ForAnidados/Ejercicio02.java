package ForAnidados;

public class Ejercicio02
{
	
	public static void main(String[] args)
	{
		int fila;
		int columna;
		int n = 5;
		
		for(fila = 0; fila<=5; fila++)
		{
			for(columna = 0; columna<n; columna++)
			{
				System.out.print("*");
	
			}
			System.out.println();
			n--;
		}
	}
}