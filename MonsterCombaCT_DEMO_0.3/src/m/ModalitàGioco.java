package m;

import java.util.Scanner;

public class Modalitร Gioco 
{
	Scanner scan = new Scanner(System.in);
	InizializzaGioco game = new InizializzaGioco();
	
	public int modeSelection()
	{
		System.out.println("๐ Seleziona la modalitร  di gioco: ");
		System.out.println("   โฅใ1: Classic ๐ใ๐     ๐    โฅใ2: Zombie Mode ๐ใ๐ ");
		System.out.println("โฅใ3: Day Time Only ๐ใ๐   ๐");
		System.out.println("  ===============ใ99: Esci dal giocoใ===============");
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
