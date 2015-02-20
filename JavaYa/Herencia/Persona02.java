package Herencia;
import java.util.*;
public class Persona02
{
	protected Scanner leer;
	protected String nombre;
	protected int edad;
	
	public Persona02()
	{
		leer = new Scanner (System.in);
	}
	
	public void cargaDatos()
	{
		System.out.print("Introduzca Nombre: ");
		nombre = leer.next();
		System.out.print("Introduzca edad: ");
		edad = leer.nextInt();	
	}
	
	public void mostrarDatos()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
}