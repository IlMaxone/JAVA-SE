package BlackJackGame;

import java.util.Scanner;

import Cards.Carte;

public class Regole 
{
	private Scanner scan = new Scanner(System.in);
	private Carte c1 = new Carte();
	private int x;
	
	public void resocontoMani(boolean c2)
	{
		if(c2 == false)
		{
			c1.manoSingola();
			menuPartita();
			c1.setValore1(0);
			c1.setValore2(0);
		}
		else
		{
			
		}
	}
	
	public void menuPartita()
	{		
			int i = 0;
			while(i < 1) {
				System.out.println("Fai una scelta: ");
				System.out.println("1: Chiedi Carta");
				System.out.println("2: Stai ");
				setX(scan.nextInt());
				switch(getX())
				{
				case 1:
					c1.pescaCartaGiocatore();
					controlloBustGiocatore();
					i = 1;
					break;
				case 2:
					controlloBustDealer();
					i = 1;
					break;
				default:
					System.out.println("Scelta errata, riprova! ");
					i = 0;
					break;
			}
				
		/*
			
			while(true) {
				System.out.println("Fai una scelta: ");
				System.out.println("1: Chiedi Carta");
				System.out.println("2: Stai ");
				setX(scan.nextInt());
				switch(getX())
				{
				case 1:
					c1.pescaCartaGiocatore();
					controlloBustGiocatore();
					//i = 1;
					break;
				case 2:
					controlloBustDealer();
					//i = 1;
					break;
				default:
					System.out.println("Scelta errata, riprova! ");
					//break;
			}
			break;*/
		}
		
	}
	
	public void controlloBustGiocatore()
	{
		System.out.println("La tua mano: " + c1.getValore1() + " Dealer: " + c1.getValore2());
		if(c1.getValore1()>21)
		{
			System.out.println("Mi dispiace, la tua mano ha sballato");
		}
		else
		{
			menuPartita();
		}
	}
	
	public void controlloBustDealer()
	{
		System.out.println("La tua mano: " + c1.getValore1() + " Dealer: " + c1.getValore2());
		if(c1.getValore2()>21)
		{
			System.out.println("Il dealer sballa");
		}
		else
		{
			if(c1.getValore2()>=17)
			{
				controlloVittria();
			}
			else
			{
				c1.pescaCartaDealer();
				System.out.println("La tua mano: " + c1.getValore1() + " Dealer: " + c1.getValore2());
				if(c1.getValore2()<17)
				{
					c1.pescaCartaDealer();
					System.out.println("La tua mano: " + c1.getValore1() + " Dealer: " + c1.getValore2());
					controlloVittria();
				}
				else
				{
					controlloVittria();
				}
			}
		}
	}
	
	public void controlloVittria()
	{
		if(c1.getValore1()>c1.getValore2())
		{
			System.out.println("Complimenti, hai vinto la mano! ");
		}
		else
		{
			if(c1.getValore1()==c1.getValore2())
			{
				System.out.println("Pareggio! ");
			}
			else
			{
				if(c1.getValore2()>21)
				{
					System.out.println("Il banco sballa, Hai vinto! ");
				}
				else
				{
					System.out.println("Il banco vince! ");
				}
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
