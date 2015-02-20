package DeclaracionMetodos;
import java.util.*;
//Métodos que retornan un dato.
//Confeccionar una clase que permita ingresar tres valores por teclado.
//Luego mostrar el mayor y el menor.
public class Metodos03
{
	private Scanner leer;
	
    public static void main(String[] args)
    {
    	Metodos03 mayor = new Metodos03();
        mayor.cargarNumeros();
    }
    
    public void cargarNumeros()
    {
    	leer = new Scanner(System.in);
    	int numero1, numero2, numero3, numMayor, numMenor;
    	
        System.out.print("Ingrese primer valor: ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese segundo valor: ");
        numero2 = leer.nextInt();
        System.out.print("Ingrese tercer valor: ");
        numero3 = leer.nextInt();
        
        numMayor = calcularMayor(numero1, numero2, numero3);
        numMenor = calcularMenor(numero1, numero2, numero3);
        
        System.out.println("El valor mayor de los tres es: "+numMayor);
        System.out.println("El valor menor de los tres es: "+numMenor);
    }
    
    public int calcularMayor(int valor1, int valor2, int valor3)
    {
        int mayor;
        
        if(valor1>valor2 && valor1>valor3)
        {
          mayor = valor1;
        }
        else
        {
            if(valor2>valor3)
            {
                mayor = valor2;
            }
            else
            {
            	mayor = valor3;
            }
        }
        return mayor;
    }
    
    public int calcularMenor(int valor1, int valor2, int valor3)
    {
        int menor;
        
        if(valor1<valor2 && valor1<valor3)
        {
          menor = valor1;
        }
        else
        {
            if(valor2<valor3)
            {
                menor = valor2;
            }
            else
            {
            	menor = valor3;
            }
        }
        return menor;
    }
}