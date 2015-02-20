package EjerciciosSueltos;
import java.util.Scanner;
//Ejercicio que te pide dos números, y si son iguales te muestra el mensaje: son iguales

public class Iguales
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Num1: ");
		num1 = leer.nextInt();
		System.out.print("Num2: ");
		num2 = leer.nextInt();
		
		if(num1 == num2)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
	}
}
