package DeclaracionMetodos;
import java.util.*;
//Métodos con parámetros.
//Confeccionar una clase que permita ingresar valores enteros por teclado y nos muestre la tabla de multiplicar de dicho valor.
//Finalizar el programa al ingresar el -1.
public class Metodo02
{
	private Scanner leer;
	
    public static void main(String[] ar)
    {
    	Metodo02 tabla = new Metodo02();
        tabla.cargarNumero();
    }
    
    public void cargarNumero()
    {
        leer = new Scanner(System.in);
        int numero;
        
        do
        {
            System.out.print("Ingrese valor: ");
            numero = leer.nextInt();
            
            if(numero!=-1)
            {
                calcular(numero);
            }
        }
        while (numero!=-1);
    }
    
    public void calcular(int v)
    {
    	int contador = 1;
    	System.out.println("Tabla del "+v);
    	
        for(int f=v; f<=v*10; f=f+v)
        {
            System.out.println(v+" X "+contador+" = "+f);
            contador++;
        }
    }
}