package Arrays;
import java.io.*;

public class ArrayBidimensional
{
	static int[][] matrizNum;
	static int[] totalFila = new int[4];
	static int[] totalColum = new int[4];
	static int num;
	
	public static void main(String[] args)
	{
		matrizNum = new int[4][4];
		
		for(int a=0; a<matrizNum.length; a++)
		{
			System.out.println("Fila "+a);
			for(int b=0; b<matrizNum.length; b++)
			{
				System.out.println("Columna "+b);
				num = pideInt("\tNumero: ");
				
				if(esPar(b) == true && esPar(num) == true)
				{
					matrizNum[a][b] = num;		
				}
				else if(esPar(b) != true && esPar(num) != true)
				{
					matrizNum[a][b] = num;
				}else
					{
						b--;
						if(esPar(b)!=true)
						{
							System.out.println("\t\tIntroducir Nº Par");
						}
						else
						{
							System.out.println("\t\tIntroducir Nº InPar");
						}
						
					}
			}
			System.out.println("");
		}
		
		System.out.println("");
		mostrarArray();
		
	}
	
	 static int pideInt(String texto)
	 {
		 String cadnum;
		 int numero = 0;
	     boolean correcto;
	     
	     InputStreamReader flujo = new InputStreamReader(System.in);
	     BufferedReader teclado = new BufferedReader(flujo);
	     
	     do
	     {
	    	 try
	    	 {
	    		 correcto = true;
	             System.out.print(texto);
	             cadnum = teclado.readLine();
	             numero = Integer.parseInt(cadnum);
	         }
	    	 catch(NumberFormatException e)
	    	 {
	    		 System.out.println("\t\tIntroduzca Nº");
	    		 correcto = false;
	    	 }
	    	 catch (IOException e)
	    	 {
	    		 System.out.println("\t\tSe ha producido un error: "+e);
	    		 correcto = false;
	    	 }
	     }
	     while (!correcto);
	     return numero;
	 }
	 
	 static boolean esPar(int num)
	 {
		 if(num%2 == 0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 static void mostrarArray()
	 {		 
		 System.out.println("Numeros Introducidos");
		 
		 for(int a=0; a<matrizNum.length; a++)
		 {
			 sumarColum();
			 for(int b=0; b<matrizNum.length; b++)
			 {
				 System.out.print(matrizNum[a][b]+((a!=matrizNum.length&&b!=matrizNum.length-1)?"-":""));
			 }
			 sumarFilas(a);
			 System.out.println("");
		 }
		 System.out.println("");
		 
		 for(int a=0; a<totalColum.length; a++)
		 {
			 System.out.print(totalColum[a]+((a!=matrizNum.length-1)?"-":""));
		 }
		 
	 }
	 
	 static void sumarFilas(int a)
	 {
		 for(int b=0; b<matrizNum.length; b++)
		 {
			 totalFila[a] = totalFila[a] + matrizNum[a][b];
		 }
		 
		 System.out.print("\t"+totalFila[a]);
	 }
	 
	 static void sumarColum()
	 {
		 int suma;
		  
		 for(int a = 0; a < matrizNum.length; a++)
		 {
			 suma = 0;
			 
			 for(int b = 0; b < matrizNum.length; b++)
			 {
				 suma = suma + matrizNum[b][a];
			 }
			 totalColum[a] = suma;
	       }
	 }
}