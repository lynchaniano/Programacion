package ClaseRepaso;
import java.util.*;

//Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
public class Ejercicio06
{
	static Scanner leer; 
	
	public static void main(String[] args)
	{
		leer = new Scanner (System.in);
		float kmh, resultado;
		
		System.out.println("Pasar de Km/h a m/s.");
		kmh = leer.nextFloat ();
		
		resultado = kmh*1000/3600;
		System.out.print(kmh+ " Km/h son "+ resultado + " m/s.");

	}
}