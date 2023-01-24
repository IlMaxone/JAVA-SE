package Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

//Database di tutte le carte di un Mazzo classico
public class Carte 
{
	Random random = new Random();
	private List<Carta>carta = new LinkedList<Carta>();
	private ListIterator<Carta>cartait;
	private int valore1 = 0;
	private int valore2 = 0;
	
	public void mischiaCarte()
	{
		Collections.shuffle(carta, random);
	}
	
	public void pescaCartaGiocatore()
	{
		try
		{
			cartait = (ListIterator<Carta>) carta.iterator();
			System.out.println(cartait.next());
			for(int i = 0; i < cartait.nextIndex(); i++)
			{
				setValore1(getValore1()+carta.get(i).getValore());
			}
			cartait.remove();
			cartait.nextIndex();
		}
		catch(Exception e)
		{
			System.out.println("Carte finite, Cambio Mazzo! ");
			resetMazzo();
			cartait = (ListIterator<Carta>) carta.iterator();
			System.out.println(cartait.next());
			for(int i = 0; i < cartait.nextIndex(); i++)
			{
				setValore1(getValore1()+carta.get(i).getValore());
			}
			cartait.remove();
			cartait.nextIndex();
		}
		
	}
	
	public void pescaCartaDealer()
	{
		try
		{
			cartait = (ListIterator<Carta>) carta.iterator();
			System.out.println(cartait.next());
			for(int i = 0; i < cartait.nextIndex(); i++)
			{
				setValore2(getValore2()+carta.get(i).getValore());
			}
			cartait.remove();
			cartait.nextIndex();
		}
		catch(Exception e)
		{
			System.out.println("Carte finite, Cambio Mazzo! ");
			resetMazzo();
			cartait = (ListIterator<Carta>) carta.iterator();
			System.out.println(cartait.next());
			for(int i = 0; i < cartait.nextIndex(); i++)
			{
				setValore2(getValore2()+carta.get(i).getValore());
			}
			cartait.remove();
			cartait.nextIndex();
		}
	}
	
	public void manoSingola()
	{
		System.out.print("La tua mano = ");
		System.out.println("Prima Carta: ");
		pescaCartaGiocatore();
		System.out.println("---------------------------------");
		System.out.print("Le carte del Dealer = ");
		System.out.println("Prima Carta: ");
		pescaCartaDealer();
		System.out.println("---------------------------------");
		System.out.print("La tua mano = ");
		System.out.println("Seconda Carta: ");
		pescaCartaGiocatore();
		System.out.println("---------------------------------");
		System.out.print("Le carte del Dealer = ");
		System.out.println("Seconda Carta: ");
		pescaCartaDealer();
		System.out.println("=================================");
		System.out.println("La tua mano: " + getValore1() + " Dealer: " + getValore2());
	}
	
	public void resetMazzo()
	{
		databaseCarte();
		mischiaCarte();
	}
	
	public void databaseCarte()
	{
		carta.add(new Carta(0,"Asso di Picche",1));
		carta.add(new Carta(1,"Due di Picche",2));
		carta.add(new Carta(2,"Tre di Picche",3));
		carta.add(new Carta(3,"Quattro di Picche",4));
		carta.add(new Carta(4,"Cinque di Picche",5));
		carta.add(new Carta(5,"Sei di Picche",6));
		carta.add(new Carta(6,"Sette di Picche",7));
		carta.add(new Carta(7,"Otto di Picche",8));
		carta.add(new Carta(8,"Nove di Picche",9));
		carta.add(new Carta(9,"Dieci di Picche",10));
		carta.add(new Carta(10,"Jack di Picche",10));
		carta.add(new Carta(11,"Regina di Picche",10));
		carta.add(new Carta(12,"Re di Picche",10));
		carta.add(new Carta(13,"Asso di Cuori",1));
		carta.add(new Carta(14,"Due di Cuori",2));
		carta.add(new Carta(15,"Tre di Cuori",3));
		carta.add(new Carta(16,"Quattro di Cuori",4));
		carta.add(new Carta(17,"Cinque di Cuori",5));
		carta.add(new Carta(18,"Sei di Cuori",6));
		carta.add(new Carta(19,"Sette di Cuori",7));
		carta.add(new Carta(20,"Otto di Cuori",8));
		carta.add(new Carta(21,"Nove di Cuori",9));
		carta.add(new Carta(22,"Dieci di Cuori",10));
		carta.add(new Carta(23,"Jack di Cuori",10));
		carta.add(new Carta(24,"Regina di Cuori",10));
		carta.add(new Carta(25,"Re di Cuori",10));
		carta.add(new Carta(26,"Asso di Fiori",1));
		carta.add(new Carta(27,"Due di Fiori",2));
		carta.add(new Carta(28,"Tre di Fiori",3));
		carta.add(new Carta(29,"Quattro di Fiori",4));
		carta.add(new Carta(30,"Cinque di Fiori",5));
		carta.add(new Carta(31,"Sei di Fiori",6));
		carta.add(new Carta(32,"Sette di Fiori",7));
		carta.add(new Carta(33,"Otto di Fiori",8));
		carta.add(new Carta(34,"Nove di Fiori",9));
		carta.add(new Carta(35,"Dieci di Fiori",10));
		carta.add(new Carta(36,"Jack di Fiori",10));
		carta.add(new Carta(37,"Regina di Fiori",10));
		carta.add(new Carta(38,"Re di Fiori",10));
		carta.add(new Carta(39,"Asso di Quadri",1));
		carta.add(new Carta(40,"Due di Quadri",2));
		carta.add(new Carta(41,"Tre di Quadri",3));
		carta.add(new Carta(42,"Quattro di Quadri",4));
		carta.add(new Carta(43,"Cinque di Quadri",5));
		carta.add(new Carta(44,"Sei di Quadri",6));
		carta.add(new Carta(45,"Sette di Quadri",7));
		carta.add(new Carta(46,"Otto di Quadri",8));
		carta.add(new Carta(47,"Nove di Quadri",9));
		carta.add(new Carta(48,"Dieci di Quadri",10));
		carta.add(new Carta(49,"Jack di Quadri",10));
		carta.add(new Carta(50,"Regina di Quadri",10));
		carta.add(new Carta(51,"Re di Quadri",10));
	}

	public int getValore1() {
		return valore1;
	}

	public void setValore1(int valore1) {
		this.valore1 = valore1;
	}

	public int getValore2() {
		return valore2;
	}

	public void setValore2(int valore2) {
		this.valore2 = valore2;
	}

	@Override
	public String toString() {
		return "Carta: " + carta;
	}
}
