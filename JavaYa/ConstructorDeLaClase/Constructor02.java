package ConstructorDeLaClase;
import java.util.*;
//Plantear una clase llamada Alumno y definir como atributos su nombre y su edad. En el constructor realizar la carga de datos.
//Definir otros dos métodos para imprimir los datos ingresados y un mensaje si es mayor o no de edad (edad >=18)
public class Constructor02 
{
	private Scanner leer;
	private int edad;
	private String nombre;

	public static void main(String[] args)
	{
		System.out.println("  -- Constructor02 --");
        Constructor02 cons = new Constructor02();
        cons.mostrarDatos();
        cons.mayorEdad();
	}
	
	public Constructor02()
	{
		leer = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = leer.next();
		System.out.print("Edad: ");
		edad = leer.nextInt();
	}

	public void mostrarDatos()
	{
		System.out.println("");
		System.out.println("Se llama "+nombre+" y tiene "+edad+" años.");
	}
	
	public void mayorEdad()
	{
		System.out.println("");
		if(edad>=18)
		{
			System.out.println(nombre+" es mayor de edad.");
		}
		else
		{
			System.out.println(nombre+" NO es mayor de edad.");
		}
	}
}