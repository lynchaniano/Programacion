package Arrays;
import java.util.*;
//Vector donde almacenar los nombres de 5 paises. Confeccionar el algoritmo de ordenamiento alfabético.
public class Ordenamiento02
{
	private Scanner leer;
	private String[] paises;

	public static void main(String[] args)
	{
		System.out.println("  -- Ordenamiento02 --");
		Ordenamiento02 or02 = new Ordenamiento02();
		or02.cargaDatos();
		or02.ordenarDatos();
		or02.mostrarDatos();
	}
	
	public void cargaDatos()
	{
		leer = new Scanner(System.in);
		paises = new String[5];
		int contador = 1;
		
		for(int a=0; a<paises.length; a++)
		{
			System.out.print("Pais Nº"+contador+": ");
			paises[a] = leer.next();
			contador++;
		}
		
	}
	
	public void ordenarDatos()
	{
		String aux;
		
		for(int a=0; a<paises.length; a++)
		{
			for(int b=0; b<paises.length-a-1; b++)
			{
				if(paises[b].compareToIgnoreCase(paises[b+1])>0)
				{
					aux = paises[b];
					paises[b] = paises[b+1];
					paises[b+1] = aux;
				}
			}
		}
	}
	
	public void mostrarDatos()
	{
		int contador = 1;
		
		for(int a=0; a<paises.length; a++)
		{
			System.out.println("Pais "+contador+": "+paises[a]);
			contador++;
		}
	}
}