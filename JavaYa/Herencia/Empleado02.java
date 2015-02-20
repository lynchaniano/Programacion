package Herencia;

public class Empleado02 extends Persona02
{
	protected int sueldo;
	
	public void cargasueldo()
	{
		System.out.print("Introduci Sueldo: ");
		sueldo = leer.nextInt();
	}
	
	public void mostrarSueldo()
	{
		System.out.println("Sueldo: "+sueldo);
	}
}