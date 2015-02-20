package ConstructorDeLaClase;
import java.util.*;
//Explicacion Abajo
public class Constructor04 
{
    private Scanner leer;
    int valor1,valor2;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Constructor04 --");
    	Constructor04 cons = new Constructor04();
        cons.sumar();
        cons.restar();
        cons.multiplicar();
        cons.dividir();
    }
    
    public Constructor04()
    {
        leer = new Scanner(System.in);
        
        System.out.print("Ingresar 1er valor: ");
        valor1 = leer.nextInt();
        System.out.print("Ingrese 2º valor: ");
        valor2 = leer.nextInt();
    }
    
    public void sumar()
    {
        int suma;
        
        suma = valor1 + valor2;
        System.out.println("La suma es: "+suma);
    }
    
    public void restar()
    {
        int resta;
        resta = valor1 - valor2;
        
        System.out.println("La resta es: "+resta);
    }
    
    public void multiplicar()
    {
        int multiplicacion; 
        multiplicacion = valor1 * valor2;
        System.out.println("La multiplicación es: "+multiplicacion);
    }
    
    public void dividir()
    {
        int division;
        
        division = valor1 / valor2;
        
        System.out.println("La división es: "+division);
    }
}