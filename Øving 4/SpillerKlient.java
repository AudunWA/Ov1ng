import java.util.Random;

public class SpillerKlient
{
	public static void main(String[] args)
	{
		Random terning = new Random();
		Spiller spillerA = new Spiller(terning, true);
		Spiller spillerB = new Spiller(terning, true);

		int runde = 1;
		while(!spillerA.erFerdig() && !spillerB.erFerdig())
		{
			spillerA.kastTerningen();
			spillerB.kastTerningen();
			System.out.println("Runde " + runde++ + ": " + spillerA.getSumPoeng() + " vs " + spillerB.getSumPoeng());
		}

		if(spillerA.erFerdig()) // Spiller A vant!
		{
			System.out.println("Spiller 1 vant etter " + runde + " runder!");
		}
		else
		{
			System.out.println("Spiller 2 vant etter " + runde + " runder!");
		}
	}
}