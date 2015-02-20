package Condiciones;
import java.util.*;
//Introducir 2 números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo
public class ACondicion01
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num1, num2, suma, resta, div, mult;
		
		System.out.println("-- Condicion --");
		System.out.print("Introducir Nº1: ");
		num1 = leer.nextInt();
		System.out.print("Introducir Nº2: ");
		num2 = leer.nextInt();
		
		if(num1>num2)
		{
			suma = num1+num2;
			resta = num1 - num2;
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+resta);
		}
		else
		{
			div = num1/num2;
			mult = num1*num2;
			System.out.println("La division es: "+div);
			System.out.println("El producto es: "+mult);
		}
	}
}