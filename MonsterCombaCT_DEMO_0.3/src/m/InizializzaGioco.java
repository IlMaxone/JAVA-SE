package m;

public class InizializzaGioco 
{
	GiocatoreUno g1 = new GiocatoreUno();
	GiocatoreX gx = new GiocatoreX();
	AvvioGioco a1 = new AvvioGioco();
	
	public void inizializzaGioco()
	{
		a1.immagineGioco();
		a1.avvioGioco();
		g1.condizioneLuna();
		g1.avvioMeccaniche();
		g1.avvioMeccanicheDinamiche();
		gx.condizioneLuna();
		gx.avvioMeccaniche();
		gx.avvioMeccanicheDinamiche();
	}
	
	public int selezioneCarte()
	{
		int c;
		c = g1.selezioneCarte();
		return c;
	}
	
	public void Eroe()
	{
		g1.pescaEroe();
		g1.attaccaEroe();
		gx.selezioneRandom();
		g1.roundSuccessivo();
	}
	
	public void Vampiro()
	{
		g1.pescaVampiro();
		g1.azzannaVampiro();
		gx.selezioneRandom();
		g1.controlloGiorno();
		g1.roundSuccessivo();
	}
	
	public void Licantropo()
	{
		g1.pescaLicantropo();
		g1.abilitàLicantropo();
		gx.selezioneRandom();
		g1.controlloLuna();
		g1.roundSuccessivo();
	}
	
	public void personaggioCustom()
	{
		g1.nuovoPersonaggio();
		g1.roundSuccessivo();
	}
	
	public void Credits()
	{
		a1.Credits();
	}
}
