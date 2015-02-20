package ClaseRepaso;
import java.util.*;

//Programa Java que lea un nombre por teclado y muestre por pantalla: “Buenos dias nombre_introducido”
public class Ejercicio02
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		String nombre;
		
		System.out.print("Nombre: ");
		nombre = leer.next();
		
		System.out.println("Buenos Dias"+nombre);
	}
}