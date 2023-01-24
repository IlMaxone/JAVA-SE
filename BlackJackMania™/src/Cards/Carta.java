package Cards;

//Classe che crea lo stampo di una Carta
public class Carta 
{
	private final int id;
	private String nome;
	private int valore;
	
	public Carta(int i, String n, int v)
	{
		this.id = i;
		this.nome = n;
		this.valore = v;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Carta: " + nome + ", Valore: " + valore;
	}
	
	
}
