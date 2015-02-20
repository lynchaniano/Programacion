package ColaboracionConCLASES;
//Plantear un programa que permita jugar a los dados. Las reglas de juego son: 
//se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
public class JuegoDado02
{
	private Dado02 dado1,dado2,dado3;
	
    public static void main(String[] args)
    {
    	System.out.println("  -- Juego de Dados --");
    	System.out.println("  Para ganar sacar 3 numeros iguales");
        JuegoDado02 game = new JuegoDado02();
        game.jugar();
    }
    
    public JuegoDado02()
    {
        dado1 = new Dado02();
        dado2 = new Dado02();
        dado3 = new Dado02();        	
    }
    
    public void jugar()
    {
        dado1.tirarDado();
        dado1.imprimir();
        dado2.tirarDado();
        dado2.imprimir();
        dado3.tirarDado();
        dado3.imprimir();
        
        if (dado1.retornarValor()==dado2.retornarValor() && dado1.retornarValor()==dado3.retornarValor())
        {
            System.out.println("Ganó");
        }
        else
        {
            System.out.println("Perdió");
        }        	
    }
}
