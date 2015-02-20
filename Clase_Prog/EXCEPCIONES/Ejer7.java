package EXCEPCIONES;
import java.io.*;
import java.util.*;

public class Ejer7
{
	public static int diaA;
	public static int mesA;
	public static int añoA;
	static Calendar calen = Calendar.getInstance();
	
	public static void main(String[] args)
	{
		cargarAlumnos();
	}
	
	static void cargarAlumnos()
	{	
		Ejer7_Alumno alumno;
		Ejer7_Alumno alumnoM;
		Ejer7_Fecha fecha;
		Ejer7_Fecha fechaM;
		int dia, mes, año;
		String nombre, nombreM="N";
		
		int diaS = calen.get(Calendar.DATE);
		int mesS = (calen.get(Calendar.MONTH) + 1);
		int anioS = calen.get(Calendar.YEAR);
		fechaM = new Ejer7_Fecha(diaS, mesS, anioS);
		alumnoM = new Ejer7_Alumno(nombreM, fechaM);
		
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
				
				fecha = new Ejer7_Fecha(dia, mes, año);
			}
			while(fecha.correcta() == false);
			
			nombre = pideCadena("Nombre: ");
			alumno = new Ejer7_Alumno(nombre, fecha);
			alumno.muestraAlumno();
			
			if(fecha.esMayor(fecha, fechaM))
			{
				nombreM = nombre;
				fechaM = fecha;
				alumnoM = new Ejer7_Alumno(nombre, fechaM);
			}			
			System.out.println("");
		}
		
		System.out.println("---------------------------------");
		System.out.println("El alumno mas mayor es: ");
		alumnoM.muestraAlumno();
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
    
    static float pideFloat(String texto)
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
    
    static String pideCadena(String texto) 
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