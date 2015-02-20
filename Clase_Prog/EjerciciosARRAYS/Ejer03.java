package EjerciciosARRAYS;
import java.io.*;
//Tenemos escrita una frase en la variable frase, pediremos al usuario que introduzca un número (pideNum) y 
//le mostraremos la letra que corresponde con ese número. Hay que controlar todas las excepciones en el main. 
//El programa termina cuando el número introducido sea negativo.

public class Ejer03 
{
	public static void main(String[] args)
	{
		int num = 0;
		String frase = "Los Recueros se Perderan como lagrimas en la LLuvia..";
		System.out.println(frase);
		
		do
		{
			num = pideInt("Introducir Nº: ");
			
			if(num >= 0)
			{
				System.out.println("Letra Correspondiente: "+frase.charAt(num));
			}
			else
			{
				System.out.println("Fin del Programa");
				System.exit(0);
			}
			System.out.println("");
			
		}while(num >= 0);
		
	}
	
    static public int pideInt(String texto)	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
	{
        String cadnum;
        int numero = 0;
        boolean correcto;
        
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
            	System.out.println("Introduzca Nº");
                correcto = false;
            }
            catch (IOException e)
        	{
            	System.out.println("Se ha producido un error: "+e);
                correcto = false;
            }
        }
        while (!correcto);
        return numero;
    }
}