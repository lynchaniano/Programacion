package Ferreteria;
import java.util.*;

public class Pantalla
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
	}
	
	public static int menu1()//Muestra la primera pantalla y devuelve la opción elegida en un entero.
	{
		leer = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("**************************");
		System.out.println("********** ACME **********");
		System.out.println("**************************");
		System.out.println(" ");
		System.out.println("1.- VENDEDOR - (Juan)");
		System.out.println("2.- VENDEDOR - (Maria)");
		System.out.println("otro.- TERMINAR");
		System.out.print("Opcion: ");
		opcion = leer.nextInt();
		
		return opcion;
		/*switch (opcion)
		{
			case 1:
			
			break;
			
			case 2:
				
			break;

			default:
			break;
		}*/
	}
	
	public static int menu2()//Muestra la segunda pantalla y devuelve la opción elegida en un entero.
	{
		int op = 0;
		
		return op;
	}
	
	public static float pideImporte(String texto)//muestra el texto y devuelve el float que se introduce por teclado.
	{
		float op = 0;

		return op;
	}
	
}