package EXCEPCIONES2;
import java.io.*;
//Ejercicio de la página 122 del libro. Insertar 2 alumnos y obtener los datos del mayor

public class Ejer37 
{
	public static void main(String[] args)
	{
		String nombre = pideCadena("Nombre: ");
		int edad = pideInt("Edad: ");
		float altura = pideFloat("Altura: ");
		Ejer35_Alumno alumno01 = new Ejer35_Alumno(nombre, edad, altura);	//Insertamos los valores nombre, edad, altura en el objeto alumno01
		
		System.out.println("");
		
		String nombre2 = pideCadena("Nombre: ");
		int edad2 = pideInt("Edad: ");
		float altura2 = pideFloat("Altura: ");
		Ejer35_Alumno alumno02 = new Ejer35_Alumno(nombre2, edad2, altura2);	//Insertamos los valores nombre, edad, altura en el objeto alumno0
	        
        System.out.print("\n\n\n");
        
        if(alumno01.edad == alumno02.edad)	//Comparamos si la edad de los alumnos es igual entre ellos
        {
        	System.out.println("Los Alumnos Tienen la misma Edad: "+alumno01.edad);
        }
            
        if(alumno01.edad > alumno02.edad)	//Comparamos si la edad de uno es mayor que la del otro
        {
        	System.out.println(alumno01.nombre+" es mas mayor con "+alumno01.edad+" años");
        }
        else	//Si no la del otro es mayor
        {
        	System.out.println(alumno02.nombre+" es mas mayor con "+alumno02.edad+" años");
        }
	}
	
	 static int pideInt(String texto)	//Metodo para la lectura de enteros controlando los posibles fallos al inserta valores incorrectos
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
	    		 System.out.println("Introduzca Nº");
	    		 correcto = false;
	    	 }
	    	 catch (IOException e)
	    	 {
	    		 System.out.println("Se ha producido un error: "+e);
	    		 
	    		 correcto = false;
	    	 }
	     }
	     while (!correcto);
	     return numero;
	 }
	 
	 static float pideFloat(String texto)	//Metodo para la lectura de float controlando los posibles fallos al inserta valores incorrectos
	 {
		 InputStreamReader flujo = new InputStreamReader(System.in);
		 BufferedReader teclado = new BufferedReader(flujo);
		 String cadnum;
		 float numero = 0;
		 boolean correcto;
	        
		 do
		 {
			 try
			 {
				 correcto = true;
				 System.out.print(texto);
				 cadnum=teclado.readLine();
				 numero=Float.parseFloat(cadnum);
            }
            catch (NumberFormatException e) 
        	{
            	System.out.println("Introduzca Nº");
                correcto=false;
            }
            catch (IOException e) 
        	{
                System.out.println("Se ha producido un error: "+e);
                
                correcto = false;
            }
        }
        while (!correcto);
        return numero;
	 }
	 
	 static String pideCadena(String texto)	////Metodo para la lectura de cadenas de texto controlando los posibles fallos al inserta valores incorrectos
	 {
		 InputStreamReader flujo = new InputStreamReader(System.in);
		 BufferedReader teclado = new BufferedReader(flujo);
        
		 String cadnum = null;
		 System.out.print(texto);
        
		 try
		 {
			 cadnum = teclado.readLine();
		 } 
		 catch (IOException e) 
		 {
			 System.out.println("Hay errores: "+e);
			
		 }
		 
        return cadnum;
	 }
}