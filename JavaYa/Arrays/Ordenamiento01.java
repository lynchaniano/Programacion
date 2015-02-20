package Arrays;
import java.util.*;
//Crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
public class Ordenamiento01
{
	private Scanner leer;
	private int[] sueldos;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Ordenamiento01 --");
        Ordenamiento01 or01 = new Ordenamiento01();
        or01.cargarDatos();
        or01.ordenarDatos();
        or01.mostrarDatos();
    }

    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        sueldos = new int[5];
        
        for(int a=0; a<sueldos.length; a++)
        {
            System.out.print("Ingresar sueldo: ");
            sueldos[a] = leer.nextInt();
        }
    }
	
    public void ordenarDatos()
    {
        for(int a=0; a<4; a++)
        {
            for(int b=0; b<4-a; b++)
            {
                if (sueldos[b]>sueldos[b+1]) 
                {
                    int aux;
                    aux = sueldos[b];
                    sueldos[b] = sueldos[b+1];
                    sueldos[b+1] = aux;
                }
            }
        }
    }
	
    public void mostrarDatos()
    {
        System.out.println("Sueldos ordenados de menor a mayor.");
        for(int f=0; f<sueldos.length; f++)
        {
            System.out.println(sueldos[f]);
        }
    }
}