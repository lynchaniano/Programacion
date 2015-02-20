package ClaseRepaso;

public class Calculadora
{
	public int suma(int a, int b)
	{
		int resultado = 0;
		
		resultado = a + b;
		
		return resultado;
	}
	
	public int resta(int a, int b)
	{
		int resultado = 0;
		
		resultado = a - b;
		
		return resultado;
	}
	
	public int multiplicar(int a, int b)
	{
		int resultado = 0;
		
		resultado = a * b;
		
		return resultado;
	}
	
	public double division(int a, int b)
	{
		int resultado = 0;
		
		resultado = a / b;
		
		return resultado;
	}
	
	public double resto(int a, int b)
	{
		int resultado = 0;
		
		resultado = a % b;
		
		return resultado;
	}
	
	public double elevado(int a, int b)
	{
		double resultado = 0;
		
		resultado = Math.pow(a, b);
		
		return resultado;
	}
}