package Table;

import java.util.InputMismatchException;
import java.util.Scanner;

import BlackJackGame.Regole;
import Cards.TestMazzo;

public class MainTable extends Tavolo
{
	Scanner scan = new Scanner(System.in);
	
	Tavoli t1 = new Tavoli();
	TestMazzo mazzo1 = new TestMazzo();
	Puntata p1 = new Puntata();
	Regole r1 = new Regole();
	
	private final double version = 0.3;
	
	public MainTable()
	{
		super();
	}
	
	public MainTable(int i, String c, String n)
	{
		super();
		this.setId(i);
		this.setColore(c);
		this.setNome(n);
	}
	
	public void ingressoTavoloIta21()
	{
		t1.benvenutoItalia21();
		mazzo1.ingressoTavolo();
	}
	
	public void ingressoTavoloBJMIta()
	{
		t1.benvenutoBlackJackMastersIta();
		mazzo1.ingressoTavolo();
	}
	
	public void giocaMani()
	{
		double p = 0;
		
		for(int i = 0; i < 1;)
		{
			System.out.println(t1.getNome());
			System.out.println("---------------------------------");
			System.out.println("Piazza la tua puntata: ");
			System.out.println("Momentaneamente puoi giocare una sola mano! ");
			System.out.println(" 1✪ 2✪ 5✪ 10✪ 20✪ 50✪ 100✪ 200✪ 500✪ 1000✪ ");
			p1.setPuntata(scan.nextDouble());
			p1.piazzaPuntata(p1.getPuntata());
			boolean c1 = false;
			p1.controlloPuntata(c1);
			//mazzo1.pescaCarte();
			r1.resocontoMani(p1.isC());
		}
	}
	
	public void Credits()
	{
		System.out.println("BlackJackMania");
		System.out.println("Credits (BJMania/version: Demo " + getVersion() + "):");
		System.out.println("──────▄▀▄─────▄▀▄\r\n"
				         + "─────▄█░░▀▀▀▀▀░░█▄\r\n"
				         + "─▄▄──█░░░░░░░░░░░█──▄▄\r\n"
				         + "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
		System.out.println("BJMania Programmed By: ");
		System.out.println("== Il_Maxone ==");
		System.out.println("Gioco chiuso con successo!");
	}

	public double getVersion() {
		return version;
	}
}
