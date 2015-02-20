package ClaseSTRING;
import java.util.*;
//Confeccionar una clase que solicite el ingreso de dos String y luego emplee los métodos más comunes de la clase String.
public class metodosString01
{
	static Scanner leer;
	
    public static void main(String[] args)
    {
    	leer = new Scanner(System.in);
        String cad1;
        String cad2;
        
        System.out.print("Cadena 1: ");
        cad1 = leer.nextLine();
        System.out.print("Cadena 2: ");
        cad2 = leer.nextLine();
        
        
        //boolean equals(String s1)
        //Compara las cadenas de caracteres.
        if(cad1.equals(cad2)==true)
        {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        }
        else
        {
            System.out.println(cad1+" no es exactamente igual a "+cad2);        
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Compara las cadenas de caracteres sin tener en cuenta las mayusculas o minusculas
        if(cad1.equalsIgnoreCase(cad2)==true)
        {
            System.out.println(cad1+" es igual a "+cad2+" sin tener en cuenta mayúsculas/minúsculas");
        }
        else
        {
            System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta mayúsculas/minúsculas");        
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        if(cad1.compareTo(cad2)==0)
        {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        }
        else
        {
        	if (cad1.compareTo(cad2)>0)
        	{
                System.out.println(cad1+ " es mayor alfabéticamente que "+cad2);
            }
        	else
        	{
                System.out.println(cad2+ " es mayor alfabéticamente que "+cad1);            
            }
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna un caracter del String, llega al método la posición del caracter a extraer.
        char carac1 = cad1.charAt(0);
        System.out.println("El primer caracter de "+cad1+" es "+carac1);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna la cantidad de caracteres almacenados en el String.
        int largo = cad1.length();
        System.out.println("El largo del String "+cad1+" es "+largo);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna un substring a partir de la posición indicada en el parámetro pos1 hasta la posición pos2 sin incluir dicha posición.
        String cad3 = cad1.substring(0,3);
        System.out.println("Los primeros tres caracteres de "+cad1+" son "+cad3);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //int indexOf(String s1)
        //Retorna -1 si el String que le pasamos como parámetro no está contenida en la cadena del objeto que llama al método. 
        int posi = cad1.indexOf(cad2);
        
        if(posi==-1)
        {
            System.out.println(cad2+" no está contenido en "+cad1);
        }
        else
        {
            System.out.println(cad2+" está contenido en "+cad1+" a partir de la posición "+posi);
        }
        
        
        
        System.out.println(cad1+ " convertido a mayúsculas es "+cad1.toUpperCase());
        System.out.println(cad1+ " convertido a minúsculas es "+cad1.toLowerCase());        
    }
}