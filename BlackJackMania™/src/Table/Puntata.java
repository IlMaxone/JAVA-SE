package Table;

public class Puntata 
{
	private double puntata;
	private boolean c;
	
	public Puntata()
	{
		setPuntata(0);
	}
	
	public void piazzaPuntata(double p)
	{
		setPuntata(p);
	}
	
	public boolean controlloPuntata(boolean c1)
	{
		this.setC(c1);
		if(getPuntata() <= 0)
		{
			System.out.println("Puntata Errata, Perfavore Riprovare! Puntata troppo bassa! ");
			setC(true);
		}
		else
		{
			if(getPuntata() < 5001)
			{
				System.out.println("Puntata piazzata! Hai puntato: " + getPuntata() + "✪");
				System.out.println("---------------------------------");
			}
			else
			{
				System.out.println("Puntata Errata, Perfavore Riprovare! Limite di puntata 5000✪! ");
				setC(true);
			}
		}
		return isC();
	}
	
	

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public double getPuntata() {
		return puntata;
	}

	public void setPuntata(double puntata) {
		this.puntata = puntata;
	}
	
	
}
