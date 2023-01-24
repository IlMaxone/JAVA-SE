package Table;

import java.util.InputMismatchException;
import java.util.Scanner;

//Classe Principale di tutto il gioco
public class GameStart {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = 0;
		
		MainTable tavolo = new MainTable();
		
		for(int i = 0; i < 1;)
		{
			System.out.println("BlackJackMania Version: Demo " + tavolo.getVersion());
			System.out.println("               (( _______");
			System.out.println("     _______     /\\O    O\\");
			System.out.println("    /O     /\\   /  \\      \\");
			System.out.println("   /   O  /O \\ / O  \\O____O\\ ))");
			System.out.println("((/_____O/    \\     /O     /");
			System.out.println("  \\O    O\\    / \\  /   O  /");
			System.out.println("   \\O    O\\ O/   \\/_____O/");
			System.out.println("    \\O____O\\/ ))          ))");
			System.out.println("  ((");
			System.out.println("Benvenuto nella sezione BlackJack");
			System.out.println("=================================");
			System.out.println("      Seleziona un tavolo: ");
			System.out.println("Scelta 1: Italia 21");
			System.out.println("Scelta 2: BlackJack Master Italia");
			System.out.println("99 Esci dalla pagina BlackJack");
			System.out.println("=================================");
			System.out.println("ATTENZIONE DEMO SPERIMENTALE! FUNZIONALITA' LIMITATE!");
			try
			{
				x = scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Valore non valido, sei entrato nel nostro tavolo principale! ");
				System.out.println("============================================================");
				x = 1;
			}
			switch(x)
			{
			case 1:
				tavolo.ingressoTavoloIta21();
				tavolo.giocaMani();
				break;
			case 2:
				tavolo.ingressoTavoloBJMIta();
				tavolo.giocaMani();
				break;
			case 99:
				tavolo.Credits();
				i = 1;
				break;
			default:
				System.out.println("Tavolo non trovato, riprova! ");
				break;
			}
		}
		
		/*System.out.println("Perfavore fai una scelta");
		System.out.println("Scelta 1 inizializza tavolo");
		System.out.println("Scelta 2 inizializza mazzo");
		System.out.println("Scelta 3 pesca le carte del mazzo");
		x = scan.nextInt();
		
		switch(x)
		{
		case 1:
			italia21.italiaVentuno(1,"#3EA055","Italia 21");
			break;
		case 2:
			mazzo1.inizilizzaMazzo();
			break;
		case 3:
			mazzo1.pescaCarte();
			break;
		}*/

	}
}
