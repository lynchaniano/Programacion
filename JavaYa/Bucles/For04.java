package Bucles;
import java.util.*;
//Ingresar coordenadas (X,Y) que representan puntos en el plano.
//Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
//Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
public class For04
{
	static Scanner leer;
	
    public static void main(String[] args)
    {
        leer = new Scanner(System.in);
        
        int numCordenadas,ejeX ,ejeY ,cant1 ,cant2 ,cant3 ,cant4;
        
        cant1 = 0;
        cant2 = 0;
        cant3 = 0;
        cant4 = 0;
        
        System.out.print("Cantidad de puntos: ");
        numCordenadas = leer.nextInt();
        
        for(int f=1; f<=numCordenadas; f++)
        {
            System.out.print("Ingrese coordenada X: ");
            ejeX = leer.nextInt();
            System.out.print("Ingrese coordenada Y: ");
            ejeY = leer.nextInt();
            
            if(ejeX>0 && ejeY>0)
            {
                cant1++;
            }
            else
            {
                if(ejeX<0 && ejeY>0)
                {
                    cant2++;
                }
                else
                {
                	if(ejeX<0 && ejeY<0)
                	{
                        cant3++;
                    }
                	else
                	{
                		if(ejeX>0 && ejeY<0)
                		{
                        	cant4++;
                        }
                    }
                }
            }
        }
        
        System.out.println("Cantidad de puntos en el primer cuadrante: "+cant1);
        System.out.println("Cantidad de puntos en el segundo cuadrante: "+cant2);
        System.out.println("Cantidad de puntos en el tercer cuadrante: "+cant3);
        System.out.println("Cantidad de puntos en el cuarto cuadrante: "+cant4);
    }
}