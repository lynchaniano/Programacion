package ClaseRepaso;
import java.util.*;

//Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud 
//y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
public class Ejercicio05
{
	static Scanner leer;
	
    public static void main(String[] args)
    {
    	leer = new Scanner(System.in);
    	
    	double radio, longitud, area;
    	
    	System.out.print ("Introduccir radio de la circunferencia: ");
        radio = leer.nextDouble();
        
        longitud = 2 * Math.PI * radio; 
        area = Math.PI * Math.pow(radio, radio);
        
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Area de la circunferencia: " + area);
    }
}