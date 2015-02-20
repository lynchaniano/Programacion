package EjerciciosSueltos;
import java.util.*;
//Pedir 3 positivos, si son positivos ver el primer numero si no el ultimo

public class NumerosPositivos
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Num1: ");
		num1 = leer.nextInt();
		
		System.out.print("Num2: ");
		num2 = leer.nextInt();
		
		System.out.print("Num3: ");
		num3 = leer.nextInt();
		
		if(num1>=0 && num2>=0 && num3>=0)
		{
			System.out.println("Primer Numero: "+num1);
		}
		else
		{
			System.out.println("Ultimo Numero: "+num2);
		}
	}
}