package EXCEPCIONES2;
import java.util.*;

public class Ejer38_1
{
	static Scanner leer;
    
    public static void main(String [] args)	//Main
    {
    	for(int a=0; a<5; a++)	//Repetir todo 5 veces
    	{
    		System.out.print("Dividendo: ");
            int divid = pideInt();
                
            System.out.print("Divisor: ");
            int divis = pideInt();
                
            mostrarResultado(divid,divis);
            System.out.println("");
    	}	
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
                num = 0;
                
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
        }
    }
}