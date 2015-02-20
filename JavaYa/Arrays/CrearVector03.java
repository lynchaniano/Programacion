package Arrays;
import java.util.*;
//Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. 
//Sumar componente a componente.
public class CrearVector03
{
    static Scanner leer;
    static int[] vec1;
    static int[] vec2;
    static int[] vecSuma;
    
    public static void main(String[] args)
    {
        CrearVector03 pv = new CrearVector03();
        pv.cargarDatos();
        pv.sumerVector();
    }    
    
    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        vec1 = new int[4];
        vec2 = new int[4];
        
        System.out.println("Carga del primer vector.");
        for(int f=0; f<4; f++) 
        {
            System.out.print("Ingrese elemento:");
            vec1[f] = leer.nextInt();
        }
        
        System.out.println("Carga del segundo vector.");
        for(int f=0; f<4; f++)
        {
            System.out.print("Ingrese elemento:");
            vec2[f] = leer.nextInt();
        }        
    }    
    
    public void sumerVector()
    {
    	vecSuma = new int[4];
    	
        for(int f=0; f<4; f++)
        {
            vecSuma[f] = vec1[f] + vec2[f];
        }
        
        System.out.println("Vector resultante.");
        for(int f=0 ;f<4;f++)
        {
            System.out.println(vecSuma[f]);
        }
    }
}