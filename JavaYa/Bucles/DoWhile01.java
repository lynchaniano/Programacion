package Bucles;
import java.util.*;
//Carga de un número entre 0 y 999, y nos muestre un mensaje de cuántos dígitos tiene el mismo. 
//Finalizar el programa cuando se cargue el valor 0.
public class DoWhile01
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
        int numero;
        
        System.out.println("  -- Do While01 --");
        
        do
        {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza): ");
            numero = leer.nextInt();
            
            if (numero>=100)
            {
            	System.out.println("Tiene 3 dígitos.");
            }
            else 
            {
            	if (numero>=10)
            	{
            		System.out.println("Tiene 2 dígitos.");
                }
            	else
            	{
                    System.out.println("Tiene 1 dígito.");
                }
            }
        }
        while (numero!=0);
    }
}