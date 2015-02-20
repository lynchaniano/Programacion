package EjerciciosSueltos;

public class anidados
{
	public static void main(String[] args)
	{
		int altura = 4;
		int anchura = 3;
		
		int columnaCount = 0;
		int filaCount = 0;
		
		while(filaCount < altura)
		{
			columnaCount = 0;
			
			while(columnaCount < anchura)
			{
				System.out.print("X");
				columnaCount++;
			}
			
			System.out.println();
			filaCount++;
		}
	}
}