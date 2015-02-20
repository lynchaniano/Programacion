package EXCEPCIONES2;
import java.io.*;
//Clase creada para la lectura de Integers, String y Floats

public class Ejer35_Pantalla
{    
    public int pideInt(String texto)	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
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
    
    public float pideFloat(String texto)	//Metodo para la lectura de cadenas de texto controlando los posibles fallos al inserta valores incorrectos
    {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadnum;
        float numero = 0;
        boolean correcto;
        
        do
        {
        	try
        	{
        		correcto = true;
                System.out.print(texto);
                cadnum=teclado.readLine();
                numero=Float.parseFloat(cadnum);
            }
            catch (NumberFormatException e) 
        	{
                System.out.println("Introduzca Nº");
                correcto=false;
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
    
    public String pideCadena(String texto)	//Metodo para la lectura de Float controlando los posibles fallos al inserta valores incorrectos
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