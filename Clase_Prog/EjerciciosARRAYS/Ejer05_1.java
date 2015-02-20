package EjerciciosARRAYS;
//Crear un método que devuelve si una frase pasada como parámetro es palíndromo o no. 
//En el programa principal se pedirá una frase y se mostrará un mensaje diciendo si es palíndromo o no, 
//continuará pidiendo frases hasta que se pulse enter. Utilizaremos el método pideCadena. 
//Se valorará positivamente utilizar la ejecución más óptima. (Recorrer la frase el número de veces estrictamente necesario)

public class Ejer05_1
{
	public static void main(String[] args) 
	{
		//String sPalabra = "anilina";
        String palabra = "Anita lava la tina";
        
        // Si queremos saber si es palíndromo una frase deberemos de borrar los espacios
        // sPalabra = sPalabra.replace(" ", "");
        
        int inc = 0; 
        int des = palabra.length()-1;
        boolean bError = false;         
        
        while ((inc<des) && (!bError))
        {
        	if (palabra.charAt(inc) == palabra.charAt(des))
        	{
        		inc++;
        		des--;
        	}
        	else
        	{
        		bError = true;
        	}               
        }
        
        if(!bError)
        {
        	System.out.println(palabra + " es un PALINDROMO");
        }     
        else
        {
        	 System.out.println(palabra + " NO es un palindromo");
        }  
   }
}