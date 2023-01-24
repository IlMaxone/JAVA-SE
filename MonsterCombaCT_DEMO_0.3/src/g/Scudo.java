package g;

public class Scudo extends Personaggio 
{
	private String nome;
	private int durabilità;
	private int danno_aggiuntivo;
	private int vita_recuperata;
	
	public Scudo()
	{
		super();
		this.nome = getNome();
		this.durabilità = getVita();
		this.danno_aggiuntivo = getDanno_aggiuntivo(); //WIP Fa un maggiore o minore danno all'avversario
		this.vita_recuperata = getVita_recuperata(); // Effetto aggiuntivo sul recupero vita
	}
	
	public void utilizzaScudo()
	{
		setNome("Oplon");
		setDurabilità(2);
		//setDanno_aggiuntivo();
		setVita_recuperata(5);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDanno_aggiuntivo() {
		return danno_aggiuntivo;
	}

	public void setDanno_aggiuntivo(int danno_aggiuntivo) {
		this.danno_aggiuntivo = danno_aggiuntivo;
	}

	public int getDurabilità() {
		return durabilità;
	}

	public void setDurabilità(int durabilità) {
		this.durabilità = durabilità;
	}

	public int getVita_recuperata() {
		return vita_recuperata;
	}

	public void setVita_recuperata(int vita_recuperata) {
		this.vita_recuperata = vita_recuperata;
	}
	
	
}
