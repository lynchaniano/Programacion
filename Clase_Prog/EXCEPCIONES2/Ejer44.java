package EXCEPCIONES2;
import java.io.*;
//Ejercicio 11 de la página 135. Calcular el area y el perimetro de un rectangulo

public class Ejer44
{
	public static void main(String [] args)
    {
        int ladoA, ladoB, contador=1;
        
        System.out.println("Rectangulo Nª"+contador);
        ladoA = pideInt("Base: ");
        ladoB = pideInt("Altura: ");
        
        System.out.println("");
        
        muestraResultado(ladoA, ladoB);
        contador++;
        
        System.out.println("");
        
    }
    
	static int pideInt(String texto) //Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
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
        }while(numero < 0 || numero == 0);
        
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
