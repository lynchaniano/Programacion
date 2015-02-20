package Arrays;
import java.util.*;
//Cargar 5 paises y sus habitantes. Ordenar por pais y luego por habitantes de mayor a menor
public class VectorParaleloOrd02
{
	
	private String[] paises;
	private int[] habitantes;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- VectoresParalelosOrd02 --");
		VectorParaleloOrd02 vpor02 = new VectorParaleloOrd02();
		vpor02.cargaDatos();
		vpor02.ordenarDatos1();
		vpor02.ordenarDatos2();
	}
	
	public void cargaDatos()
	{
		int contador=1;
		leer = new Scanner(System.in);
		paises = new String[5];
		habitantes = new int [5];
		
		for(int a=0; a<paises.length; a++)
		{
			System.out.print("Pais Nº"+contador+": ");
			paises[a] = leer.next();
			System.out.print("Habitantes (mil): ");
			habitantes[a] = leer.nextInt();
			contador++;
		}
		
	}
	
	public void ordenarDatos1()
	{
		int aux;
		String aux1;
		
		for(int a=0; a<paises.length; a++)
		{
			for(int b=0; b<paises.length-1-a; b++)
			{
				if(paises[b].compareToIgnoreCase(paises[b+1])>0)
				{
					aux1 = paises[b];
					paises[b] = paises[b+1];
					paises[b+1] = aux1;
					
					aux = habitantes[b];
					habitantes[b] = habitantes[b+1];
					habitantes[b+1] = aux;
				}
			}
		}
		
		System.out.println("-- Ordenados por Nombre");
		for(int a=0; a<paises.length; a++)
		{
			System.out.println("Pais: "+paises[a]+" Habitantes: "+habitantes[a]);
		}
	}
	
	public void ordenarDatos2()
	{
		int aux;
		String aux1;
		
		for(int a=0; a<paises.length; a++)
		{
			for(int b=0; b<paises.length-1-a; b++)
			{
				if(habitantes[b]<habitantes[b+1])
				{
					aux1 = paises[b];
					paises[b] = paises[b+1];
					paises[b+1] = aux1;
					
					aux = habitantes[b];
					habitantes[b] = habitantes[b+1];
					habitantes[b+1] = aux;
				}
			}
		}
		System.out.println("-- Ordenados por Habitantes");
		for(int a=0; a<paises.length; a++)
		{
			System.out.println("Pais: "+paises[a]+" Habitantes: "+habitantes[a]);
		}
	}
}