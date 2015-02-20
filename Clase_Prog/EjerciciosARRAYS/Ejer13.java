package EjerciciosARRAYS;
import java.io.*;
//Pedir el año de nacimiento de una persona (pedirlo como cadena y no como número) y sumar todos sus dígitos, 
//si el resultado es mayor que diez, volver a sumar los dígitos hasta que dé como resultado un sólo dígito.

public class Ejer13 
{
	public static void main(String[] args) 
	{
		numSuerte();
	}
	
	static void numSuerte()
	{
		System.out.println("-- Numero de la Suerte --");
		String año = "";
		int suma=0;
		
		do
		{
			año = pideCadena("Año de Nacimiento: ");
			for(int a=0; a<año.length(); a++)
			{
				int num = Integer.parseInt(String.valueOf(año.charAt(a)));
				suma = suma + num;
			}
			
			String año2 = Integer.toString(suma);
			int suma2=0;
			
			if(año2.length() >= 2)
			{
				for(int a=0; a<año2.length(); a++)
				{
					int num = Integer.parseInt(String.valueOf(año2.charAt(a)));
					suma2 = suma2 + num;
				}
			}
			
			System.out.println(año+" --> "+suma+" --> "+suma2);
			
		}while(año=="");
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