package Bucles;
import java.util.*;
//Ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
public class While01
{
	static Scanner leer;
	static int nota, numNotas, mayor, menor, contador;
	
	public static void main(String[] args)
	{
		leer = new Scanner (System.in);
		contador = 1;
		System.out.println("   -- While 01 --");
		System.out.print("Ingrese nº de notas: ");
		numNotas = leer.nextInt();
		
		while(contador<=numNotas)
		{
			System.out.print("Nota: ");
			nota = leer.nextInt();
			
			if(nota>=7)
			{
				mayor++;
			}
			else
			{
				menor++;
			}
			contador++;
		}
		
		System.out.println("Notas mayores: "+mayor);
		System.out.println("Notas menores: "+menor);
	}
}