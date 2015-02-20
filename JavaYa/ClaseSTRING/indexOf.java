package ClaseSTRING;
import java.util.*;
//Realizar una clase, que permita cargar una dirección de mail en el constructor, 
//luego en otro método mostrar un mensaje si contiene el caracter '@'.
public class indexOf
{
	private Scanner leer;
	private String mail;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Metodo IndexOf --");
		indexOf st = new indexOf();
		st.contiene();
	}
	
	public indexOf()
	{
		leer = new Scanner(System.in);
		System.out.print("Ingresar E-Mail: ");
		mail = leer.next();
		
	}
	
	public void contiene()
	{
		boolean existe = false;
		
        for(int f=0; f<mail.length(); f++)
        {
            if(mail.charAt(f)=='@')
            {
                existe = true;
            }
        }
        
        if(existe==true)
        {
            System.out.println(mail+" contiene el caracter @");
        }
        else
        {
            System.out.println(mail+" no contiene el caracter @");        
        }
	}
}