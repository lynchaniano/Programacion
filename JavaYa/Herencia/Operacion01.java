package Herencia;
import java.util.*;

public class Operacion01
{
    protected Scanner leer;
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    public Operacion01()
    {
        leer = new Scanner(System.in);
    }
    
    public void cargar1()
    {
        System.out.print("Ingrese 1er Valor: ");
        valor1 = leer.nextInt();        
    }
    
    public void cargar2() {
        System.out.print("Ingrese 2º Valor: ");
        valor2 = leer.nextInt();
    }
    
    public void mostrarResultado()
    {
        System.out.println(resultado);
    }
}