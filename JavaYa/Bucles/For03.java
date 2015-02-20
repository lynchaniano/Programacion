package Bucles;
import java.util.*;
//Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
//a) La cantidad de valores ingresados negativos.
//b) La cantidad de valores ingresados positivos.
//c) La cantidad de múltiplos de 15.
//d) El valor acumulado de los números ingresados que son pares.
public class For03
{
	static Scanner leer;
	static int numero, positivos, negativos, multiplos, suma, pares;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		
		System.out.println("  -- For03 --");
		
		for(int a = 0; a<10; a++)
		{
			System.out.print("Introduzca numero: ");
			numero = leer.nextInt();
			
			if(numero>=0)
			{
				positivos++;
			}
			else
			{
				negativos++;
			}
			
			if(numero%15==0)
			{
				multiplos++;
			}
			
			if(numero%2==0)
			{
				pares++;
				suma = suma+numero;
			}
		}
		System.out.println("Hay "+positivos+" numeros positivos.");
		System.out.println("Hay "+negativos+" numeros negativos.");
		System.out.println("Hay "+multiplos+" multiplos de 15");
		System.out.println("Hay "+pares+" numeros pares y la sume de ellos es: "+suma);
	}
}