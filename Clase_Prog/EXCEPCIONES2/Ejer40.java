package EXCEPCIONES2;
import java.io.*;
//Ejercicio del libro página 126. Pedir x numeros hasta introducir una letra. Sumar los numeros introducidos anteriormete

public class Ejer40
{
	public static void main(String[] args) 
	{
		int num, suma=0, cont=0;
		boolean correcto = true;
		
		do //Hacer mientras correcto sea igual a true
		{
			try
			{
				num = pedirNumeroEntero();
				suma = num+suma;
				cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Nos salimos del Prog, letra insertada");
				correcto = false;
			}
			catch (IOException e) 
			{
				System.out.println("Error introduccion datos. Adios");
				System.exit(0);
			}
		}while(correcto == true);
		
		if(cont == 0)	//Si al principio del prograa se inserta una letra
		{
			System.out.println("No se visualizara la suma, letras insertadas");
		}
		else	//Si durante el programa se inserta una letra
		{
			System.out.println("La suma es "+suma);
		}
		
		System.out.println("fin de Programa");
	}
	
	static int pedirNumeroEntero()throws IOException	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
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
	
	static String pedirCadena()throws IOException ////Metodo para la lectura de cadenas de textos controlando los posibles fallos al inserta valores incorrectos
	{
		String cad = "";
		
		InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
		
		cad = teclado.readLine();
		return cad;
		
	}
}