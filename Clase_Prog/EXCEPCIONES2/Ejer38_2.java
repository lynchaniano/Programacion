package EXCEPCIONES2;
//Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, 
//con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.

public class Ejer38_2
{
	public static void main(String[] args)
	{
		for(int a=0; a <= 250; a++)	//Creamos el bucle que a la vez servira de contador
		{
			if(a < 10)	//Si el numero es menor de 10 obtener el resto de dividir por 10
			{
				System.out.println("0000"+a%10);
			}
			
			if(a >= 10 && a < 100)	//Si el numero esta entre el 10 y el 99 obtener el resto de dividir por 100
			{
				System.out.println("000"+a%100);
			}
			
			if(a >= 100 && a < 1000)	//Si el numero esta entre el 100 y el 999 obtener el resto de dividir por 1000
			{
				System.out.println("00"+a%1000);	//Si el numero esta entre el 1000 y el 9999 obtener el resto de dividir por 1000
			}
			
			if(a >= 1000 && a < 10000)
			{
				System.out.println("0"+a%10000);
			}
			else
			{
				System.out.println(a%100000);
			}
		}
	}
}