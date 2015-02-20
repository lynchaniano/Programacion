package EXCEPCIONES2;
//Clase Alumno

public class Ejer37_Alumno
{
	String nombre;
    int edad;
    float altura;
    
    Ejer37_Alumno(String nombre, int edad, float altura) //Metodo Constructor
    {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.altura = altura;
    }
    
    void mostrarDatos()	//Metodo para visualizar los datos del alumno
    {
        System.out.println("Nombre: "+nombre+"    Edad: "+edad);
        System.out.println("Altura: "+altura);
    }
    
    int getEdad() //Gette para obterner la edad
    {
        return edad;
    }
}