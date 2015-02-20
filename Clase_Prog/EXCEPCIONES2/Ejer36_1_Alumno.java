package EXCEPCIONES2;
//Clase constructora de Alumno

public class Ejer36_1_Alumno
{	
	String nombre;
    Ejer36_1_Fecha fecha;
    
    void muestraAlumno()	//Metodo para visualizar los datos de alumno
	{
        System.out.println("\tNombre: "+nombre+"     Edad: "+fecha.edad(fecha));
        System.out.println("\tFecha Nacimiento: "+fecha.dia+"/"+fecha.mes+"/"+fecha.year);
    }
    
   String getNombre() //Metodo get que devuelve el nombre del alumno
   {
       return nombre;
   }
   
   public Ejer36_1_Alumno(String nombre, Ejer36_1_Fecha fecha)	//Metodo constructor
   {
	  this.nombre = nombre;
	  this.fecha = fecha;
   }
}