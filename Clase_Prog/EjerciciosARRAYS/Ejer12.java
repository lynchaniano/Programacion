package EjerciciosARRAYS;
import java.io.*;
//Crear un programa en java que te pida una frase por teclado y te muestra cuantas vocales hay y cuantas consonantes.

public class Ejer12 
{
	public static void main(String[] args) 
	{
		contarLetras();
	}
	
	static void contarLetras()
	{
		int contV = 0, contC=0;
		char vocales[] = {'A','E','I','O','U'};
		char consonantes[] = {'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
		
		System.out.println(" --Introducir Cadena --");
		String cadena = pideCadena("Frase: ");
		
		for(int a=0; a<cadena.length(); a++)
		{
			for(int b=0; b<vocales.length; b++)
			{
				if(cadena.toUpperCase().charAt(a) == vocales[b])
				{
					contV++;
				}
			}
				
			for(int c=0; c<consonantes.length; c++)
			{
				if(cadena.toUpperCase().charAt(a) == consonantes[c])
				{
					contC++;
				}
			}
		}
		
		System.out.println("Nº de Vocales --> "+contV);
		System.out.println("Nº de Consonantes --> "+contC);
		
	}
	
	static public String pideCadena(String texto)	
    {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadnum = null;
        System.out.print(texto);
        
        try 
        {
            cadnum = teclado.readLine();
        } 
        catch (IOException ex) 
        {
            System.out.println("\tHay errores: "+ex);
        }
        return cadnum;
    }
	
}