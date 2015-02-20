package EstructurasDinamicas;
import java.util.*;
//Calcular la media de una serie de números que se leen por teclado.
public class ArrayList02
{
	private Scanner leer;
	private ArrayList<Integer> numeros;
	
	public static void main(String[] args)
	{
		System.out.println("  -- ArraList 02 --");
    	ArrayList02 ar = new ArrayList02();
    	ar.cargarDatos();
    	ar.mostrarDatos();
    	ar.sumaYmedia();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		numeros = new ArrayList<Integer>();
		int num;
		
		System.out.println("Cargar numeros (0 Fin)");
		
		do
		{
			System.out.print("Numero: ");
			num = leer.nextInt();
			
			if(num != 0)
			{
				numeros.add(num);
			}
			
		}while(num != 0);
		
		System.out.println("Se han introducido "+numeros.size()+" numeros.");
	}

	private void mostrarDatos()
	{
		System.out.println(numeros);
		
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	private void sumaYmedia() 
	{
		
	}
}