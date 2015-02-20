package Arrays;
import java.io.*;

public class Array01
{
	static int []numeros;
	
	public static void main(String[] args)
	{
		numeros = new int [pideInt("Numeros a Introducir: ")];
		
		int num;
		
		for(int a=0; a<numeros.length; a++)
		{
			num = pideInt("Numero "+(a+1)+": ");
			
			if(esPar(num) == true)
			{
				numeros[a] = num;
				mostrarArray();
			}
			else
			{
				a--;
				System.out.println("Numero Impar.");
			}
		}
		
		System.out.println("");
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
	    		 System.out.println("\t\tIntroduzca Nº");
	    		 correcto = false;
	    	 }
	    	 catch (IOException e)
	    	 {
	    		 System.out.println("\t\tSe ha producido un error: "+e);
	    		 
	    		 correcto = false;
	    	 }
	     }
	     while (!correcto);
	     return numero;
	 }
	 
	 static boolean esPar(int num)
	 {
		 if(num%2 == 0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 static void mostrarArray()
	 {
		 System.out.println("Numeros Introducidos");
		 
		 for(int a=0; a<numeros.length; a++)
		 {
			 System.out.print(numeros[a]+((a!=numeros.length-1)?"-":""));
		 }
		 System.out.println("");
	 }
}