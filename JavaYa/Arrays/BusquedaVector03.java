package Arrays;
import java.util.*;
//Crear un vector paralelo con unos nombres y edades. Mostrar todos los datos y buscar a una persona sola dentro del vector
public class BusquedaVector03
{
	private String[] nombres;
	private int[] edades;
	private Scanner leer;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Busqueda en Vector --");
		BusquedaVector03 v = new BusquedaVector03();
		v.cargaDatos();
		System.out.println("");
		v.mostrarDatos();
		System.out.println("");
		v.buscarDatos();
	}
	
	public void cargaDatos()
	{
		System.out.println("_CargarDatos");
		int size;
		leer = new Scanner(System.in);
		
		System.out.print("Tama�o vector: ");
		size = leer.nextInt();
		
		nombres = new String[size];
		edades = new int[size];
		
		for(int a=0; a<nombres.length; a++)
		{
			System.out.print("Introducir Nombre: ");
			nombres[a] = leer.next();
			System.out.print("Introducir Edad: ");
			edades[a] = leer.nextInt();
		}
	}
	public void mostrarDatos()
	{
		System.out.println("_MostrarDatos");
		for(int a=0; a<nombres.length; a++)
		{
			System.out.println("Nombre: "+nombres[a]+" Edad: "+edades[a]);
		}		
	}
	public void buscarDatos()
	{
		System.out.println("_Busqueda");
		System.out.print("A quien buscas?: ");
		String nombre = leer.next();;
		
		for(int a=0; a<nombres.length; a++)
		{
			if(nombres[a].equalsIgnoreCase(nombre))
			{
				System.out.println("Hemos encontrado a "+nombres[a]+" tiene "+edades[a]+" a�os.");
			}
		}
	}
}