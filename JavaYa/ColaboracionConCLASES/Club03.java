package ColaboracionConCLASES;
import java.util.*;

public class Club03
{
    private final Socio03 socio1, socio2, socio3;
    private final Scanner leer;

    public static void main(String[] args)
    {
        System.out.println("  -- Club --");
        Club03 cl = new Club03();
        cl.yearServicio();
    }

    public Club03()
    {
        leer = new Scanner(System.in);
        socio1 = new Socio03(leer);
        socio2 = new Socio03(leer);
        socio3 = new Socio03(leer);
    }

    public void yearServicio()
    {
        System.out.print("Socio con mayor antiguedad: ");

        if (socio1.retornarDatos() > socio2.retornarDatos() && socio1.retornarDatos() > socio3.retornarDatos())
        {
            socio1.mostarDatos();
        }
        else
        {
            if (socio2.retornarDatos() > socio3.retornarDatos())
            {
                socio2.mostarDatos();
            }
            else
            {
                socio3.mostarDatos();
            }
        }
    }
}