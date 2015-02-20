package EjerciciosARRAYS;
import java.io.*;
//Pedir 8 notas. Ver la nota las notas ordenadas de mayor a menor, si hay repetidas solo mostrar 1

public class Libro173_4 
{
	static int notas[] = new int[8];
	
	public static void main(String[] args)
	{		
		llenarArray();
		ordenarArray();
		mostrarNotas();
		
	}
	
	static void llenarArray()
	{
		for(int i=0;i<8;i++)
		{
			notas[i] = pedirInt("Introducir nota "+(i+1)+": ");
		}
	}
	
	static void ordenarArray()
	{
		int vueltas = notas.length-1,aux;
		boolean ordenado = false;
		 
		while(vueltas>0 && ordenado==false)
		{
			ordenado=true;
			for(int pos=0;pos<vueltas;pos++)
			{
				if(notas[pos]>notas[pos+1])
				{
					aux=notas[pos];
					notas[pos]=notas[pos+1];
					notas[pos+1]=aux;
					ordenado = false;
				}
			}
		 vueltas--;
		}
	}
	
	static void mostrarNotas()
	{
		for(int a=notas.length-1; a>=0; a--)
		{
			if(a != 0)
			{
				if(notas[a]>notas[a-1])
				{
					System.out.println(notas[a]);
				}
			}
			else
			{
				if(notas[0]>=notas[1])
				{
					System.out.println(notas[0]);
				}
			}
		}
	}
		 
	static int pedirInt(String texto) 
	{
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		String cadnum;
		int numero=0;
		boolean correcto;
		
		do 
		{
			try 
			{
				System.out.print(texto);
				cadnum=teclado.readLine();
				numero=Integer.parseInt(cadnum);
				
				if(numero>=0 && numero<=10)
				{
					correcto=true;
				}
				else
				{
					correcto = false;
				}
			}
			catch (NumberFormatException e) 
			{
				System.out.println("\t\tTienes que introducir un nº: ");
				correcto=false;
			}
			catch (IOException e) 
			{
				System.out.println("\t\tSe ha producido un error: ");
				correcto=false;
			}
		}while (!correcto);
		return numero;
	}
}