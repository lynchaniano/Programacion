package EXCEPCIONES2;
import java.io.*;
//Ejercicio 12 de la página 135. Calcular el area y el perimetro de un rectangulo permitiendo la base = 0

public class Ejer44_1
{
	public static void main(String [] args)
    {
        int ladoA, ladoB, contador=1;
        
        do
        {
        	System.out.println("Rectangulo Nª"+contador);
        	ladoA = pideInt("Base: ");
        	
        	if(ladoA == 0)
        	{
        		System.out.println("Fin");
        		System.exit(0);
        	}
        	
        	ladoB = pideInt("Altura: ");
         
        	System.out.println("");
         
        	muestraResultado(ladoA, ladoB);
        	contador++;
         
        	System.out.println("");
        }while(ladoA != 0);
    }
    
	static int pideInt(String texto)	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
	{
        String cadnum;
        int numero;
        
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        do
        {
        	try
        	{
                System.out.print(texto);
                cadnum = teclado.readLine();
                numero = Integer.parseInt(cadnum);
            }
            catch(NumberFormatException e)
        	{
            	System.out.println("Introduzca Nº");
            	numero = -1;
            }
            catch (IOException e)
        	{
            	System.out.println("Se ha producido un error: "+e);
            	numero = -1;
            }
        }while(numero < 0);
        
        return numero;
    }
    
    static void muestraResultado(int ladoA, int ladoB) //Metodo creado para realizar las operaciones y mostrar el calculo del area y el preimetro
    {
        int perimetro, area;
        
        perimetro = (ladoA*2)+(ladoB*2);
        area = ladoA*ladoB;
        
        System.out.println("Lados Rectangulo "+ladoA+", "+ladoB);
        System.out.println("Area: "+area+" Perimetro: "+perimetro);
    }
}