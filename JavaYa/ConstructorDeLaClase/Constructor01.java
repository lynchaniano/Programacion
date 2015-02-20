package ConstructorDeLaClase;
import java.util.*;
//Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.
public class Constructor01
{
    private Scanner leer;
    private int[] sueldos;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Constructor01 --");
        Constructor01 op = new Constructor01();
        op.mostrarSueldos();
    }
	
    public Constructor01()
    {
        leer = new Scanner(System.in);
        sueldos = new int[5];
        
        for(int f=0; f<5; f++)
        {
            System.out.print("Ingresar Sueldo: ");
            sueldos[f]=leer.nextInt();
        }	
    }
	
    public void mostrarSueldos()
    {
        for(int f=0; f<5; f++)
        {
            System.out.println(sueldos[f]);
        }
    }
}