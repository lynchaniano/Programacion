package EjerciciosARRAYS;
import java.io.*;
//Hacer un programa que pida dos nombres y te diga si son iguales. 
//Si son distintos los muestra ordenados. Finalmente muestra los dos nombres en mayúsculas y en minúsculas.

public class Ejer04 
{
	public static void main(String[] args) 
	{
		String cadena1, cadena2;
		
		cadena1 = pideCadena("Nombre 1: ");
		cadena2 = pideCadena("Nombre 2: ");
		
		if(cadena1.equalsIgnoreCase(cadena2))
		{
			System.out.println("Los Nombres "+cadena1+" y "+cadena2+" son iguales");
		}
		else
		{
			System.out.println("Los Nombres "+cadena1+" y "+cadena2+" NO son iguales");
		}
		System.out.println("");
		
		if(cadena1.compareToIgnoreCase(cadena2) < 0)
		{
			System.out.println(cadena1+" es mayor que "+cadena2);
		}
		else
		{
			System.out.println(cadena2+" mayor que "+cadena1);
		}
		System.out.println("");
		
		System.out.println("-- Minusculas --");
		System.out.println(cadena1.toLowerCase());
		System.out.println(cadena2.toLowerCase());
		
		System.out.println("");
		
		System.out.println("-- Mayusculas --");
        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena2.toUpperCase());
	}
	
	//Metodo para la lectura de Cadenas de texto controlando los posibles fallos al inserta valores incorrectos
	static public String pideCadena(String texto)	
    {    InputStreamReader flujo = new InputStreamReader(System.in);
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