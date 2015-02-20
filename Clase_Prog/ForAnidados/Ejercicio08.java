package ForAnidados;
import java.util.*;

public class Ejercicio08
{
	static Scanner leer; 
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int num;
		
		System.out.print("Nº Asteriscos: ");
		num = leer.nextInt();
		
		for (int i = 0; i < num; ++i)
		{
			System.out.println(); //Cada primer for, se hace un salto de línea.
            
            for (int j = 0; j < num; ++j)//Anidamos otro for con el mismo proceso.
            {
                if((i == 0) || (i == num-1) || (j == 0) || (j == num - 1))//Establecemos una condición para que se imprima el "*".
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }            
        }
		
        System.out.println();
    }
}