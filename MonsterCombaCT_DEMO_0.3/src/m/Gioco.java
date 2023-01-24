package m;

public class Gioco {

	public static void main(String[] args) 
	{
		ModalitàGioco m1 = new ModalitàGioco();
		
		m1.inizializzaGioco();
		
		for(int i = 0; i < 1;)
		{
			switch(m1.modeSelection())
			{
			case 1:
				m1.classicGame();
				break;
			case 2:
				m1.zombieMode();
				break;
			case 3:
				m1.dayTime();
				break;
			case 99:
				i = 1;
				m1.Credits();
				break;
			default:
				System.out.println("Scelta errata, riprova!");
				break;
			}
		}
	}

}
