package EXCEPCIONES2;
//Ejercicio de la página 122 del libro. Crearemos la clase Pantalla con pideInt y pideFloat. Utilizaremos InputStreamReader.

public class Ejer35 
{
    public static void main (String [] args)
    {
    	Ejer35_Pantalla leer = new Ejer35_Pantalla();	//Instanciamos la clase pantalla para podr usar sus metodos
    	Ejer35_Alumno alumno01, alumno02;	//Creamos dos objetos de la clase alumno para poder usarlos
    	
		String nombre = leer.pideCadena("Nombre: ");
		int edad = leer.pideInt("Edad: ");
		float altura = leer.pideFloat("Altura: ");
		alumno01 = new Ejer35_Alumno(nombre, edad, altura);		//Insertamos los valores nombre, edad, altura en el objeto alumno01
		
		System.out.println("");
		
		String nombre2 = leer.pideCadena("Nombre: ");
		int edad2 = leer.pideInt("Edad: ");
		float altura2 = leer.pideFloat("Altura: ");
		alumno02 = new Ejer35_Alumno(nombre2, edad2, altura2);	//Insertamos los valores nombre, edad, altura en el objeto alumno02
        
        if(alumno01.edad == alumno02.edad)	//Comparamos si las edades son iguales
        {
        	System.out.println("Los Alumnos Tienen la misma Edad: "+alumno01.edad);
        }
            
        if(alumno01.edad > alumno02.edad)	//Comparamos si la edad de uno es mayor que la del otro
        {
        	System.out.println(alumno01.nombre+" es mas mayor con "+alumno01.edad+" años");
        }
        else	//En caso contrario la mayor es la otra edad
        {
        	System.out.println(alumno02.nombre+" es mas mayor con "+alumno02.edad+" años");
        }
    }
}