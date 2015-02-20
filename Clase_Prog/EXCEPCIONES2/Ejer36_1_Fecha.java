package EXCEPCIONES2;
//Clase fecha creada para el tratamiento de fechas

public class Ejer36_1_Fecha
{
    int dia;
    int mes;
    int year;
   
    public Ejer36_1_Fecha(int d, int m, int y)	//Metodo Constructor
	{
		dia = d;
        mes = m;
        year = y;
    }

    //Getter y Setters
    public int getMes()
	{
        return mes;
    }
    public int getDia()
	{
        return dia;
    }
    public int getyear()
	{
        return year;
    }
    
    public boolean correcta()	//Metodo para saber si la fecha introducida es correcta
	{
        boolean correcto = true;
        int ndias = getDiasMes();
        
        if (mes>12 || mes<1)
		{
            System.out.println("MES INCORRECTO");
            correcto = false;
        }
        if (dia<1 || dia>ndias)
		{
            System.out.println("NUMERO DE DÍAS INCORRECTO");
            correcto = false;
        }
        if (year<0)
		{
            System.out.println("AÑO INCORRECTO");
            correcto = false;
        }
        return correcto;
    }
   
    boolean esBisiesto()	//Metodo para saber si un año es bisiesto o no
	{
        if (((year % 4) == 0) && (((year%100) != 0)) || ((year % 400) == 0))
		{
            return true;
        }
        else
		{
            return false;
        }
    }
     
    public int getDiasMes()	//Metodo para obtener los dias de cada mes
	{
    	boolean bis = esBisiesto();
    	
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) 
        {
            return 31;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            return 30;
        }
        if (mes == 2 && bis == true)
        {
            return 29;
        }
        else 
        {
            return 28;
        }
    }
    
    int edad(Ejer36_1_Fecha f) //Devuelve el número de años de diferencia entre la fecha del objeto y f
    {
    	int edad = 0;
    	int anio = Ejer36_1.añoA;
    	int mon = Ejer36_1.mesA;
    	int dia = Ejer36_1.diaA;
    	
    	if(f.year < anio)
    	{
    		edad = (anio - f.year) - 1;
    		
    		if(f.mes < (mon+1))
    		{
    			if(f.dia < dia)
    			{
    				edad = edad + 1;
    			}
    		}
    	}
    	
    	return edad;
    }
    
    boolean esMayor(Ejer36_1_Fecha f, Ejer36_1_Fecha f2) //Devuelve true si la fecha del objeto es menor que la fecha f.
    {    	
    	if(edad(f) > edad(f2))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}