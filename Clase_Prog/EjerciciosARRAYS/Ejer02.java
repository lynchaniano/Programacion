package EjerciciosARRAYS;
import java.io.*;
//Crear un método para pedir el Nick de una persona, dicho método devolverá el Nick introducido, pero si se introduce un espacio en blanco 
//se lanzará una excepción que será controlada por el main volviendo a pedir el Nick. 
//El programa terminará cuando haya introducido un Nick correcto.

public class Ejer02 
{
	static boolean correcto = false;
	
	public static void main(String[] args)
	{
		do
		{
			String nick = pideCadena("Tu Nick: ");
			comprobarEspacios(nick);
			
		}while(correcto == false);
		
		System.out.println("Nick Valido");
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
	
	static public void comprobarEspacios(String nik)
	{
		for(int a=0; a<nik.length(); a++)
		{
			if(nik.charAt(a) == 32)
			{
				correcto = false;
				System.out.println("Nick Invalido");
				System.out.println("");
				break;
			}
			else
			{
				correcto = true;
			}
		}
	}
}