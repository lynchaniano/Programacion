package EjerciciosSueltos;
import java.util.Scanner;
public class AreaEsfera
{
	static Scanner leer;
	public static void main(String[] args)
	{
		double radio, volumen, area;
		leer = new Scanner(System.in);
		
		System.out.println("  --Calcular Area y Volumen --");
		System.out.print("Introduce Radio: " );
		radio = leer.nextDouble();
		
		area = (4*Math.PI)*(Math.pow(radio, 2));
		volumen = (4/3)*Math.PI*(Math.pow(radio, 3));
		
		System.out.println("Area: "+area);
		System.out.println("Volumen: "+volumen);
		
		
		
	}
}

//Arear Esfera = 4*Pi*r^2
//Volumen ESfera = 4/3*Pi*r^3  