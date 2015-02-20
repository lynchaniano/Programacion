package PROYECTO;
import java.io.*;
/*
 * Programa para mostrar un listado de las ventas de productos a lo largo de los meses calculando los maximos de cada mes y
 * guardando el resutaodo en ficheros. 
 * @autor: David Algas
 */
public class Proyecto
{
	static String productos[];
	static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Total Producto"};
	static String maximoMesP[]= new String[meses.length-1];
	static int TOTALPROD[];
	static int TOTALMES[] = new int[meses.length-1];
	static int maximoMes[]= new int[meses.length-1];
	static int ventas[][];
	static int MAXcant=0;
	static String MAXMes="", MAXProd="";
	
	
	public static void main(String[] args)
	{
		llenarMatriz();
		sumarFilas();
		sumarColum();
		maxVendido();
		mostrarArrays();
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Llenamos la matriz ventas y el fichero MatrizValores con numeros aleatorios entre 0 y 100.
	static void llenarMatriz()
	{
		int numProduc = pideInt("¿Cuantos Productos Visualizar?: ");
		productos = new String[numProduc];
		TOTALPROD = new int[numProduc];
		int cont = 1;
		for(int a=0; a<productos.length; a++)
		{
			productos[a] = "Prod_"+cont;
			cont++;
		}
		
		ventas = new int[productos.length][12];
		int ale=0;
		String numAle="";
		
		try
		{
			FileWriter fw = new FileWriter("src/PROYECTO/ValoresMatriz.txt");
			
			for(int a=0; a<ventas.length; a++)
			{
				for(int b=0; b<ventas[a].length;b++)
				{
					ale = (int)(Math.random()*100);
					numAle = Integer.toString(ale);
					ventas[a][b] = ale;
					fw.write(numAle+"\r\n");
				}
			}
			fw.close();
			
		}
		catch(IOException e)
		{
			System.out.println("Error en FIchero: "+e);
		}
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Metodo para sumar las filas y obtener el total ventas de un producto a lo largo del año.
	static void sumarFilas()
	{
		for (int f=0; f<ventas.length; f++) 
		{
			for (int c=0; c<ventas[f].length; c++)
			{
				TOTALPROD[f] =  TOTALPROD[f] + ventas[f][c];
			}
		}
	 }
	
	
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Metodo para sumar las columnas y obtener el total ventas de un producto a lo largo de un mes.
	static void sumarColum()
	{
		int suma=0;
		
		for(int f=0; f<meses.length-1; f++)
		{
			suma = 0;
			 
			for(int c=0; c<productos.length; c++)
			{
				suma = suma + ventas[c][f];
			}
			TOTALMES[f] = suma;
		}
	}
	 
	 
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Metodo que recorre la matriz ventas y guarda en un array las ventas maximas por mes, ademas busca el maximo de toda la matriz.
	static void maxVendido()
	{
		int mesMax=0;
		String prodMAX="";
	 
		for (int f=0; f<meses.length-1; f++)
		{
			mesMax = 0;
			for (int c=0; c<productos.length; c++)
			{
				if(ventas[c][f] >= mesMax)
				{
					mesMax = ventas[c][f];
					prodMAX = productos[c];
				}
			 
				if(ventas[c][f] >= MAXcant)
				{
					MAXcant = ventas[c][f];
					MAXMes = meses[f];
					MAXProd = productos[c];
				}
			 
				maximoMes[f] = mesMax;
				maximoMesP[f] = prodMAX;
			}
		}
	}
	 
	 
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Metodo para mostrar todos los arrays de form ordenada.
	static void mostrarArrays()
	{
		try
		{
			FileWriter fw = new FileWriter("src/PROYECTO/Tabla.txt");
			
			//Bucle que muestra o guarda en un fichero los meses del año
			for(int a=0; a<meses.length; a++)
			{
				fw.write((a==0?"\t\t":"")+"│"+(a==1 || a==8 || a==9 || a==10 || a==11?meses[a]+"\t":meses[a]+"\t\t")+(a==12?"│\r\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\r\n":""));
				//System.out.print((a==0?"\t\t":"")+"│"+(a==1 || a==8 || a==9 || a==10 || a==11?meses[a]+"\t":meses[a]+"\t\t")+(a==12?"│\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n":""));
			}
			
			//Metodo para mostrar o guardar en un fichero las compra de cada producto por mes
			for (int f=0; f<ventas.length; f++) 
			{
				for (int c=0; c<ventas[f].length; c++)
				{ 
					fw.write((c==0?"    "+productos[f]+"\t│\t":"")+ventas[f][c]+"\t│\t"+(c==11?"   "+TOTALPROD[f]+"\t\t│\r\n":""));
					//System.out.print((c==0?"    "+productos[f]+"\t│\t":"")+ventas[f][c]+"\t│\t"+(c==11?"   "+TOTALPROD[f]+"\t\t│\n":""));
				}
				fw.write("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\r\n");
				//System.out.println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
			}
			fw.write("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\r\n");
			//System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");

			//Bucle que muestra o guarda en un ficgero el total de cada mes
			for(int a=0; a<TOTALMES.length; a++)
			{
				fw.write((a==0?"|Total Mes: "+"\t│\t":"")+TOTALMES[a]+"\t|\t");
				//System.out.print((a==0?"|Total Mes: "+"\t│\t":"")+TOTALMES[a]+"\t|\t");
			}
			fw.write("\r\n");
			fw.write("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤\r\n");
			//System.out.println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
			
			//Bucle que muestra o guarda en un archivo el Maximo de cada mes (En letras)
			for(int a=0; a<TOTALMES.length; a++)
			{
				fw.write((a==0?"|Maximo Mes: "+"\t│":" ")+maximoMesP[a]+" "+maximoMes[a]+"Uds"+"\t|");
				//System.out.print((a==0?"|Maximo Mes: "+"\t│":" ")+maximoMesP[a]+" "+maximoMes[a]+"Uds"+"\t|");
			}
			fw.write("\r\n");
			fw.write("--> El mas vendido es: "+MAXProd+" en "+MAXMes+" con "+MAXcant+" unidades.");
			//System.out.println("--> El mas vendido es: "+MAXProd+" en "+MAXMes+" con "+MAXcant+" unidades.");
			
			fw.close();
			
		}catch(IOException e)
		{
			System.out.println("Error fichero2: "+e);
		}
		
		System.out.println();
		System.out.println("¡Fichero Generado Con exito!");
		System.out.println("Gracias, vuelva Pronto");
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------
	//Metodo para pedir Numero enteros controlando los fallos de insercion.
	static int pideInt(String texto)
	{
		String cadnum;
		int numero = 0;
		boolean correcto;
     
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
     
		do
		{
			try
			{
				correcto = true;
				System.out.print(texto);
				cadnum = teclado.readLine();
				
				//Condicion para que solo se introduzcan Numeros entre el 1 y el 10.
				if(Integer.parseInt(cadnum)>100 || Integer.parseInt(cadnum)<=0)
				{
					correcto = false;
					System.out.println("\t\t\t\tSolo del 1 al 100");
				}
				else
				{
					numero = Integer.parseInt(cadnum);
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("\t\t\t\tValor del 1 al 100");
				correcto = false;
			}
			catch (IOException e)
			{
				System.out.println("\t\t\t\tError Generico: "+e);
				correcto = false;
			}
		}
		while (correcto != true);
		return numero;
	 }
}