package Condiciones;
import java.util.*;
//Ingresar tres notas, si la media es mayor o igual a siete mostrar un mensaje "Promocionado".
public class ACondicion02
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int nota1, nota2, nota3, media, suma;
		
		System.out.println("-- Notas --");
		System.out.print("Nota 1: ");
		nota1 = leer.nextInt();
		System.out.print("Nota 2: ");
		nota2 = leer.nextInt();
		System.out.print("Nota 3: ");
		nota3 = leer.nextInt();
		
		suma = nota1+nota2+nota3;
		media = suma/3;
		
		if(media>=7)
		{
			System.out.println("PROMOCIONADO");
		}
		else
		{
			System.out.println("CAPUT");
		}
	}
}