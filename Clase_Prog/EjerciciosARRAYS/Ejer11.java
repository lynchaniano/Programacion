package EjerciciosARRAYS;
import java.io.*;
//Buscar y Reemplazar: Haz un programa en java que pida un texto y luego una palabra a buscar y otra para reemplazarla. 
//Finalmente mostrar el texto con la palabra cambiada. No se puede usar replace ni replaceAll y hay que utilizar indexOf y substring.

public class Ejer11 
{
	public static void main(String[] args) 
	{
		System.out.println("  --Buscar y Reemplazar--");
		String cadena = pideCadena("Frase: ");
		String palabra = pideCadena("Palabra a buscar: ");
		
		int inicio = cadena.indexOf(palabra);
		int fin = (inicio+(palabra.length()));
		
		if(inicio<0)
		{
			System.out.println("No se encuentra '"+palabra+"'");
		}
		else
		{
			String reemplazo = pideCadena("Reemplazar '"+palabra+"' por: ");
			String cadenaPrin = cadena.substring(0, inicio);
			String cadenaFin = (cadena.substring(fin, cadena.length()));
			String encotrada = cadena.substring(inicio, fin);
			encotrada = reemplazo;

			System.out.println();
			System.out.println(cadenaPrin+encotrada+cadenaFin);	
		}
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