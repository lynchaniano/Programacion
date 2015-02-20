package EXCEPCIONES;
import java.io.*;
//Utilizando un for, pedir 5 números por teclado.  Hay que asegurarse de que los 5 se introducen adecuadamente.  Se puede usar break y/o continue.

public class Ejer6
{
	public static void main(String[] args)
	{
		//Creamos el for para pedir los 5 numeros
		for(int a = 0; a<5; a++)
		{
			pideInt("Numero: ");
		}
	}
	
	static int pideInt(String texto)
	{
        String cadnum;
        int numero = 0;
        boolean correcto;
        
        //Se creal el flujo de entrada de datos
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
            	System.out.println("Introduce Nº");
                correcto = false;
            }
            catch (IOException e)
        	{
            	System.out.println("Se ha producido un error");
                correcto = false;
            }
        }
        while (!correcto);
        return numero;
    }
}