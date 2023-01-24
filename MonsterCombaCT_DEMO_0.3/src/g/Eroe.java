package g;

public class Eroe extends Personaggio implements Umano
{	
	public Eroe()
	{
		super();
	}
	
	public void inizializzaEroe()
	{
		//setVita(100);
		setNome("Eroe ");
		System.out.println("Hai selezionato la carta: " + getNome());
		System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
	}
	
	public int attacco()
	{
		System.out.println("『 L'" + getNome() + "attacca con " + getVita() + "♥ di vita!");
		setVita(getVita() - getDanno_vita());
		if(getVita() <= 0)
		{
			System.out.println("Mi dispiace, L' " + getNome() + " non ha più vita. Scegli un'altra carta! ");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			setVita(0);
		}
		else
		{
			System.out.println("»☠ Perde " + getDanno_vita() +"♥ di Vita e rimane a : " + getVita() + "♥ 』");
			System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
		}
		return getVita();
	}
	
	public void ricaricaVita()
	{
		if(getVita() < getVita_max())
		{
			if(getVita() == 0)
			{
				
			}
			else
			{
				System.out.println("✨ La tua abilità speciale ti ha curato e hai ricevuto: " + getCura_vita() + "♥ di vita");
				setVita(getVita() + getCura_vita());
				System.out.println("»✩ Recupera " + getCura_vita() +"♥ di Vita e torna a : " + getVita() + "♥");
				System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			}
		}
		else
		{
			System.out.println("Vita al massimo! L' " + getNome() + " ha " + getVita_max() +"♥ di vita");
			setVita(getVita_max());
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
	}
	
	public void effettoMagico()
	{
		
	}
}
