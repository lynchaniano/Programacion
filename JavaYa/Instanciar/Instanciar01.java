package Instanciar;
import java.util.*;
//Confeccionar una clase que permita carga el nombre y la edad de una persona.
//Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
public class Instanciar01
{
	static Scanner leer;
	static String nombre1, nombre2;
	static int edad1, edad2;
	public static void main(String[] args)
	{
		Instanciar01 persona = new Instanciar01(); 	//Creación del objeto
		
		System.out.println("  -- Intanciar01 --");
		
		persona.cargarDatos(); 						//Llamada de un método
		persona.mostrarDatos(); 					//Llamada de un método
		persona.compararDatos(); 					//Llamada de un método
	}
	
	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Nombre1: ");
		nombre1 = leer.next();
		System.out.print("edad1: ");
		edad1 = leer.nextInt();
		System.out.print("Nombre2: ");
		nombre2 = leer.next();
		System.out.print("edad2: ");
		edad2 = leer.nextInt();	
	}
	
	public void mostrarDatos()
	{
		System.out.println("1. "+nombre1+" Edad: "+edad1);
		System.out.println("2. "+nombre2+" Edad: "+edad2);
	}
	
	public void compararDatos()
	{
		if(edad1>=18)
		{
			System.out.println(nombre1+" es mayor de 18.");
		}
		else
		{
			System.out.println(nombre1+" NO es mayor de 18.");
		}
		
		if(edad2>=18)
		{
			System.out.println(nombre2+" es mayor de 18.");
		}
		else
		{
			System.out.println(nombre2+" NO es mayor de 18.");
		}
	}
}