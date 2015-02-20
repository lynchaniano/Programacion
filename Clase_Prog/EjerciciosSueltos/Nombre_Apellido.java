package EjerciciosSueltos;
import java.util.Scanner;

public class Nombre_Apellido
{
	static Scanner leer;
	public static void main(String[] args)
	{
		String nombre, apellido;
		leer = new Scanner(System.in);
		
		System.out.print("Introduzca Nombre: ");
		nombre = leer.next();
		System.out.print("Introduzca Apellido: ");
		apellido = leer.next();
		
		System.out.println("Me llamo "+nombre+" "+apellido);
	}

}