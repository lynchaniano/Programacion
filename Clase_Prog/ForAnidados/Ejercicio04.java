package ForAnidados;

public class Ejercicio04
{
	
	public static void main(String[] args)
	{
		int fila;
		int columna;
		int n = 1;
		int e=1;
		
		for(fila = 0; fila<5; fila++)
		{
			e=1;
			for(columna = 0; columna<n; columna++)
			{
				System.out.print(e);
				e++;
			}
			System.out.println();
			n++;
		}
	}
}