package ForAnidados;

public class Ejercicio07
{
	public static void main(String[] args)
	{
		int horas, minutos, segundos;
		
		for(horas = 0; horas<=23; horas++)
		{
			for(minutos = 0; minutos<=59; minutos++)
			{
				for(segundos = 0; segundos<=59; segundos++)
				{
					System.out.println(horas+":"+minutos+":"+segundos);
				}
			}
		}
	}
}