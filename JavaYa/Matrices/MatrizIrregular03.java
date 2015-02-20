package Matrices;
import java.util.*;
//Explicacion Abajo
public class MatrizIrregular03
{
    private Scanner leer;
    private String[] nombres;
    private int[][] dias;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- MatrizIrregular03 --");
        MatrizIrregular03 ma = new MatrizIrregular03();
        ma.cargarDatos();
        ma.incidencias();
        ma.empleadoMensosFaltas();
    } 
    
    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        nombres = new String[3];
        dias = new int[3][];
        
        for(int f=0; f<nombres.length; f++)
        {
            System.out.print("Nombre del Empleado: ");
            nombres[f] = leer.next();
            System.out.print("Días que falto: ");
            int faltas = leer.nextInt();
            dias[f] = new int[faltas];
            
            for(int c=0; c<dias[f].length; c++)
            {
                System.out.print("Ingrese Nº de día: ");
                dias[f][c] = leer.nextInt();
            }
        }
    }
    
    public void incidencias()
    {
        for(int f=0; f<nombres.length; f++)
        {
            System.out.println(nombres[f] + " faltó " + dias[f].length + " días");
        }
    }
    
    public void empleadoMensosFaltas()
    {
        int faltas =dias[0].length;
        String nom = nombres[0];
        
        for(int f=1; f<dias.length; f++)
        {
            if (dias[f].length<faltas)
            {
                faltas = dias[f].length;
                nom = nombres[f];
            }
        }
        System.out.println("El empleado que faltó menos es "+nom+" con "+faltas+" faltas.");
    }  
}

/*Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han faltado cada empleado (cargar el número de día que faltó)
Cada fila de la matriz representan los días de cada empleado.
Mostrar los empleados con la cantidad de inasistencias.
Cuál empleado faltó menos días*/