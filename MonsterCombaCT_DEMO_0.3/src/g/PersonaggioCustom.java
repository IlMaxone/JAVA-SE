package g;

public class PersonaggioCustom extends Personaggio implements Umano, Mostro
{
	public PersonaggioCustom()
	{
		super();
	}
	
	public void inizializzaPersonaggioCustom(int personaggi,String...strings)
	{
		for(String i : strings)
		{
			String nome_personaggio = i;
			setNome(nome_personaggio);
			System.out.println("Nome: " + nome_personaggio + " Accettato!");
		}
	}

	@Override
	public int azzanno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int attacco() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
