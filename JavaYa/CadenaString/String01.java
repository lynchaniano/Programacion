package CadenaString;
import java.util.*;
//Ingresar nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.
public class String01
{
	static Scanner leer;
	static String nombre1, nombre2;
	static int edad1, edad2;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		System.out.println("  -- String01 --");
		System.out.print("Ingrese Nombre 1: ");
		nombre1 = leer.next();
		System.out.print("Ingrese Edad 1: ");
		edad1 = leer.nextInt();
		System.out.print("Ingrese Nombre 2: ");
		nombre2 = leer.next();
		System.out.print("Ingrese Edad 2: ");
		edad2 = leer.nextInt();
		
		if(edad1>edad2)
		{
			System.out.println(nombre1+" es mayor que "+nombre2);
		}
		else
		{
			System.out.println(nombre2+" es mayor que "+nombre1);
		}
	}
}
