package g;

public class Licantropo extends Personaggio implements Umano, Mostro
{
	private boolean luna;
	
	public Licantropo()
	{
		super();
	}
	
	public void inizializzaLicantropo()
	{
		setNome("Licantropo ");
		System.out.println("Hai selezionato la carta: " + getNome());
		System.out.println("✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮✮");
	}
	
	public boolean abilitàLicantropo(boolean l)
	{
		this.luna = l;
		if(luna==true)
		{
			System.out.println(getNome() + "attacca come mostro con forza: " + getVita());
			setVita(getVita() - getDanno_vita());
		    System.out.println("Forza rimanente dopo l'attacco come mostro: " + getVita());
		    System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
		else
		{
			System.out.println(getNome() + "attacca come umano con forza: " + getVita());
			setVita(getVita() - getDanno_vita());
		    System.out.println("Forza rimanente dopo l'attacco come umano: " + getVita());
		    System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
		return luna;
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
			System.out.println("Vita al massimo! L' " + getNome() + " ha " + getVita_max() + " di vita");
			setVita(getVita_max());
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
	}

	@Override
	public int azzanno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attacco() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isLuna() {
		return luna;
	}

	public void setLuna(boolean luna) {
		this.luna = luna;
	}
}
