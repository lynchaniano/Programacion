package Matrices;
import java.util.*;
//Explicacion abajo
public class MatricesYvectoresParalelos01
{
    private Scanner leer;
    private String[] empleados;
    private int[][] sueldos;
    private int[] sueldoTotal;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- VectoresYmatricesParalelas --");
        MatricesYvectoresParalelos01 ma = new MatricesYvectoresParalelos01();
        ma.cargarDatos();
        ma.totalSueldos();
        ma.imprimirTotalPagado();
        ma.empleadoMayorSueldo();
    }
    
    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int[4][3];
        
        for(int f=0;f<empleados.length;f++)
        {
            System.out.print("Nombre Empleado: ");
            empleados[f] = leer.next();
            
            for(int c=0; c<sueldos[f].length; c++)
            {
                System.out.print("Ingrese sueldo: ");
                sueldos[f][c] = leer.nextInt();
            }
        }
    }
    
    public void totalSueldos()
    {
    	sueldoTotal = new int[4];
    	
        for(int f=0;f<sueldos.length;f++)
        {
          int suma = 0;
          
          for(int c=0;c<sueldos[f].length;c++)
          {
              suma = suma + sueldos[f][c];
          }
          sueldoTotal[f] = suma;
        }
    }
    
    public void imprimirTotalPagado()
    {
    	System.out.println("Total de sueldos pagados por empleado.");
    	
        for(int f=0; f<sueldoTotal.length; f++)
        {
            System.out.println(empleados[f]+" - "+sueldoTotal[f]);
        }
    }
    
    public void empleadoMayorSueldo()
    {
        int mayorSueldo = sueldoTotal[0];
        String nombre = empleados[0];
        
        for(int f=0; f<sueldoTotal.length; f++)
        {
            if(sueldoTotal[f]>mayorSueldo)
            {
                mayorSueldo = sueldoTotal[f];
                nombre = empleados[f];
            }
        }
        System.out.println("El empleado con mayor sueldo es "+ nombre + " que tiene un sueldo de "+mayorSueldo);
    }
}

/*
Se tiene la siguiente información:
· Nombres de 4 empleados.
· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.

Confeccionar el programa para:
a) Realizar la carga de la información mencionada. 
b) Generar un vector que contenga el ingreso acumulado en sueldos en los últimos 3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los últimos 3 meses 
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
*/