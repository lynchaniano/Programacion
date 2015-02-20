package ClaseRepaso;
import java.util.*;

//Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
//La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: F = 32 + ( 9 * C / 5) 
public class Ejercicio04
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		float cent, faren;
		
		System.out.print("Centigrados a Fahrenheit: ");
		cent = leer.nextFloat();
		
		faren = 32 + (9*(cent/5));
		
		System.out.println(cent+"ºC son: "+faren+"ºF");
	}
}