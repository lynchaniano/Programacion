package CadenaString;
import java.util.*;
//Ingresar dos apellidos. Mostrar un mensaje si son iguales o distintos.
public class String03
{
	static Scanner leer;
	static String ape1, ape2;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		System.out.println("  -- String03 --");
		System.out.print("Apellido1: ");
		ape1 = leer.next();
		System.out.print("Apellido2: ");
		ape2 = leer.next();
		
		if(ape1.equalsIgnoreCase(ape2))
		{
			System.out.print("Los apellidos son iguales");
		}
		else
		{
			System.out.print("Los apellidos son diferentes");
		}
	}
}