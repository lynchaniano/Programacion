package Basicos;
//Introducir 4 numeros. Sumar1+2 y multiplicar3*4
import java.util.*;
public class ABasico03
{
	static Scanner leer;
	
	
	public static void main(String[] args)
	{
		int num1, num2, num3, num4, suma, producto;
		leer = new Scanner(System.in);
		
		System.out.println("-- Suma y Producto 2 --");
		System.out.print("Introducro Nº1: ");
		num1 = leer.nextInt();
		System.out.print("Introducro Nº2: ");
		num2 = leer.nextInt();
		System.out.print("Introducro Nº3: ");
		num3 = leer.nextInt();
		System.out.print("Introducro Nº4: ");
		num4 = leer.nextInt();
		
		suma = num1+num2;
		producto = num3*num4;
		
		System.out.println("La suma de "+num1+" y "+num2+" es "+suma);
		System.out.println("El producto de "+num3+" y "+num4+" es "+producto);
	}
}