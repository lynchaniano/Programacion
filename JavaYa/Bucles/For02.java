package Bucles;
//Tabla de multiplicar del 5 (del 5 al 50)
public class For02
{
	public static void main(String[] args)
	{
		int num, resultado;
		num = 0;
		
		System.out.println("  -- For02--");
		System.out.println("Tabla del 5");
		
		for(int a = 0; a<=10; a++)
		{
			resultado = num*5;
			System.out.println("5 X "+num+" = "+resultado);
			num++;
		}
	}
}