package m;

import java.util.Scanner;

public class ModalitàGioco 
{
	Scanner scan = new Scanner(System.in);
	InizializzaGioco game = new InizializzaGioco();
	
	public int modeSelection()
	{
		System.out.println("🃏 Seleziona la modalità di gioco: ");
		System.out.println("   ➥『1: Classic 🃏』𓃠    𝓜    ➥『2: Zombie Mode 🃏』𓃠");
		System.out.println("➥『3: Day Time Only 🃏』𓃠  𝓒");
		System.out.println("  ===============『99: Esci dal gioco』===============");
		int m;
		m = scan.nextInt();
		return m;
	}
	
	public void classicGame()
	{
		for(int i = 0; i < 1;)
		{
			switch(game.selezioneCarte())
			{
			case 1:
				game.Eroe();
				break;
			case 2:
				game.Vampiro();
				break;
			case 3:
				game.Licantropo();
				break;
			case 4:
				game.personaggioCustom();
				break;
			case 99:
				i = 1;
				break;
			default:
				System.out.println("Scelta errata, riprova!");
				break;
			}
		}
	}
	
	public void zombieMode()
	{
		for(int i = 0; i < 1;)
		{
			switch(game.selezioneCarte())
			{
			case 2:
				game.Vampiro();
				break;
			case 3:
				game.Licantropo();
				break;
			case 99:
				i = 1;
				break;
			default:
				System.out.println("Scelta errata, riprova!");
				break;
			}
		}
	}
	
	public void dayTime()
	{
		for(int i = 0; i < 1;)
		{
			switch(game.selezioneCarte())
			{
			case 1:
				game.Eroe();
				break;
			case 2:
				game.Vampiro();
				break;
			case 3:
				game.Licantropo();
			case 99:
				i = 1;
				break;
			default:
				System.out.println("Scelta errata, riprova!");
				break;
			}
		}
	}
	
	public void inizializzaGioco()
	{
		game.inizializzaGioco();
	}
	
	public void Credits()
	{
		game.Credits();
	}
}
