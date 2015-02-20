package ClaseRepaso;
import java.util.*;

//Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
public class Ejercicio01
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num1, num2, suma;
		
		System.out.print("Num1: ");
		num1 = leer.nextInt();
		System.out.print("Num2: ");
		num2 = leer.nextInt();
		
		suma = num1+num2;
		
		System.out.println("La suma es "+suma);
	}
}