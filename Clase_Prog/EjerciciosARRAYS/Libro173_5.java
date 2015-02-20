package EjerciciosARRAYS;

import java.io.*;

public class Libro173_5 
{
	static int notas[] =  new int[10];
	static String nombres[] = new String[10];
	
	public static void main(String[] args)
	{
		llenarArray();
		calcularMedia();
	}
	
	static void llenarArray()
	{
		System.out.println("-- Sistemas Informaticos --");
		System.out.println("Nombre y notas");
		
		for(int a=0; a<notas.length; a++)
		{
			nombres[a] = pideCadena("Nombre "+(a+1)+": ");
			notas[a] = pideInt("Nota "+(a+1)+": ");
		}
	}
	
	static void calcularMedia()
	{
		int suma=0, media=0, mediados=0;
		
		for(int a=0; a<notas.length; a++)
		{
			suma = suma + notas[a];
		}
		media = suma/notas.length;
		
		System.out.println("");
		System.out.println("La media del modulo es: "+media);
		
		for(int a=0; a<notas.length; a++)
		{
			if(notas[a]>media)
			{
				mediados++;
			}
		}
		System.out.println("Hay "+mediados+" por encima de la media");
		
		for(int a=0; a<notas.length; a++)
		{
			if(notas[a]>media)
			{
				System.out.println(nombres[a]);
			}
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