package Arrays;
import java.util.*;
//Cargar 5 nombres y sus edades. Mostrar los mayores de edad (>=18)
public class VectorParalelo01
{
	private Scanner leer;
	private String[] nombres;
	private int[] edades;
	
	public static void main(String[] args)
	{
		System.out.println("  -- VectoresParalelos01 --");
		VectorParalelo01 vp01 = new VectorParalelo01();
		vp01.cargaDatos();
		vp01.mayorEdad();	
	}
	
	public void cargaDatos()
	{
		leer = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];
		int contador=1;
		
		System.out.println("Introducir Nombre y Edad");
		for(int a=0; a<nombres.length; a++)
		{
			System.out.print("Nombre "+contador+": ");
			nombres[a] = leer.next();
			System.out.print("Edad "+contador+": ");
			edades[a] = leer.nextInt();
			contador++;
		}
	}
	
	public void mayorEdad()
	{
		for(int a=0; a<nombres.length; a++)
		{
			if(edades[a]>=18)
			{
				System.out.println(nombres[a]+" es mayor de edad.");
			}
			else
			{
				System.out.println(nombres[a]+" NO es mayor de edad.");
			}
		}
	}
}






