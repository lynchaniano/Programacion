package EXCEPCIONES2;
import java.io.*;
//Introducir 6 numeros y calcular su medio controlando los errores

public class Ejer40_2
{
	public static void main(String[] args)
	{
		int num, suma=0;
		
		for(int a=0; a<6; a++)	//Repetimos 6 veces la peticion de los valores numericos
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
	
	static int pedirEntero()throws IOException	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
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
	
	static String pedirCadena()throws IOException	//Metodo para la lectura de cadenas de texto controlando los posibles fallos al inserta valores incorrectos
	{
		String cad = "";
		InputStreamReader via = new InputStreamReader(System.in);
		BufferedReader tecla = new BufferedReader(via);
		
		cad = tecla.readLine();
		return cad;
	}
}