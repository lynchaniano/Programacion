package Arrays;
import java.util.*;
//Cargar 5 nombres y sus edades. Mostrar la edad mayor y el nombre.
public class BusquedaVector01
{
    private Scanner leer;
    private String[] nombres;
    private int[] edades;
    
    public static void main(String[] args)
    {
    	System.out.println("  --BusquedaVector01 --");
        BusquedaVector01 bv01 = new BusquedaVector01();
        bv01.cargaDatos();
        bv01.mayorEdad();
    }

    public void cargaDatos()
    {
        leer = new Scanner(System.in);
        nombres = new String[5];
        edades = new int[5];
        
        for(int f=0; f<nombres.length; f++)
        {
            System.out.print("Nombre: ");
            nombres[f] = leer.next();
            System.out.print("Edad: ");
            edades[f] = leer.nextInt();
        }
    }
    
    public void mayorEdad()
    {
        int edadMayor = edades[0];
        int posicion = 0;
        
        for(int f=1; f<nombres.length; f++)
        {
            if (edades[f]>edadMayor)
            {
                edadMayor = edades[f];
                posicion = f;
            }
        }
        System.out.println("El mayor es "+nombres[posicion]+" con "+edadMayor+" años.");
    }
}