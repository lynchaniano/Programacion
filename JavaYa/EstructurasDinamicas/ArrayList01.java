package EstructurasDinamicas;
import java.util.*;
//Leer números enteros y guardarlos en un ArrayList hasta que se lea un 0.
//Muestra los números leídos, su suma y su media.
public class ArrayList01
{
	private Scanner leer;
	private ArrayList<Integer> numeros;
	
    public static void main(String[] args)
    {
    	System.out.println("  -- ArrayList --");
    	ArrayList01 ar = new ArrayList01();
    	ar.cargarDatos();
    	ar.mostrarDatos();
    	ar.sumaYmedia();
    }

	public void cargarDatos()
    {
    	leer = new Scanner(System.in);
        numeros = new ArrayList<Integer>();
        int num;
        
        System.out.println("Introduce números enteros. 0 para acabar");
        
        do
        {
        	System.out.print("Numero: ");
            num = leer.nextInt();
            
            if (num != 0)
            {
            	numeros.add(num);
            }
                
        }while (num != 0);
       
        //<nombreArray>.size = devuelve la cantidad de datos introducidos.
        System.out.println("Ha introducido: " + numeros.size() + " números.");
    }
	
    private void mostrarDatos()
    {
        //mostrar el arrayList completo
        System.out.println(numeros);
       
        //recorrido usando un iterador para mostrar un elemento por línea
        Iterator<Integer> it = numeros.iterator(); //Se crea el iterador it para el array numeros
        while(it.hasNext())               //mientras queden elementos
        {
        	System.out.println(it.next());//se obtienen y se muestran
        }
    }

	private void sumaYmedia()
	{
        //recorrido usando for para sumar los elementos
        double suma = 0;
        
        for(int a=0; a<numeros.size(); a++)
        {
        	suma = suma + 1;
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/numeros.size());
	}
}