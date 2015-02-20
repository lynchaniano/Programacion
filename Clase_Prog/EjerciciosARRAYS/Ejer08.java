package EjerciciosARRAYS;
import java.io.*;
//Pedir una cadena por teclado y mostrarla invertida. Ejemplo: hola --> aloh

public class Ejer08 
{
	public static void main(String[] args) 
	{
		String cadena = pideCadena("Introducir Palabra: ");
		invertirCadena(cadena);
	}
	
	static public void invertirCadena(String cadena)
	{
		int num = cadena.length()-1;
		
		for(int a=0; a<cadena.length(); a++)
		{
			System.out.print(cadena.charAt(num));
			num--;
		}
	}
	
	static public String pideCadena(String texto)	//Metodo para la lectura de Cadenas de texto controlando los posibles fallos al inserta valores incorrectos
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