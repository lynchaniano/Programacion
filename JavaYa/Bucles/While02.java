package Bucles;
import java.util.*;
//Introducir n alturas de personas. Mostrar la altura promedio de las personas.
public class While02
{
	static Scanner leer;
	static int numAlturas, contador;
	static float size, media, suma;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		contador = 1;
		System.out.println("  -- While02 --");
		System.out.print("N� de Alturas: ");
		numAlturas = leer.nextInt();
		
		while(contador<=numAlturas)
		{
			System.out.print("Altura en cm: ");
			size = leer.nextFloat();
			
			suma = suma + size;
			contador++;
		}
		
		media = suma / numAlturas;
		System.out.println("La media de las alturas es: "+media);
	}
}