package Deberes;
import java.util.*;

public class ejerif
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		System.out.print("Introducir Año: ");
		int año = leer.nextInt();
		
		if(año%4 == 0)
		{
			System.out.println("Año Bisiesto");
		}
		
		if(año%100 == 0)
		{
			System.out.println("Año NO Bisiesto");
		}
		
		if(año%400==0)
		{
			System.out.println("Año Bisiesto");
		}
	}
}



/*Implementar una aplicación en Java que nos permita introducir un año por teclado y nos diga si el año es bisiesto o no.
 * Nota: Cómo saber si un año va a ser bisiesto

Los años bisiestos son los divisibles entre 4 (como 2004, 2008, etc.)
Excepto si es divisible entre 100, entonces no es bisiesto (como 2100, 2200, etc.)
Excepto si es divisible entre 400, entonces sí (como 2000, 2400)*/