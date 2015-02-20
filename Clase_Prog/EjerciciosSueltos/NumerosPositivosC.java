package EjerciciosSueltos;
import java.util.*;
//Pedir 3 positivos, si alguno es >=5 ver los 3 numeros si no el ultimo

public class NumerosPositivosC
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
		
		if(num1>=5 || num2>=5 || num3>=5)
		{
			System.out.println("Primer Numero: "+num1);
			System.out.println("Segundo Numero: "+num2);
			System.out.println("Tercer Numero: "+num3);
		}
		else
		{
			System.out.println("Ultimo Numero: "+num2);
		}
	}
}