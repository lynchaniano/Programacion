package ColaboracionConCLASES;
//Un banco tiene 3 clientes que pueden hacer dep�sitos y extracciones.
//Tambi�n el banco requiere que al final del d�a calcule la cantidad de dinero que hay depositada.
public class Banco01
{
    private final Cliente01 cliente1,cliente2,cliente3;
    
    public static void main(String[] args)
    {
        Banco01 banco1 = new Banco01();
        banco1.operar();
        banco1.depositosTotales();
    }
	
    public Banco01()
    {
        cliente1 = new Cliente01("Juan");
        cliente2 = new Cliente01("Ana");
        cliente3 = new Cliente01("Pedro"); 
    }

    public void operar()
    {
        cliente1.depositar (100);
        cliente2.depositar (150);
        cliente3.depositar (200);
        cliente3.extraer (150);
    }
	
    public void depositosTotales ()
    {
        int totalBanco = cliente1.devolverDinero () + cliente2.devolverDinero () + cliente3.devolverDinero ();
        System.out.println ("El total de dinero en el banco es: " + totalBanco+"�");
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }
}