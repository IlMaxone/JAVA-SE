package Table;

public class Tavoli extends Tavolo 
{
	public Tavoli()
	{
		super();
	}
	
	public Tavoli(int i, String c, String n)
	{
		super();
		this.setId(i);
		this.setColore(c);
		this.setNome(n);
	}
	
	public void benvenutoItalia21()
	{
		System.out.println("=================================");
		System.out.println("Benvenuto su Italia 21 BlackJack! ");
		System.out.println("---------------------------------");
		this.setId(0);
		this.setColore("#3EA055");
		this.setNome("Italia 21 BJ");
	}
	
	public void benvenutoBlackJackMastersIta()
	{
		System.out.println("=================================");
		System.out.println("Benvenuto su BlackJack Masters Ita! ");
		System.out.println("---------------------------------");
		this.setId(1);
		this.setColore("#3EA055");
		this.setNome("BJ Masters Ita");
	}
}
