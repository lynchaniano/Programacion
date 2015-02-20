package Excepciones;
import java.util.*;

public class Excepcion01 
{
	static Scanner leer;
	
	public static void main(String[] args) 
	{
		leer = new Scanner(System.in);
        int result, numero1, numero2;

        System.out.print("Numero 1: ");
        numero1 = leer.nextInt();
        System.out.print("Numero 2: ");

        try 
        {
        	numero2 = leer.nextInt();

            result = numero1 / numero2;
            System.out.println(result);
        } 
        catch (NumberFormatException ex) 
        {
        	System.out.println("Se han introducido caracteres no numericos");
            
        } 
        catch (ArithmeticException ex) 
        {
            System.out.println("Division entre cero");
        } 
        catch (InputMismatchException ex) 
        {
            System.out.println("ERROR");
        }
    }
}
