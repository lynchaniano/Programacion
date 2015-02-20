package Arrays;
import java.util.*;
//Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.
public class BusquedaVectro02
{
	private Scanner leer;
	private int[] numeros;
	private int numMenor;

	public static void main(String[] args)
	{
		System.out.println("  --BusquedaVector02 --");
		BusquedaVectro02 bv02 = new BusquedaVectro02();
		bv02.cargaDatos();
		bv02.mayorNum();
		bv02.seRepite();
	}
	
	public void cargaDatos()
	{
		leer = new Scanner(System.in);
		int size, contador=1;
		
		System.out.print("Tama�o Vector: ");
		size = leer.nextInt();
		numeros = new int[size];
		
		for(int a=0; a<numeros.length; a++)
		{
			System.out.print("Nº"+contador+": ");
			numeros[a] = leer.nextInt();
			contador++;
		}
	}
	
	public void mayorNum()
	{
		numMenor = numeros[0];
		
		for(int a=1; a<numeros.length; a++)
		{
			if(numeros[a]<numMenor)
			{
				numMenor = numeros[a];
			}
		}
		
		System.out.println("El nº menor es: "+numMenor);
	}
	
	public void seRepite()
	{
		int contador = 0;
		
		for(int a=0; a<numeros.length; a++)
		{
			if(numeros[a]==numMenor)
			{
				contador++;
			}
		}
		
		System.out.println("Se repite "+contador+" veces.");
	}
}