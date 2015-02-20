package ClaseSTRING;
import java.util.*;
//Explicacion Abajo
public class metodosString02
{
    private Scanner leer;
    private String cadena;
    
    public static void main(String[] args)
    {
        metodosString02 cad = new metodosString02();
        cad.primerMitad();
        cad.ultimoCaracter();
        cad.formaInversa();
        cad.conGuion();
        cad.cantidadVocales();
        cad.esCapicua();
    }
    
    public metodosString02()
    {
        leer = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        cadena = leer.nextLine();
    }

    public void primerMitad()
    {
    	String parte;
    	parte = cadena.substring(0,cadena.length()/2);
        System.out.println("Primer mitad de caraceres: "+parte);
    }
    
    public void ultimoCaracter() 
   {
    	char ultimo = cadena.charAt(cadena.length()-1);
        System.out.println("Ultimo caracter: "+ultimo);
    }
    
    public void formaInversa()
    {
    	System.out.println("Impresión en forma inversa: ");
    	
        for(int f=cadena.length()-1; f>=0; f--)
        {
            System.out.print(cadena.charAt(f));
        }
        System.out.println();
    }
    
    public void conGuion()
    {
        System.out.println("Separado por guiones: ");
        
        for(int f=0; f<cadena.length(); f++)
        {
            System.out.print(cadena.charAt(f)+"-");
        }
        System.out.println();
    }
    
    public void cantidadVocales()
    {
        int cant=0;
        
        for(int f=0; f<cadena.length(); f++)
        {
            if (cadena.charAt(f)=='a' || cadena.charAt(f)=='e' || 
                cadena.charAt(f)=='i' || cadena.charAt(f)=='o' || 
                cadena.charAt(f)=='u' || cadena.charAt(f)=='A' || 
                cadena.charAt(f)=='E' || cadena.charAt(f)=='I' || 
                cadena.charAt(f)=='O' || cadena.charAt(f)=='U')
            {
            	cant++;
            }
        }
        System.out.println("Cantidad de vocales: "+cant);
    }
    
    public void esCapicua()
    {
        int cant = 0;
        
        for(int f=0; f<cadena.length()/2; f++) 
        {
            if(cadena.charAt(f)==cadena.charAt(cadena.length()-1-f))
            {
                cant++;
            }            	
        }
        if(cant==cadena.length()/2)
        {
            System.out.println("Es capicúa la cadena "+cadena);
        }
        else
        {
            System.out.println("No es capicúa la cadena "+cadena);        
        }
    }
}
/*
 * Cargar un String por teclado e implementar los siguientes métodos:

a) Imprimir la primera mitad de los caracteres de la cadena. 
b) Imprimir el último caracter. 
c) Imprimirlo en forma inversa. 
d) Imprimir cada caracter del String separado con un guión. 
e) Imprimir la cantidad de vocales almacenadas. 
f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)*/