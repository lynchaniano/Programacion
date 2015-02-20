package Basicos;
//Introducir cuatro numeros y mostrar suma y media.
import java.util.*;
public class ABasico04
{
	static Scanner leer;
	
	
	public static void main(String[] args)
	{
		int num1, num2, num3, num4, suma, media;
		leer = new Scanner(System.in);
		
		System.out.println("-- Suma y Media --");
		System.out.print("Introducir Nº1: ");
		num1 = leer.nextInt();
		System.out.print("Introducir Nº2: ");
		num2 = leer.nextInt();
		System.out.print("Introducir Nº3: ");
		num3 = leer.nextInt();
		System.out.print("Introducir Nº4: ");
		num4 = leer.nextInt();
		
		suma = num1+num2+num3+num4;
		media = suma/4;
		
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);
	}
}