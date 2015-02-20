package EXCEPCIONES2;
import java.io.*;
//Ejercicio 13 de la página 135. Al final tiene que decirme cuantas letras se han introducido.

public class Ejer45 
{
    static String registroNumeros = "-> ";
    static int numFallos;
    
    public static void main(String [] args)	//Main
    {
        int suma=0, numero, contador=1;;
        System.out.println("- Insertar Nº hasta llegar a 1000");
        
        do
        {
        	System.out.print("Nº"+contador+": ");
        	numero = pideInt();
        	contador++;
        	
            if(numero >= 0)
            {
                cadenaNumeros(numero);
                suma = suma +numero;
            }
            
        }while(suma != 1000);
        
        System.out.println("");
        System.out.println("Nº de Fallos: "+numFallos);
        System.out.println("Lista Nº introducidos");
        System.out.println(registroNumeros);
    }
    
    static int pideInt()	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
    {
    	InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        int numero = -1;
        
        try
        {
            numero = Integer.parseInt(teclado.readLine());
        }
        catch(NumberFormatException e)
        {
        	System.out.println("Letra Insertada");
        	numFallos++;
            numero = -1;
        }
        catch(IOException e)
        {
        	System.out.println("Fallo");
        	numFallos++;
            numero = -1;
        }
        
        return numero;
    }
    
    static void cadenaNumeros(int num)
    {
        registroNumeros = registroNumeros + num+", ";
            
    }
}