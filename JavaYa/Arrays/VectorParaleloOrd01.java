package Arrays;
import java.util.*;
//Cargar 5 alumnos y sus notas. Ordenar notas de mayor a menor.
public class VectorParaleloOrd01
{
	private String[] alumnos;
	private int[] notas;
	private Scanner leer;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- VectoresParalelosOrd01 --");
		VectorParaleloOrd01 vpor01 = new VectorParaleloOrd01();
		vpor01.cargarDatos();
		vpor01.ordenarDatos();
	}
	
	public void cargarDatos()
	{
		int contador=1;
		leer = new Scanner(System.in);
		alumnos = new String[5];
		notas = new int[5];
		
		for(int a=0; a<alumnos.length; a++)
		{
			System.out.print("Alumno "+contador+": ");
			alumnos[a] = leer.next();
			System.out.print("Nota "+contador+": ");
			notas[a] = leer.nextInt();
			contador++;
		}
		
	}
	
	public void ordenarDatos()
	{
		int auxnota;
		String auxnombre;
		
		System.out.println("-- Notas DesOrdenadas");
		for(int a=0; a<notas.length; a++)
		{
			System.out.println("Alumno: "+alumnos[a]+" Nota: "+notas[a]);
		}
		
		for(int a=0; a<notas.length; a++)
		{
            for(int b=0; b<notas.length-1-a; b++)
            {
                if (notas[b]<notas[b+1])
                {
                    auxnota = notas[b];
                    notas[b] = notas[b+1];
                    notas[b+1] = auxnota;
                    
                    auxnombre = alumnos[b];
                    alumnos[b] = alumnos[b+1];
                    alumnos[b+1] = auxnombre;
                }
            }
        }
		
		System.out.println("-- Notas Ordenadas");
		for(int a=0; a<notas.length; a++)
		{
			System.out.println("Alumno: "+alumnos[a]+" Nota: "+notas[a]);
		}
	}
}