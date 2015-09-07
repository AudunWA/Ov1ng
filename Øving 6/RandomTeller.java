import java.util.Random;

// Oppgave 7.8.1 inkludert ekstraoppgave
public class RandomTeller
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] antall = new int[10];

		for(int i = 0; i < 10000; i++)
		{
			int tall = random.nextInt(10);
			antall[tall]++;
		}

		for(int i = 0; i < antall.length; i++)
		{
			System.out.println("Forkekomster av " + i + " er " + antall[i] + "(" + genererStjerner(antall[i]) + ")");
		}
	}
	private static String genererStjerner(int forekomster)
	{
		String returnString = "";

		// Kunne kjørt på med Math.round eller lignende, men mer spennende
		// Runder av til nærmeste tier
		int antallGanger = forekomster;
		if(antallGanger % 10 >= 5) // Rund opp
			antallGanger += 10 - antallGanger % 10;
		else // Rund ned
			antallGanger -= antallGanger % 10;

		// Siden én stjerne representerer 10 forekomster, deler vi på 10
		antallGanger /= 10;

		for(int i = 0; i < antallGanger; i++)
		{
			returnString += '*';
		}

		return returnString;
	}
}