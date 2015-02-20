package EjerciciosARRAYS;
import java.io.*;

//Primer Ejemplo de Arrays, pedir la nota de 5 alumnos (o 500) y luego mostrarlas.
public class Ejer14 
{
	static int notas[];
	
	public static void main(String[] args)
	{
		int num = pideInt("Nº de Alumnos: ");
		notas = new int[num];
		
		System.out.println();
		for(int a=0; a<notas.length; a++)
		{
			notas[a] = pideInt("Nota Alumno "+(a+1)+": ");
		}
		
		System.out.println();
		System.out.println(" -- Notas --");
		for(int a=0; a<notas.length; a++)
		{
			System.out.println("Alumno "+(a+1)+" --> "+notas[a]);
		}
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