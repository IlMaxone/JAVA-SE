package m;

public class AvvioGioco
{
	private final double version = 0.3;
	private GiocatoreUno g1 = new GiocatoreUno();
	
	public void immagineGioco()
	{
		//System.out.println("꧁꧂♚✨⚝🃏✪ † 『 』 ✞ » 𝓐𝓻 ☽☠☣֎●");
		//System.out.println("𝓜onster𝓒omba𝓒𝓣™");
		System.out.println("MonsterCombaCT version: Demo " + getVersion());
		//System.out.println("Wombo 𝓒omba𝓒𝓣!");
		System.out.println("Wombo CombaCT! ");
		System.out.println("==================================================================");
		System.out.println("                                             ,--,  ,.-.");
		System.out.println("                ,                   \\,       '-,-`,'-.' | ._");
		System.out.println("               /|           \\    ,   |\\         }  )/  / `-,',");
		System.out.println("               [ ,          |\\  /|   | |        /  \\|  |/`  ,`");
		System.out.println("               | |       ,.`  `,` `, | |  _,...(   (      .',");
		System.out.println("               \\  \\  __ ,-` `  ,  , `/ |,'      Y     (   /_L\\");
		System.out.println("                \\  \\_\\,``,   ` , ,  /  |         )         _,/");
		System.out.println("                 \\  '  `  ,_ _`_,-,<._.<        /         /");
		System.out.println("                  ', `>.,`  `  `   ,., |_      |         /");
		System.out.println("                   \\/`  `,   `   ,`  | /__,.-`    _,   `\\");
		System.out.println("               -,-..\\  _  \\  `  /  ,  / `._) _,-\\`       \\");
        System.out.println("                \\_,,.) /\\    ` /  / ) (-,, ``    ,        |");
        System.out.println("               ,` )  | \\_\\       '-`  |  `(               \\");
        System.out.println("              /  /```(   , --, ,' \\   |`<`    ,            |");
        System.out.println("             /  /_,--`\\   <\\  V /> ,` )<_/)  | \\      _____)");
        System.out.println("       ,-, ,`   `   (_,\\ \\    |   /) / __/  /   `----`");
        System.out.println("      (-, \\           ) \\ ('_.-._)/ /,`    /");
        System.out.println("      | /  `          `/ \\  V   V, /`      /");
        System.out.println("   ,--\\(        ,     <_/`\\      ||      /");
        System.out.println("  (   ,``-     \\/|         \\-A.A-`|     /");
        System.out.println(" ,>,_ )_,..(    )\\          -,,_-`  _--`");
        System.out.println("(_ \\|`   _,/_  /  \\_            ,--`");
        System.out.println(" \\( `   <.,../`     `-.._   _,-`");
	}
	
	public void avvioGioco()
	{
		System.out.println("");
		System.out.println("       Sto caricando...  10% Avvio delle meccaniche di Gioco");
		System.out.println("==================================================================");
		System.out.println("");
		System.out.println("Sapevi che con la luna piena il Licantropo si trasforma in mostro?");
		System.out.println("           Sapevi che di notte il Vampiro è più forte?");
		System.out.println("==================================================================");
		System.out.println("                  100% Caricamento completato!");
		if(g1.isLuna()==true)
		{
			System.out.println("          Oggi c'è la luna piena, guardatevi le spalle!");
			System.out.println("                      Attenzione, è giorno!");
			System.out.println("==================================================================");
		}
		else
		{
			System.out.println("              Oggi siamo tutti umani, più o meno?!");
			System.out.println("                      Attenzione, è giorno!");
			System.out.println("==================================================================");
		}
	}
	
	public void Credits()
	{
		System.out.println("MonsterCombaCT");
		System.out.println("Credits (MCCT/version: Demo " + getVersion() + "):");
		System.out.println("──────▄▀▄─────▄▀▄\r\n"
				         + "─────▄█░░▀▀▀▀▀░░█▄\r\n"
				         + "─▄▄──█░░░░░░░░░░░█──▄▄\r\n"
				         + "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
		System.out.println("MCCT Programmed By: ");
		System.out.println("== Il_Maxone ==");
		System.out.println("Gioco chiuso con successo!");
	}

	public double getVersion() {
		return version;
	}
}
