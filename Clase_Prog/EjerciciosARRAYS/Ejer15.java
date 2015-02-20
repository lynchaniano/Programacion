package EjerciciosARRAYS;
import java.io.*;
//Hacer un programa java que pida números del 1 al 7 y muestre el día de la semana que corresponde, 
//cuando meta un número superior o inferior,el programa termina.
public class Ejer15 
{
	public static void main(String[] args) throws IOException 
	{
		String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int dia = 0;
		
		dia = pideInt("Nº de la Semana: ");
		
		while(dia>1 || dia<7)
		{
			System.out.println("Es "+dias[dia-1]);
			dia = pideInt("Nº de la Semana: ");
		}
		
		System.out.println("Fin del Programa");
	}
	
	static int pideInt(String texto)
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
				System.out.println("\t\t\t\tIntroduzca valor del 1 al 100");
				correcto = false;
			}
			catch (IOException e)
			{
				System.out.println("\t\t\t\tError Generico: "+e);
				correcto = false;
			}
		}
		while (correcto != true);
		return numero;
	 }
}