import java.util.Scanner;
import java.io.IOException;

public class ValutaKlient
{
	public static void main(String[] args)
	{
		Valuta kuna = new Valuta("Kuna", "HRK", 1.23187529);
		Valuta usDollar = new Valuta("Dollar", "USD", 8.29221775);
		Valuta seKroner = new Valuta("Svenske kroner", "SEK", 0.981516647);
		Valuta dkKroner = new Valuta("Danske kroner", "DKK", 1.24729881);

		Valuta[] valutaArray = {kuna, usDollar, seKroner, dkKroner};

		Boolean ferdig = false;
		Scanner scanner = new Scanner(System.in);

		while(!ferdig)
		{
			System.out.println("Velg valuta:");
			for(int i = 0; i < valutaArray.length; i++)
			{
				System.out.println(i + 1 + ": " + valutaArray[i].getName() + " (" + valutaArray[i].getCode() + ")");
			}
			System.out.println(valutaArray.length + 1 + ": avslutt");

			int valg = scanner.nextInt() - 1;
			if(valg == valutaArray.length)
				return;
			else if(valg < valutaArray.length)
			{
				Valuta valgtValuta = valutaArray[valg];
				System.out.println("");
				System.out.println("Velg operasjon:");
				System.out.println("1: fra " + valgtValuta.getCode() + " til NOK");
				System.out.println("2: fra NOK til " + valgtValuta.getCode());
				valg = scanner.nextInt();

				double antall;
				System.out.println("");
				switch(valg)
				{
					case 1:
						System.out.println("Antall " + valgtValuta.getCode() + ":");
						antall = scanner.nextDouble();
						System.out.println(antall + " " + valgtValuta.getCode() + " er " + valgtValuta.tilNok(antall) + " NOK");
						break;
					case 2:
						System.out.println("Antall NOK:");
						antall = scanner.nextDouble();
						System.out.println(antall + " NOK er " + valgtValuta.tilValuta(antall) + " " + valgtValuta.getCode());
						break;
				}
			}
			System.out.println("");
		}
	}
}