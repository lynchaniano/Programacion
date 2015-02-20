package EjerciciosARRAYS;
import java.io.*;
//Hacer un programa que pida una palabra y la deletree separada por guiones. No hace falta usar la clase Pantalla.

public class Ejer01
{	
	public static void main(String[] args)
	{
		String palabra = "";
		do
		{
			palabra = pideCadena("Introducir Palabra: ");
			
			trocear(palabra);
			
		}while(palabra != "fin");

	}
	
	static void trocear(String palabra)
	{
		for(int a=0; a<palabra.length(); a++)
		{
			System.out.print(palabra.charAt(a)+((a!=palabra.length()-1)?"-":""));
		}
		System.out.println();
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