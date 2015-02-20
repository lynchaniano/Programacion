package Matrices;
import java.util.*;
//Explicacion abajo
public class MatricesYvectoresParalelos02
{
	private Scanner leer;
	private String[] paises;
	private int[][] temperaturas;
	private int[] tempMedia;
	
	public static void main(String[] args)
	{
    	System.out.println("  -- VectoresYmatricesParalelas --");
        MatricesYvectoresParalelos02 ma = new MatricesYvectoresParalelos02();
        ma.cargarDatos();
        ma.mostrarTemp();
        ma.mostrarTempMedia();
        ma.mostrarMayorTemp();
	}
	
	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		paises = new String[4];
		temperaturas = new int[4][3];
		
		for(int f=0; f<paises.length; f++)
		{
			System.out.print("Pais: ");
			paises[f] = leer.next();
			
			for(int c=0; c<temperaturas[f].length; c++)
			{
				System.out.print("Temperatura: ");
				temperaturas[f][c] = leer.nextInt();
			}
		}
	}
	
	public void mostrarTemp()
	{
		System.out.println("");
		System.out.println("Registro Temperaturas");
		for(int f=0; f<temperaturas.length; f++)
		{
			System.out.print(paises[f]+" --> ");
			
			for(int c=0; c<temperaturas[f].length; c++)
			{
				System.out.print(temperaturas[f][c]+"º - ");
			}
			System.out.println();
		}
	}
	
	public void mostrarTempMedia()
	{
		System.out.println("");
		System.out.println("Temperaturas Medias");
		tempMedia = new int[4];
		for(int f=0; f<temperaturas.length; f++)
		{
			int suma = 0;
			
			for(int c=0; c<temperaturas[f].length; c++)
			{
				suma = suma + temperaturas[f][c];
			}
			int media = suma / 3;
			tempMedia[f] = media;
		}
		
		for(int a=0; a<paises.length; a++)
		{
			System.out.println(paises[a]+" Temperatura media: "+tempMedia[a]+"º.");
		}
	}
	
	public void mostrarMayorTemp()
	{
		System.out.println("");
		System.out.println("Mayor Temperatura");
		
		int mayorTemp = tempMedia[0];
		String nombre = paises[0];
		
		for(int f=0; f<tempMedia.length; f++)
		{
			if(tempMedia[f]>mayorTemp)
			{
				mayorTemp = tempMedia[f];
				nombre = paises[f];
			}
		}
		System.out.print(nombre+" tiene la mayor temperatura media: "+mayorTemp+"º.");
	}

}

/*
Se desea saber la temperatura media trimestral de cuatro paises.
Para ello se tiene como dato las temperaturas medias mensuales de dichos paises.
Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.

a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
c - Calcular la temperatura media trimestral de cada país.
c - Imprimr los nombres de las provincias y las temperaturas medias trimestrales.
b - Imprimir el nombre de la provincia con la temperatura media trimestral mayor.
*/