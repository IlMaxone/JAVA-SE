package m;

import java.util.Random;
import java.util.Scanner;

import g.Eroe;
import g.Licantropo;
import g.PersonaggioCustom;
import g.Rounds;
import g.Vampiro;

public class GiocatoreUno 
{
	private Random rand = new Random();
	private Rounds r1 = new Rounds();
	private Scanner scan = new Scanner(System.in);
	private final int vita_plus_vampiro = 5;
	private boolean luna;
	
	private Eroe e1 = new Eroe();
	private Vampiro v1 = new Vampiro();
	private Licantropo l1 = new Licantropo();
	
	public boolean condizioneLuna()
	{
		setLuna(rand.nextBoolean());
		return isLuna();
	}
	
	public void avvioMeccaniche()
	{
		r1.rounds();
		r1.setGiorno(true);
		e1.setVita(40);
		e1.setDanno_vita(12);
		e1.setVita_max(80);
		v1.setDanno_vita(8);
		v1.setVita_max(60);
	}
	
	public void avvioMeccanicheDinamiche()
	{
		if(r1.isGiorno() == true)
		{
			v1.setVita(30);
		}
		else
		{
			v1.setVita(60);
		}
		
		if(l1.isLuna()==true)
		{
			l1.setVita(60);
			l1.setDanno_vita(12);
			l1.setVita_max(120);
			System.out.println("● A quanto pare la luna è appena diventata piena!");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
		else
		{
			l1.setVita(40);
			l1.setDanno_vita(8);
			l1.setVita_max(80);
			System.out.println("☽ Mi dispiace informarti che oggi non ci sarà la luna piena!");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
	}
	
	public void roundSuccessivo()
	{
		r1.incrementaRound();
	}
	
	public void controlloGiorno()
	{
		r1.Giorno();
		if(r1.isGiorno() == true)
		{
			System.out.println("Attenzione è appena diventato giorno! ");
		}
		else
		{
			v1.setVita(v1.getVita()+vita_plus_vampiro);
			if(v1.getVita() >= v1.getVita_max())
			{
				System.out.println("Vita al massimo! Il " + v1.getNome() +" ha " + v1.getVita_max() + " di vita");
				v1.setVita(v1.getVita_max());
				System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			}
			else
			{
				System.out.println("Che fortuna è appena diventata notte! ");
				System.out.println("Il Vampiro grazie alla sua abilità speciale guadagna: " + vita_plus_vampiro + "♥");
				System.out.println("Il Vampiro ora ha: " + v1.getVita() + "♥ di vita!");
				System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
			}
		}
	}
	
	public void controlloLuna()
	{	
		if(l1.isLuna() == condizioneLuna())
		{
			System.out.println("A quanto pare la luna è appena diventata piena! Ora sei un mostro! ");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
		else
		{
			System.out.println("Mi dispiace informarti che oggi non ci sarà la luna piena! Ora sei umano! ");
			System.out.println("✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰✰");
		}
	}
	
	public void nuovoPersonaggio()
	{
		PersonaggioCustom pers1 = new PersonaggioCustom();
		System.out.println("Quanti personaggi vuoi creare? ");
		int personaggi = scan.nextInt();
		System.out.println("Scegli i loro nomi: ");
		for(int i = 0; i < personaggi; i++)
		{
			String nome_personaggio = scan.next();
			System.out.println(nome_personaggio);
			pers1.inizializzaPersonaggioCustom(personaggi,nome_personaggio);
		}
	}
	
	public int selezioneCarte()
	{
		System.out.println("🃏 Seleziona la carta che vuoi usare in questo round↴");
		System.out.println("   ➥『1: Eroe 🃏 " + e1.getVita() + "♥ 』𓃠    𝓜    ➥『2: Vampiro 🃏 " + v1.getVita() + "♥ 』𓃠");
		System.out.println("➥『3: Licantropo 🃏 " + l1.getVita() + "♥ 』𓃠  𝓒  ➥『4: Crea la tua carta!(WIP)』𓃠");
		System.out.println("  ===============『99: Torna Indietro』===============");
		int c;
		c = scan.nextInt();
		return c;
	}
	
	public void pescaEroe()
	{
		e1.inizializzaEroe();
	}
	
	public void attaccaEroe()
	{
		e1.attacco();
		if(e1.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		e1.ricaricaVita();
	}
	
	public void pescaVampiro()
	{
		v1.inizializzaVampiro();
	}
	
	public void azzannaVampiro()
	{
		v1.azzanno();
		if(v1.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		v1.ricaricaVita();
	}
	
	public void pescaLicantropo()
	{
		l1.inizializzaLicantropo();
	}
	
	public void abilitàLicantropo()
	{
		l1.abilitàLicantropo(condizioneLuna());
		if(l1.getVita() <= 0)
		{
			r1.decrementaRound();
		}
		l1.ricaricaVita();
	}

	public boolean isLuna() {
		return luna;
	}

	public void setLuna(boolean luna) {
		this.luna = luna;
	}
}
