package EXCEPCIONES;
import java.io.*;
//Hacer el 2º ejercicio de la página 128 del libro

public class Ejer11
{
	public static void main(String[] args)
	{
		int num, suma=0;
		
		for(int a=0; a<6; a++)
		{
			try
			{
				System.out.print("Nº"+(a+1)+": ");
				num = pedirEntero();
				suma = num + suma;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Letra Introducida");
			}
			catch (IOException e) 
			{
				System.out.println("Error en la entrada de Datos");
			}
		}
		
		System.out.println("La media de los numeros insertados es: "+(suma/6));

	}
	
	static int pedirEntero()throws IOException
	{
		int num=0;
		String cadNum;
		
		cadNum = pedirCadena();
		
		try
		{
			num = Integer.parseInt(cadNum);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Letra Insertada");
			throw e;
		}
		
		return num;
	}
	
	static String pedirCadena()throws IOException
	{
		String cad = "";
		InputStreamReader via = new InputStreamReader(System.in);
		BufferedReader tecla = new BufferedReader(via);
		
		cad = tecla.readLine();
		return cad;
	}
}