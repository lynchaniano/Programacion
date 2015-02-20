package Arrays;
import java.util.*;
//Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
//Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
public class CrearVector02
{
	static Scanner leer;
	static float[] alturas;
	static float media;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Crear Vector02 --");
		
		CrearVector02 cr02 = new CrearVector02();
		cr02.cargarDatos();
		cr02.calcularMedia();
		cr02.calcularDesviacion();
	}
	
	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		alturas = new float[5];
		int contador = 1;
		float altura;
		
		for(int a=0; a<alturas.length; a++)
		{
			System.out.print("Introducir altura "+contador+": ");
			altura = leer.nextFloat();
			alturas[a] = altura;
			contador++;
		}
	}
	
	public void calcularMedia()
	{
		float suma = 0;
		
		for(int a=0; a<alturas.length; a++)
		{
			suma = suma + alturas[a];
		}
		
		media = suma/alturas.length;
		
		System.out.println("La media de alturas es: "+media);
	}
	
	public void calcularDesviacion()
	{
		int mayor=0, menor=0;
		
		for(int a=0; a<alturas.length; a++)
		{
			if(alturas[a]>media)
			{
				mayor++;
			}
			
			if(alturas[a]<media)
			{
				menor++;
			}
		}
		
		System.out.println("Hay "+mayor+" jugadores mas altos que la media.");
		System.out.println("Hay "+menor+" jugadores menos altos que la media.");
	}
}












