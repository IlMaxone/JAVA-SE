package Table;

import java.util.Scanner;

public class Tavolo 
{
	Scanner scan = new Scanner(System.in);
	private int id;
	private String colore;
	private String nome;
	
	public Tavolo()
	{
		this.id = 0;
		this.colore = "";
		this.nome = "";
	}
	
	public Tavolo(int i, String c, String n)
	{
		super();
		this.id = i;
		this.colore = c;
		this.nome = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
