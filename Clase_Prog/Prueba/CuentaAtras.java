package Prueba;
import java.util.Scanner;

public class CuentaAtras
{
	static Scanner leer;
    public static void main(String[] args)
    {
    	leer = new Scanner(System.in);
    	int numero;

        System.out.print("Introduce un número: ");
        numero = leer.nextInt();
        
        System.out.println("Comienza la cuenta atras");
        do
        {
        	if (numero != 0)
        	{
        		System.out.print(numero+", ");
        		numero--;
        	}
        	else
            {
            	System.out.print(numero);
            }
        }
        while(numero > 0 || numero == 0);
    }
}