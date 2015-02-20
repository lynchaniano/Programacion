package ColaboracionConCLASES;
import java.util.*;

public class Socio03
{
    private final String nombre;
    private final int year;

    public Socio03(Scanner leer)
    {
        System.out.print("Ingrese Socio: ");
        nombre = leer.next();
        System.out.print("Ingrese la antiguedad: ");
        year = leer.nextInt();
    }

    public void mostarDatos()
    {
        System.out.println(nombre + " lleva en el club " + year);
    }

    public int retornarDatos()
    {
        return year;
    }
}