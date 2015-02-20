package Matrices;
//Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes y luego imprimirlas.
import java.util.Scanner;
public class CrearMatriz01
{
    private Scanner leer;
    private int[][] matriz;
    
    public static void main(String[] args)
    {
    	System.out.println("  -- CrearMatriz01 --");
        CrearMatriz01 ma = new CrearMatriz01();
        ma.cargaMatriz();
        ma.mostrarMatriz();
    }  
    
    public void cargaMatriz()
    {
        leer = new Scanner(System.in);
        matriz = new int[3][5];
        
        for(int a=0; a<3; a++)
        {
            for(int b=0; b<5; b++)
            {
                System.out.print("Ingresar Valor: ");
                matriz[a][b] = leer.nextInt();
            }
        }
    }
    
    public void mostrarMatriz()
    {
        for(int f=0; f<3; f++)
        {
            for(int c=0; c<5; c++)
            {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    } 
}