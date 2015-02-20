package EXCEPCIONES2;
import java.io.*;
//No esta Terminado

public class Ejer34
{
	public static void main(String[] args)throws IOException
	{
		//Creamos el fulo para poder leer del teclado
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		String cadnum;
		int divid, divis, coc, resto;
		
		System.out.println("Vamos a llevar a cabo varias divisiones");
		
		for(int a=0; a<6; a++)	//bucle para realizar la repeticion de divisiones
		{
			System.out.println("Division Nº"+(a+1));
			System.out.print("Dividendo: ");
			cadnum = teclado.readLine();
			divid = Integer.parseInt(cadnum);
			
			System.out.print("Divisor: ");
			cadnum = teclado.readLine();
			divis = Integer.parseInt(cadnum);
			
			coc = divid/divis;
			resto = divid%divis;
			
			System.out.println(divid+"/"+divis+"="+coc);
			System.out.println("Resto: "+resto);
			System.out.println("");
		}
	}
}