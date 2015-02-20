package Deberes;
import java.util.*;

public class fechas 
{
	static Scanner leer;
	private int dia;
	private int mes;
	private int year;
	
	public int getDia()
	{
		return dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
	
	
	public int pideEntero()
	{
		int numero = 0;
		leer = new Scanner(System.in);
		
		System.out.print("-->: ");
		numero = leer.nextInt();
		
		return numero;
	} 
	
	public void pideFecha()
	{
		System.out.println("Introducir Dia");
		dia = pideEntero();
		System.out.println("Introducir Mes");
		mes = pideEntero();
		System.out.println("Introducir Año");
		year = pideEntero();
	}
	
	public void muestraMes()
	{
		switch (mes)
		{
		case 1:
			System.out.println("Es Enero");
			break;
		case 2:
			System.out.println("Es Febrero");
			break;
		case 3:
			System.out.println("Es Marzo");
			break;
		case 4:
			System.out.println("Es Abril");
			break;
		case 5:
			System.out.println("Es Mayo");
			break;
		case 6:
			System.out.println("Es Junio");
			break;
		case 7:
			System.out.println("Es Julio");
			break;
		case 8:
			System.out.println("Es Agosto");
			break;
		case 9:
			System.out.println("Es Septiembre");
			break;
		case 10:
			System.out.println("Es Octubre");
			break;
		case 11:
			System.out.println("Es Noviembre");
			break;
		case 12:
			System.out.println("Es Diciembre");
			break;
		default:
			System.out.println("ERROR!");
			break;
		}
	}
	
	public boolean esBisiesto()
	{
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getDiaMes()
	{
		switch (mes)
		{
		case 1:
			System.out.println("Es Enero");
			break;
		case 2:
			System.out.println("Es Febrero");
			break;
		case 3:
			System.out.println("Es Marzo");
			break;
		case 4:
			System.out.println("Es Abril");
			break;
		case 5:
			System.out.println("Es Mayo");
			break;
		case 6:
			System.out.println("Es Junio");
			break;
		case 7:
			System.out.println("Es Julio");
			break;
		case 8:
			System.out.println("Es Agosto");
			break;
		case 9:
			System.out.println("Es Septiembre");
			break;
		case 10:
			System.out.println("Es Octubre");
			break;
		case 11:
			System.out.println("Es Noviembre");
			break;
		case 12:
			System.out.println("Es Diciembre");
			break;
		default:
			System.out.println("ERROR!");
			break;
		}
		
		return dia;
	}
	
	public boolean correcta()  //Indica si una fecha es correcta o no
	{
		if(year>= 1)
		{
			if(mes >=1 && mes<=12)
			{
				if(dia >=1 && dia<=getDiaMes())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}