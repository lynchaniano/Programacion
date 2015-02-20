package Arrays;
import java.util.*;
//Vector de n elementos de tipo entero. Ordenar vector de mayor a menor.
public class Ordenamiento03
{
	private int[] enteros;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Ordenamiento03 --");
		Ordenamiento03 or03 = new Ordenamiento03();
		or03.cargaDatos();
		or03.ordenarDatos();
	}
	
	public void cargaDatos()
	{
		leer = new Scanner(System.in);
		int vectorSize, contador=1, num;
		
		System.out.print("Tamaño Vector: ");
		vectorSize = leer.nextInt();
		enteros = new int[vectorSize];
		
		for(int a=0; a<enteros.length; a++)
		{
			System.out.print("Introducir Nº"+contador+": ");
			num = leer.nextInt();
			enteros[a] = num;
			contador++;
		}
	}
	
	public void ordenarDatos()
	{
		int aux, contador=1;
		
		System.out.println("---Vector DesOrdenado");
		for(int a=0; a<enteros.length; a++)
		{
			System.out.println("Nº"+contador+": "+enteros[a]);
			contador++;
		}
		
		for(int a=0; a<enteros.length-1; a++)
		{
			for(int b=0; b<enteros.length-1; b++)
			{
				if(enteros[b] < enteros[b+1])
				{
					aux = enteros[b];
					enteros[b] = enteros[b+1];
					enteros[b+1] = aux;
				}
			}
		}
		
		System.out.println("---Vector Ordenado");
		for(int a=0; a<enteros.length; a++)
		{
			System.out.println("Nº"+contador+": "+enteros[a]);
			contador++;
		}
	}	
}