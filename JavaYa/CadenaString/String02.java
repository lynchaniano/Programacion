package CadenaString;
import java.util.*;
//Ingresar apellido, nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.
//Realizar la carga del apellido y nombre en una variable de tipo String.
public class String02
{
	static Scanner leer;
	static String nombre1, nombre2;
	static int edad1, edad2;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		
		System.out.println("  -- String02--");
		System.out.print("Introduzca nombre y apellido: ");
		nombre1 = leer.nextLine();
		System.out.print("Introduzca edad: ");
		edad1 = leer.nextInt();
		System.out.print("Introduzca nombre y apellido: ");
		leer.nextLine();
		nombre2 = leer.nextLine();
		System.out.print("Introduzca edad: ");
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