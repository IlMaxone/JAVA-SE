package Cards;

import java.util.Random;

import BlackJackGame.Regole;

//Classe che richiama le carte dal database Carte e crea un Mazzo
public class Mazzo 
{
	Random random = new Random();
	public int id;
	public int num_carte;
	public int dieci;
	private Carte carte = new Carte();
	private Regole rg = new Regole();
	
	public Mazzo()
	{
		this.id = 0;
		this.num_carte = 0;
	}
	
	public Mazzo(int i)
	{
		this.id = i;
		this.num_carte = 52;
	}
	
	public void daiCarte()
	{
		//rg.resocontoMani();
	}
	
	public void ingressoTavolo()
	{
		carte.databaseCarte();
		carte.mischiaCarte();
	}
}
