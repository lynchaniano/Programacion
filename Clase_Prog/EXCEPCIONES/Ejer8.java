package EXCEPCIONES;
import java.util.*;

public class Ejer8
{	
	static Scanner leer;
	
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
		}while(divisor != 0);

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
			System.out.println("Division por 0. FIN");
			System.exit(0);
		}

		
		return cadena;
	}
	
	static int pideNumero()
	{
		leer = new Scanner(System.in);
		System.out.print("");
		int num = leer.nextInt();
		return num;
	}
}