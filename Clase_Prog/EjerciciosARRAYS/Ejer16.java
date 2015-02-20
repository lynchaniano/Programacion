package EjerciciosARRAYS;
import java.io.*;

//Hacer un programa en Java que pida una frase por teclado y luego te diga cuantas veces aparecen cada una de las vocales.
public class Ejer16 
{
	
	public static void main(String[] args)
	{
		calcularVocales();
	}
	
	static void calcularVocales()
	{
		char vocales[] = {'A','E','I','O','U'};
		int contadores[] = new int[5];
		
		String cadena = pideCadena("Introducir palabra: ");
		
		for(int a=0; a<vocales.length; a++)
		{
			for(int b=0; b<cadena.length(); b++)
			{
				if(vocales[a] == cadena.toUpperCase().charAt(b))
				{
					contadores[a] = contadores[a] +1;
				}
			}
		}
		
		for(int a=0; a<vocales.length; a++)
		{
			System.out.print(vocales[a]);
		}
		System.out.println();
		for(int a=0; a<vocales.length; a++)
		{
			System.out.print(contadores[a]);
		}
	}
	
	
	//Metodo para la lectura de Cadenas de texto controlando los posibles fallos al inserta valores incorrectos
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
        catch (IOException e) 
        {
            System.out.println("Hay errores: "+e);
        }
        return cadnum;
    }
}