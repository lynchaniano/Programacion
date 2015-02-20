package EjerciciosARRAYS;
import java.io.*;
//Igual que el anterior, pero hacer un método que le suba la nota a todos los alumnos que hayan superado la nota media, 
//y otro método que muestre las notas de todos los alumnos.

public class Ejer14_1 
{
	static int notas[];
	
	public static void main(String[] args)
	{
		cargarNotas();
		subirMedia();
		mostrarAlumnos();
	}
	
	static void cargarNotas()
	{
		int num = pideInt("Nº de Alumnos: ");
		notas = new int[num];
		
		System.out.println();
		for(int a=0; a<notas.length; a++)
		{
			notas[a] = pideInt("Nota Alumno "+(a+1)+": ");
		}
	}
	
	static void subirMedia()
	{
		int media = 0;
		for(int a=0; a<notas.length; a++)
		{
			media = media + notas[a];
		}
		media = (media/notas.length);
		System.out.println();
		System.out.println("La media es: "+media);
		
		for(int a=0; a<notas.length; a++)
		{
			if(notas[a] > media)
			{
				notas[a] = notas[a] + 1;
			}
		}
	}
	
	static void mostrarAlumnos()
	{
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