package g;

public class Rounds 
{
	private int n_rounds;
	private boolean giorno;
	
	public void rounds()
	{
		setN_rounds(1);
		System.out.println("➤ Inizio del Round numero: " + getN_rounds()+" ꕥ");
	}
	
	public void incrementaRound()
	{
		setN_rounds(getN_rounds()+1);
		System.out.println("➤ Inizio del Round numero: " + getN_rounds()+" ꕥ");
	}
	
	public void decrementaRound()
	{
		setN_rounds(getN_rounds()-1);
	}
	
	public boolean Giorno()
	{
		if(isGiorno() == true)
		{
			setGiorno(false);
		}
		else
		{
			setGiorno(true);
		}
		return giorno;
	}

	public int getN_rounds() {
		return n_rounds;
	}

	public void setN_rounds(int n_rounds) {
		this.n_rounds = n_rounds;
	}

	public boolean isGiorno() {
		return giorno;
	}

	public void setGiorno(boolean giorno) {
		this.giorno = giorno;
	}
	
}
