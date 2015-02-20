package EjerciciosSueltos;
//Pedir 3 numeros, si el 1º>2 && 3==0. Si se cumple esta condicion sacar primer numero si no el 2º
import java.util.*;

public class Numeros
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		int num1, num2, num3;
		leer = new Scanner(System.in);
		
		System.out.print("Num1: ");
		num1 = leer.nextInt();
		
		System.out.print("Num2: ");
		num2 = leer.nextInt();
		
		System.out.print("Num3: ");
		num3 = leer.nextInt();
		
		if(num1 > num2 && num3 == 0)
		{
			System.out.println("Numero 1: "+num1);
		}
		else
		{
			System.out.println("Numero 2: "+num2);
		}
		
	}
}