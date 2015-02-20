package EXCEPCIONES;
import java.io.*;
//Pedir un número por teclado, si se introduce una letra, se volverá a pedir hasta que sea correcto.

public class Ejer4 
{
	public static void main(String[] args)
	{		
		//Creamos e Inicializamos la variable numero
		int numero = 0;
		while(numero == 0)//Mientras el numero sea 0 entra en el bucle
		{
			pideEntero("Numero: ");
		}
	}
	
	static int pideEntero(String texto)
	{
		String cadnum;
        int numero = 0;
        
        //Se creal el flujo de entrada de datos
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try
        {
        	System.out.print(texto);
            cadnum = teclado.readLine();
            numero = Integer.parseInt(cadnum);
        }
        catch(NumberFormatException e)
    	{
        	System.out.println("Tienes que introducir un Nº");
        }
        catch (IOException e)
    	{
        	System.out.println("Se ha producido un error");
        }
        
        return numero;
	}
}