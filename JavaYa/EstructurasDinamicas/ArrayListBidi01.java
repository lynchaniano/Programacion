package EstructurasDinamicas;
import java.util.*;
public class ArrayListBidi01
{
	private Scanner leer;
	private ArrayList<ArrayList<Integer>> Alumnos;
	final int numAlumnos = 10;//número de alumnos
	private int i, j, nota, contador = 1;
	
	public static void main(String args[])
	{
		System.out.println("  -- ArrayList Bidimensional01 --");
		ArrayListBidi01 ar = new ArrayListBidi01();
		ar.cargaDatos();
		ar.mostrarDatos();
	}
	
	private void cargaDatos()
	{
		leer = new Scanner(System.in);
		
		//crear un ArrayList bidimensional de enteros vacío
		//Realmente se crea un ArrayList de ArrayLists de enteros
		Alumnos = new ArrayList<ArrayList<Integer>>();
		
		//Se leen las notas de cada alumno.
		System.out.println("Introduzca notas. (0 Fin)");
		for(i=0;i<numAlumnos;i++)
		{
			contador = 1;
			System.out.println("Alumno " +(i+1));
			System.out.print("Nota " + contador + ": ");
			nota = leer.nextInt();

			//para cada alumno se añade una nueva fila vacía
			//esto es necesario porque el arrayList se crea vacío
			Alumnos.add(new ArrayList<Integer>());
			
			while(nota>=0)
			{
				Alumnos.get(i).add(nota); //en la fila i se añade un nueva nota
				contador++;
				System.out.print("Nota " + contador + ": ");
				nota = leer.nextInt();
			}
		}
	}

		private void mostrarDatos()
		{
	        //Mostrar todas las notas
	        System.out.println("Notas de alumnos");
	        
	        for(i=0;i<Alumnos.size();i++)//para cada alumno (para cada fila)
	        {  
	            System.out.print("Alumno " + i + ": ");
	            for(j=0;j<Alumnos.get(i).size();j++)//se recorre todas la columnas de la fila
	            {  
	                System.out.print(Alumnos.get(i).get(j) + " "); //se obtiene el elemento i,j
	            }
	            System.out.println();          
	        }
		}
}