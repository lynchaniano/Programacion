package ConstructorDeLaClase;
import java.util.*;
//Explicacion Abajo
public class Constructor03
{
	private int sueldo;
	private String nombre;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Constructor03 --");
        Constructor03 cons = new Constructor03();
        cons.mostrarDatos();
        cons.pagaImpuestos();
	}
	
	public Constructor03()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		nombre = leer.next();
		System.out.print("Sueldo: ");
		sueldo = leer.nextInt();
	}
	
	public void mostrarDatos()
	{
		System.out.println("");
		System.out.println(nombre+" cobra "+sueldo+"€.");
	}
	
	public void pagaImpuestos()
	{
		if(sueldo>=3000)
		{
			System.out.println(nombre+" tiene que pagar impuestos.");
		}
		else
		{
			System.out.println(nombre+" NO tiene que pagar impuestos.");
		}
	}
}

/*Confeccionar una clase que represente un empleado. 
 * Definir como atributos su nombre y su sueldo. 
 * En el constructor cargar los atributos y luego en otro método imprimir sus datos y por último uno que imprima un mensaje
 * si debe pagar impuestos (si el sueldo supera a 3000)*/