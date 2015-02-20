package ColaboracionConCLASES;

public class Cliente01
{
    private final String nombre;
    private int dinero;
    
    public Cliente01(String nom)
    {
        nombre = nom;
        dinero = 0;
    }
    
    public void depositar(int m)
    {
        dinero = dinero + m;
    } 
    
    public void extraer(int m)
    {
        dinero = dinero - m;
    }
    
    public int devolverDinero()
    {
        return dinero;
    }
    
    public void imprimir()
    {
        System.out.println(nombre+" tiene depositado la suma de "+dinero+"�");
    }
}