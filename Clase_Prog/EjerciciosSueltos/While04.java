package EjerciciosSueltos;
import java.util.*;
//Pedir 6 numeros y sumarlos

public class While04
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		
		int numero, suma=0, contador = 0;
		
		while(contador<6)
		{
			System.out.print("Nº: ");
			numero = leer.nextInt();
			
			suma = suma + numero;
			contador++;
		}
		
		System.out.println("Resultado: "+suma);
	}
}