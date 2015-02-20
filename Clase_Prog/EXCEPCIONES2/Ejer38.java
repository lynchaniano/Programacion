package EXCEPCIONES2;
import java.util.*;
//Ejercicio 2º de la página 124 del libro. Hacer los puntos 2 y 3, 
//las excepciones las controlaremos en el main y para pedir datos utilizaremos la clase Scanner.

public class Ejer38 
{
	static Scanner leer;
    static boolean fallo = false;
    
    public static void main(String [] args)//Main
    {
    	do //Pedir valores hasta que se introduzca un fallo
        {
        	System.out.print("Dividendo: ");
            int divid = pideInt();
                
            System.out.print("Divisor: ");
            int divis = pideInt();
            
            mostrarResultado(divid,divis);
            System.out.println("");
            
        }while(fallo != true);
    }
    
    static int pideInt()	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
    {
        leer = new Scanner(System.in);
        int num = 0;
        
        try
        {
        	num = leer.nextInt();
        }
        catch(InputMismatchException e)
        {
                System.out.println("Letra Instroducida");
                System.out.println("FIN");
                System.exit(0);
        }
        return num;
    }
    
    static void mostrarResultado(int divid, int divis) //Metodo que muestra el resultado de la division
    {        
        try
        {
            int cociente = divid/divis;

            System.out.println(divid+"/"+divis+"="+cociente);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division entre 0");
            System.out.println("FIN");
            System.exit(0);
        }
    }
}