package EjerciciosSueltos;
//100 primeros numeros pares

public class While03
{

	public static void main(String[] args)
	{
		int contador = 0;
		int cantidad = 0;
		
		while(cantidad <= 100)
		{
			System.out.println(contador);
			contador = contador + 2;
			cantidad ++;
		}
	}
}