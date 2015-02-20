package EXCEPCIONES2;
//Clase constructora de Alumno

public class Ejer35_Alumno
{
	String nombre;
    int edad;
    float altura;
    
    void mostrarDatos()	//Metodo para visualizar los datos de alumno
    {
        System.out.println("Nombre: "+nombre+"    Edad: "+edad);
        System.out.println("Altura: "+altura);
    }
    
    Ejer35_Alumno(String nombre, int edad, float altura)	//Metodo constructor
    {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.altura = altura;
    }
}