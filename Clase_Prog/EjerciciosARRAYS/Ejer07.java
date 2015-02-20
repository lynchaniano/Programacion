package EjerciciosARRAYS;
import java.io.*;
//Pedir 5 nombres (igual para 500) y decir cuál es el primero de la lista.
public class Ejer07 
{
	static String []nombres;
	
	public static void main(String[] args)
	{
		llenarArray();
		ordenarArray();
		motrarArray();
	}
	
	static public void llenarArray()
	{
		nombres = new String [pideInt("Nº de Nombres: ")];
		
		for(int a=0; a<nombres.length; a++)
		{
			nombres[a] = pideCadena("Nombre "+(a+1)+": ");
		}
	}
	
	static public void ordenarArray()
	{
		int vueltas = nombres.length-1;
		String aux;
		boolean ordenado = false;
		
		while(vueltas>0 && ordenado==false)
		{
			ordenado = true;
			
			for(int pos=0; pos<vueltas; pos++)
			{
				if(nombres[pos].compareToIgnoreCase(nombres[pos+1]) > 0)
				{
					aux = nombres[pos];
					nombres[pos] = nombres[pos+1];
					nombres[pos+1] = aux;
					ordenado = false;
				}
			}
			vueltas--;
		}
	}
	
	static public void motrarArray()
	{
		for(int a=0; a<nombres.length; a++)
		{
			System.out.println("Nombre:"+nombres[a]);
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