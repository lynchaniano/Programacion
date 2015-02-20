package ClaseRepaso;
import java.util.*;

//Escribe un programa Java que lee un número entero por teclado y obtiene y muestra 
//por pantalla el doble y el triple de ese número.
public class Ejercicio03
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num, doble, triple;
		
		System.out.print("Numero: ");
		num = leer.nextInt();
		
		doble = num*2;
		triple = num*3;
		
		System.out.println("el Doble es: "+doble);
		System.out.println("el triple es: "+triple);
	}
}