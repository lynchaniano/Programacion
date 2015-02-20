package EXCEPCIONES;
import java.io.*;
//Igual que el anterior, pero cuando se haya introducido 5 veces mal, el programa terminará.

public class Ejer4_1
{
	static int fallo = 0;
	
	public static void main(String[] args)
	{
		do
		{
			System.out.println("Nº fallos: "+fallo);
			pideEntero("Numero: ");
		}
		while(fallo != 5);

		System.out.println("Has fallado "+fallo+" veces.");
		System.out.println("Fin de Programa");
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
        	System.out.println("Introduce Nº");
        	fallo++;
        }
        catch (IOException e)
    	{
        	System.out.println("Se ha producido un error");
        	fallo++;
        }
        
        return numero;
	}
}