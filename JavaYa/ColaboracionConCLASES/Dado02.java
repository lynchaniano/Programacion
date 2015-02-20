package ColaboracionConCLASES;

public class Dado02
{
    private int valor;

    public void tirarDado()
    {
        valor = 1 + (int) (Math.random() * 6);
    }

    public void imprimir()
    {
        System.out.println("El valor del dado es: " + valor);
    }

    public int retornarValor()
    {
        return valor;
    }
}