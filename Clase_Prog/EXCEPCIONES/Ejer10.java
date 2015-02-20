package EXCEPCIONES;
import java.io.*;
//Ejercicio pag 126

public class Ejer10
{
	public static void main(String[] args) 
	{
		int num, suma=0, cont=0;
		boolean correcto = true;
		
		do
		{
			try
			{
				num = pedirEntero();
				suma = num + suma;
				cont ++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Nos salimos del programa por haber insertado letras");
				correcto = false;
			}
			catch (IOException e) 
			{
				System.out.println("Error en la entrada de Datos");
				System.exit(0);
			}
		}while(correcto != false);
		
		if(cont == 0)
		{
			System.out.println("No se vera la suma ya que no se ha insertado ningun valor bueno");
		}
		else
		{
			System.out.println("La suma de los numeros insertados es: "+suma);
		}
	}
	
	static int pedirEntero()throws IOException
	{
		int num=0;
		String cadNum;
		
		System.out.print("Inserte un numero: ");
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