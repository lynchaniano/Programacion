package ClaseRepaso;
import java.util.*;

public class Principal
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		Calculadora cal = new Calculadora();
		
		int num1, num2;
		
		System.out.print("Num1: ");
		num1 = leer.nextInt();
		System.out.print("Num2: ");
		num2 = leer.nextInt();
		
		System.out.println(num1+" + "+num2+" = "+ cal.suma(num1, num2));
		System.out.println(num1+" - "+num2+" = "+ cal.resta(num1, num2));
		System.out.println(num1+" * "+num2+" = "+ cal.multiplicar(num1, num2));
		System.out.println(num1+" / "+num2+" = "+ cal.division(num1, num2));
		System.out.println("El resto de la division es "+ cal.resto(num1, num2));
		System.out.println(num1+" elevado a "+num2+" = "+ cal.elevado(num1, num2));
	}
}
