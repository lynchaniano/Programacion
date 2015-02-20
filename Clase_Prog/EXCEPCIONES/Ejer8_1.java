package EXCEPCIONES;
import java.util.*;
//Sobre el ejercicio anterior, modificarlo para que realice obligatoriamente 5 divisiones.

public class Ejer8_1
{	
	static Scanner leer;
	static int cont = 0;
	
	public static void main(String[] args)
	{
		int dividendo, divisor;
		
		do
		{
			System.out.print("Dividendo: ");
			dividendo = pideNumero();
			System.out.print("Divisor: ");
			divisor = pideNumero();
			System.out.println(muestraResultado(dividendo, divisor));
			System.out.println("");
		}while(cont != 5);
		
		System.out.println("Fin Programa");

	}	
	
	static String muestraResultado(int a, int b)
	{
		String cadena = "";
		
		try
		{
			int resultado = a/b;
			cadena = "Cociente: "+resultado;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division por 0.");
		}
		
		cont++;
		
		return cadena;
	}
	
	static int pideNumero()
	{
		leer = new Scanner(System.in);
		int num;
		System.out.print("");
		num = leer.nextInt();
		return num;
	}
}