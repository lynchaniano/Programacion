package Basicos;
//Introducir 2 numeros y mostrar suma y producto.
import java.util.*;
public class ABasico01
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		int num1, num2, suma, producto;
		leer = new Scanner(System.in);
		
		System.out.println("-- Suma y Producto --");
		System.out.print("Introducta Nº1: ");
		num1 = leer.nextInt();
		System.out.print("Introducta Nº2: ");
		num2 = leer.nextInt();
		
		suma = num1+num2;
		producto = num1*num2;
		
		System.out.println("La suma de "+num1+" y "+num2+" es "+suma);
		System.out.println("El producto de "+num1+" y "+num2+" es "+producto);
	}
}