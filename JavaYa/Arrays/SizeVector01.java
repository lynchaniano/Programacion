package Arrays;
//Ingresar n sueldos de operarios. Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar.
//Luego crear un vector con dicho tama�o.
import java.util.*;
public class SizeVector01
{
    private Scanner leer;
    private int[] sueldos;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Tama�oVector01 --");
    	SizeVector01 tv01 = new SizeVector01();
        tv01.cargaDatos();
        tv01.mostrarDatos();
    }
	
    public void cargaDatos()
    {
        leer = new Scanner(System.in);
        int cantidad;
        
        System.out.print("N� Sueldos: ");
        cantidad = leer.nextInt();
        
        sueldos = new int[cantidad];
        
        for(int f=0; f<sueldos.length; f++)
        {
            System.out.print("Ingrese sueldo: ");
            sueldos[f] = leer.nextInt();
        }	
    }
	
    public void mostrarDatos()
    {
        int contador = 1;
    	
        for(int f=0; f<sueldos.length; f++)
        {
            System.out.println("Sueldo "+contador+": "+sueldos[f]);
            contador++;
        }
    }
}