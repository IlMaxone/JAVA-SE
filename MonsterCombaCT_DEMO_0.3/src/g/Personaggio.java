package g;

public abstract class Personaggio 
{
	private String nome;
	private int vita;
	private int cura_vita;
	private int danno_vita;
	private int vita_max;
	
	public Personaggio()
	{
		super();
		nome = "";
		vita = 0;
		cura_vita = 10;
		danno_vita = 0;
		vita_max = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String personaggio) {
		this.nome = personaggio;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int forza_fisica) {
		this.vita = forza_fisica;
	}

	public int getCura_vita() {
		return cura_vita;
	}

	public void setCura_vita(int cura_vita) {
		this.cura_vita = cura_vita;
	}

	public int getDanno_vita() {
		return danno_vita;
	}

	public void setDanno_vita(int danno_vita) {
		this.danno_vita = danno_vita;
	}

	public int getVita_max() {
		return vita_max;
	}

	public void setVita_max(int vita_max) {
		this.vita_max = vita_max;
	}
}
