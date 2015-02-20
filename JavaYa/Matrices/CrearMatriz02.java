package Matrices;

import java.util.Scanner;
public class CrearMatriz02
{
    private Scanner leer;
    private int[][] matriz;
    
    public static void main(String[] args)
    {
    	CrearMatriz02 ma = new CrearMatriz02();
        ma.cargarMatriz();
        ma.imprimirDiagonalPrincipal();
    }   
    
    public void cargarMatriz()
    {
        leer = new Scanner(System.in);
        matriz = new int[4][4];
        
        for(int f=0; f<4; f++)
        {
            for(int c=0; c<4; c++)
            {
                System.out.print("Ingresar Valor: ");
                matriz[f][c] = leer.nextInt();
            }
        }
    }
    
    public void imprimirDiagonalPrincipal()
    {
        for(int k=0; k<4; k++)
        {
            System.out.print(matriz[k][k]+" ");
        }
    }
}