package Arrays;
import java.util.*;
//Se desea guardar los sueldos de 5 operarios.
public class CrearVector01
{
    static Scanner leer;
    static int[] sueldos;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- Crear Vector01 --");
    	
        CrearVector01 cr01 = new CrearVector01();
        cr01.cargarDatos();
        cr01.mostrarDatos();
    }
	
    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        sueldos = new int[5];
        int contador = 1;
        
        for(int f=0; f<sueldos.length; f++)
        {
            System.out.print("Ingrese Sueldo del Operario "+contador+" : ");
            sueldos[f] = leer.nextInt();
            contador++;
        }	
    }
	
    public void mostrarDatos()
    {
    	int contador = 1;
        for(int f=0; f<sueldos.length; f++)
        {
            System.out.println("Operario "+contador+" : "+sueldos[f]+" €");
            contador++;
        }
    }
}