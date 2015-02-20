package EjerciciosARRAYS;
import java.io.*;

public class Libro174_9
{
	static int[][] matriz;
	
	public static void main(String[] args)
	{
		cargarMatriz();
		mostrarMatriz();
	}
	
    static void cargarMatriz()
    {        
        matriz = new int[pideInt("Nº de Filas: ")][5];
        
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
                System.out.print("Cargar Valor: ");
                matriz[f][c] = pideInt("Nº: ");
            }
        }
    }
    
    static void mostrarMatriz()
    {
        for(int f=0; f<matriz.length; f++)
        {
            for(int c=0; c<matriz[f].length; c++)
            {
            	System.out.print(matriz[f][c]+((f!=matriz.length&&c!=matriz.length-1)?"-":""));
            }
            System.out.println();
        }
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
