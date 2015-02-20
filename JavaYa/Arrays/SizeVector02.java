package Arrays;
import java.util.*;
//Ingresar un vector de n elementos, ingresar n por teclado.
//Luego imprimir la suma de todos sus elementos

public class SizeVector02
{
	private Scanner leer;
	private int[] numeros;
	
	public static void main(String []args)
	{
		System.out.println("  -- Tama�oVector02 --");
		SizeVector02 tm02 = new SizeVector02();
		tm02.cargaDatos();
		tm02.sumaDatos();
	}
	
	public void cargaDatos()
	{
		leer = new Scanner(System.in);
		int size, contador=1;
		
		System.out.print("Ingresar Tama�o Vector: ");
		size = leer.nextInt();
		numeros = new int[size];
		
		for(int a=0; a<numeros.length; a++)
		{
			System.out.print("Ingresar N�"+contador+" : ");
			numeros[a] = leer.nextInt();
			contador++;
		}		
	}
	
	public void sumaDatos()
	{
		int suma=0;
		
		for(int a=0; a<numeros.length; a++)
		{
			suma = suma+numeros[a];
		}
		
		System.out.println("La suma total es: "+suma);
	}	
}