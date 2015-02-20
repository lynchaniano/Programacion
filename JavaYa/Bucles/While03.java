package Bucles;
//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24...
public class While03
{
	public static void main(String[] args)
	{
		int multiplo;
        multiplo = 8;
        
        while(multiplo<=500)
        {
        	System.out.print(multiplo);
        	System.out.print(" - ");
        	multiplo = multiplo + 8;
        }
	}
}