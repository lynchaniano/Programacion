package EjerciciosARRAYS;
import java.io.*;
/*Hacer un programa que tenga un array con 10 números entre el 1 y el 99.
Ejemplo: int [] números= {12, 25, 7,..... 80}
Pedir números por teclado hasta que se introduzca uno de los 10 números del array.*/

public class Ejer17
{
	public static void main(String[] args) 
	{
		int numeros[] = new int[10];
		
		for(int a=0; a<numeros.length; a++)
		{
			numeros[a] = (int)(Math.random()*99);
		}
		
		System.out.println(" -- Acierta el Numero --");
		boolean acierto = false;
		
		do 
		{
			int num = pideInt("Numero: ");
			
			for(int a=0; a<numeros.length; a++)
			{
				if(numeros[a] == num)
				{
					acierto = true;
				}
			}
		} 
		while (acierto != true);
		System.out.println("Has Acertado");
	}
	
	
	static int pideInt(String texto)
	{
		String cadnum;
		int numero = 0;
		boolean correcto;
     
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
     
		do
		{
			try
			{
				correcto = true;
				System.out.print(texto);
				cadnum = teclado.readLine();
				numero = Integer.parseInt(cadnum);
			}
			catch(NumberFormatException e)
			{
				System.out.println("\t\t\t\tIntroduzca valor del 1 al 100");
				correcto = false;
			}
			catch (IOException e)
			{
				System.out.println("\t\t\t\tError Generico: "+e);
				correcto = false;
			}
		}
		while (correcto != true);
		return numero;
	 }
}