package EXCEPCIONES2;
import java.io.*;
//Ejercicio de la página 121 del libro.

public class Ejer33 
{
	public static void main(String[] args)throws IOException
	{
		int divid, divis, coc, resto;
		
		System.out.println("Vamos a llevar a cabo varias divisiones");
		System.out.println();
		
		for(int a=0; a<6; a++)	//bucle para realizar la repeticion de divisiones
		{
			System.out.println("Division Nº"+(a+1));
			divid = pideInt("Dividendo :");;
			divis = pideInt("Divisor: ");
			
			coc = divid/divis;
			resto = divid%divis;
			
			System.out.println(divid+"/"+divis+"="+coc);
			System.out.println("Resto: "+resto);
			System.out.println("");
		}
	}
	
	static int pideInt(String texto)	//Metodo para pedir un entero controlando que se introducen solo enteros
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