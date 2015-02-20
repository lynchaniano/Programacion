package Herencia;

public class Prueba01
{
    public static void main(String[] args) 
    {
    	System.out.println("  -- Herencia --");
    	System.out.println(" Suma");
        Suma01 suma1 = new Suma01();
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        System.out.print("El resultado de la suma es: ");
        suma1.mostrarResultado();
        
        System.out.println(" ");
        System.out.println(" Resta");
        Resta01 resta1 = new Resta01();
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        System.out.print("El resultado de la resta es: ");        
        resta1.mostrarResultado();
    }
}