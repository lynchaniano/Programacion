package EXCEPCIONES2;
import java.io.*;
////Ejercicio del libro página 126. Pedir x numeros hasta introducir una letra. Sumar los numeros introducidos anteriormete pero sin 
//controlar los errores de insercion de datos

public class Ejer40_1
{
	public static void main(String[] args) 
	{
		int num, suma=0, cont=0;
		boolean correcto = true;
		
		do
		{
			try
			{
				num = pedirNumeroEntero();
				suma = num+suma;
				cont++;
			}
			catch (IOException e) 
			{
				System.out.println("Error introduccion datos. Adios");
				System.exit(0);
			}
		}while(correcto == true);
		
		if(cont == 0)
		{
			System.out.println("No se visualizara la suma, letras insertadas");
		}
		else
		{
			System.out.println("La suma es "+suma);
		}
		
		System.out.println("fin de Programa");
	}
	
	static int pedirNumeroEntero()throws IOException
	{
		int num = 0;
		String cadNum;
		
		System.out.print("Insertar Nº: ");
		cadNum = pedirCadena();
		
		try
		{
			num = Integer.parseInt(cadNum);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Letras en lugar de Nº");
			throw e;
		}
		
		return num;
	}
	
	static String pedirCadena()throws IOException
	{
		String cad = "";
		
		InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
		
		cad = teclado.readLine();
		return cad;
		
	}
	
}