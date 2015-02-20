package EXCEPCIONES2;
import java.io.*;
import java.util.*;
//Tendremos una clase alumno con su nombre y su fecha de nacimiento (dia, mes, year).
//Utilizaremos la clase fecha para comprobar que introducen los datos correctamente, y la clase Pantalla. 
//También pediremos la fecha actual y calcularemos la edad. Pediremos los datos de 5 alumnos, para cada uno de ellos diremos la edad que 
//tienen actualmente y al final, mostraremos los datos del más mayor.

public class Ejer36_1
{
	public static int diaA;
	public static int mesA;
	public static int añoA;
	static Calendar calen = Calendar.getInstance(); //Clase Calendar instanciada para obtener la fecha de sistema(Actual)
	
	public static void main(String[] args)
	{
		cargarAlumnos();
	}
	
	static void cargarAlumnos()	//Metodo para la introduccion de los valores a los objetos alumno y realizacion del la condiciones
	{	
		Ejer36_1_Alumno alumno;
		Ejer36_1_Alumno alumnoM;
		Ejer36_1_Fecha fecha;
		Ejer36_1_Fecha fechaM;
		int dia, mes, año;
		String nombre, nombreM="N";
		
		int diaS = calen.get(Calendar.DATE);
		int mesS = (calen.get(Calendar.MONTH) + 1);
		int anioS = calen.get(Calendar.YEAR);
		fechaM = new Ejer36_1_Fecha(diaS, mesS, anioS);	//Insertamos los valores de la fecha actual
		alumnoM = new Ejer36_1_Alumno(nombreM, fechaM);	//Insertamos los valores nombre, edad, altura en el objeto alumno Mayor por defecto
		
		System.out.println("-- Fecha Actual");
		añoA = pideInt("Año: ");
		mesA = pideInt("Mes: ");
		diaA = pideInt("Dia: ");
		System.out.println("");
		
		for(int a=0; a<5; a++)
		{
			System.out.println("Alumno Nº"+(a+1));
			do
			{
				año = pideInt("Año: ");
				mes = pideInt("Mes: ");
				dia = pideInt("Dia: ");
				
				fecha = new Ejer36_1_Fecha(dia, mes, año);	////Insertamos los valores al objeto fecha
			}
			while(fecha.correcta() == false);
			
			nombre = pideCadena("Nombre: ");
			alumno = new Ejer36_1_Alumno(nombre, fecha);	//Insertamos los valores al objeto alumno
			alumno.muestraAlumno();
			
			if(fecha.esMayor(fecha, fechaM))	//Comprobamos que alumno es mayor
			{
				nombreM = nombre;
				fechaM = fecha;
				alumnoM = new Ejer36_1_Alumno(nombre, fechaM); //Insertamos al alumno Mayor
			}			
			System.out.println("");
		}
		
		System.out.println("---------------------------------");
		System.out.println("El alumno mas mayor es: ");
		alumnoM.muestraAlumno();	//Mostramos el alumno Mayor
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
            	System.out.println("Tienes que introducir un nº");
                correcto = false;
            }
            catch (IOException e)
        	{
            	System.out.println("Se ha producido un error");
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
                System.out.println("Tienes que introducir un nº");
                correcto=false;
            }
            catch (IOException e) 
        	{
                System.out.println("Se ha producido un error: ");
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
        catch (IOException ex) 
        {
            System.out.println("\tHay errores: "+ex);
        }
        return cadnum;
    }
}