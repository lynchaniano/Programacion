package EjerciciosSueltos;
import java.util.Scanner;
public class MasaCorporal
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		double peso, altura, IMC;
		leer = new Scanner(System.in);
		
		System.out.println("  -- Calcular IMC --");
		System.out.print("Introducir Masa(usar ,): ");
		peso = leer.nextDouble();
		System.out.print("Introducir Altura: ");
		altura = leer.nextDouble();
		
		IMC = peso/altura;
		
		System.out.println("Indice Masa Corporal: "+IMC);
	}
}