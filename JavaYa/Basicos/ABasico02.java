package Basicos;
//Sumar 1+2 y multiplicar 3*4
import java.util.*;
public class ABasico02
{
	static Scanner leer;
	
	
    public static void main(String[] args)
    {
    	int num1, num2, num3, num4, suma, producto;
    	leer=new Scanner(System.in);
    	
    	System.out.print("Ingrese primer valor:");
    	num1=leer.nextInt();
    	System.out.print("Ingrese segundo valor:");
    	num2=leer.nextInt();
    	System.out.print("Ingrese tercer valor:");
    	num3=leer.nextInt();
    	System.out.print("Ingrese cuarto valor:");
    	num4=leer.nextInt();
    	
    	suma=num1 + num2;
    	producto=num3 * num4;
    	
    	System.out.print("La suma de los dos primero valores es: "+suma);
    	System.out.print("El producto del tercer y cuarto valor es: "+producto);
    }
}