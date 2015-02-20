package Bucles;
//Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)
public class While04
{
	public static void main(String[] args)
	{
		int num, contador;
		num = 11;
		contador = 1;
		
		while(contador<=25)
		{
			System.out.println(num);
			num = num + 11;
			contador++;
		}
	}
}