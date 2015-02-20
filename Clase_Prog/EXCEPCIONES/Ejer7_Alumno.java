package EXCEPCIONES;

public class Ejer7_Alumno
{	
	String nombre;
    Ejer7_Fecha fecha;
    
    void muestraAlumno()
	{
        System.out.println("\tNombre: "+nombre+"     Edad: "+fecha.edad(fecha));
        System.out.println("\tFecha Nacimiento: "+fecha.dia+"/"+fecha.mes+"/"+fecha.year);
    }
    
   String getNombre()
   {
       return nombre;
   }
   
   public Ejer7_Alumno(String nombre, Ejer7_Fecha fecha)
   {
	  this.nombre = nombre;
	  this.fecha = fecha;
   }
}