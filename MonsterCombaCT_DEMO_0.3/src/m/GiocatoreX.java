package m;

import java.util.Random;

import g.Eroe;
import g.Licantropo;
import g.Rounds;
import g.Vampiro;

public class GiocatoreX 
{
	private Random rand = new Random();
	private Rounds r1 = new Rounds();
	private GiocatoreUno g1 = new GiocatoreUno();
	private final int vita_plus_vampiro = 5;
	
	private Eroe ex = new Eroe();
	private Vampiro vx = new Vampiro();
	private Licantropo lx = new Licantropo();
	
	public boolean condizioneLuna()
	{
		return g1.condizioneLuna();
	}
	
	public void avvioMeccaniche()
	{
		ex.setVita(40);
		ex.setDanno_vita(12);
		ex.setVita_max(80);
		vx.setDanno_vita(8);
		vx.setVita_max(60);
	}
	
	public void avvioMeccanicheDinamiche()
	{
		if(r1.isGiorno() == true)
		{
			vx.setVita(30);
		}
		else
		{
			vx.setVita(60);
		}
		
		if(lx.isLuna()==true)
		{
			lx.setVita(60);
			lx.setDanno_vita(12);
			lx.setVita_max(120);
		}
		else
		{
			lx.setVita(40);
			lx.setDanno_vita(8);
			lx.setVita_max(80);
		}
	}
	
	public void controlloGiorno()
	{
		if(r1.isGiorno() == true)
		{
			System.out.println("Attenzione è appena diventato giorno! ");
		}
		else
		{
			vx.setVita(vx.getVita()+vita_plus_vampiro);
			if(vx.getVita() >= vx.getVita_max())
			{
				System.out.println("Vita al massimo! Il " + vx.getNome() +" ha " + vx.getVita_max() + " di vita");
				vx.setVita(vx.getVita_max());
				System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			}
			else
			{
				System.out.println("Che fortuna è appena diventata notte! ");
				System.out.println("Il Vampiro grazie alla sua abilità speciale guadagna: " + vita_plus_vampiro + "♥");
				System.out.println("Il Vampiro ora ha: " + vx.getVita() + "♥ di vita!");
				System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			}
		}
	}
	
	public void controlloLuna()
	{
		g1.controlloLuna();
	}
	
	public void selezioneRandom()
	{
		int random = rand.nextInt(3);
		switch(random)
		{
		case 0:
			pescaEroe();
			attaccaEroe();
			break;
		case 1:
			pescaVampiro();
			azzannaVampiro();
			controlloGiorno();
			break;
		case 2:
			pescaLicantropo();
			abilitàLicantropo();
			controlloLuna();
			break;
		}
	}
	
	public void pescaEroe()
	{
		ex.inizializzaEroe();
	}
	
	public void attaccaEroe()
	{
		ex.attacco();
		if(ex.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		ex.ricaricaVita();
	}
	
	public void pescaVampiro()
	{
		vx.inizializzaVampiro();
	}
	
	public void azzannaVampiro()
	{
		vx.azzanno();
		if(vx.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		vx.ricaricaVita();
	}
	
	public void pescaLicantropo()
	{
		lx.inizializzaLicantropo();
	}
	
	public void abilitàLicantropo()
	{
		lx.abilitàLicantropo(condizioneLuna());
		if(lx.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		lx.ricaricaVita();
	}
}
