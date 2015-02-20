package DeclaracionMetodos;
import java.util.*;
//Introducir dos numeros y sumarlos
public class Metodo01
{
	private Scanner leer;
	public static void main(String[] args)
	{
    	Metodo01 tabla = new Metodo01();
        tabla.cargarNumero();
	}
	
	public void cargarNumero()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int numero1 = leer.nextInt();
		System.out.print("Numero 2: ");
		int numero2 = leer.nextInt();
		
		int resultado = sumarNumeros(numero1, numero2);
		sumarNumeros(numero1, numero2);
		
		System.out.println(numero1+" + "+numero2+" = "+resultado);
	}
	
	public int sumarNumeros(int num1, int num2)
	{
		int resultado = num1 + num2;
		return resultado;
	}
}
