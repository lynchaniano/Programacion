package ForAnidados;

public class Ejercicio06
{	
	public static void main(String[] args)
	{
		int fila, columna, espacio;
		int n = 9;
		int e = 0;
		
		for(fila = 0; fila<5; fila++)
		{
			for(espacio = 0; espacio<e; espacio++)
			{
				System.out.print(" ");
			}
			e++;
			
			for(columna = 0; columna<n; columna++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			n = n - 2;
		}
	}
}