package Herencia;

public class Prueba02 
{

	public static void main(String[] args)
	{
		System.out.println("  -- Herencia02 --");
		Persona02 persona = new Persona02();
		Empleado02 empleado = new Empleado02();
		
		persona.cargaDatos();
		persona.mostrarDatos();
		
		empleado.cargaDatos();
		empleado.cargasueldo();
		empleado.mostrarDatos();
		empleado.mostrarSueldo();	
	}
}