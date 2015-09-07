import java.util.Random;

public class MinRandom
{
	private Random _rnd;

	// Testklient
	public static void main(String[] args)
	{
		MinRandom rnd = new MinRandom();

		for(int i = 0; i < 1000; i++)
			System.out.println(rnd.nesteHeltall(5, 150));

		for(int i = 0; i < 1000; i++)
			System.out.println(rnd.nesteDesimaltall(0, 7));
	}

	public MinRandom()
	{
		_rnd = new Random();
	}

	public int nesteHeltall(int nedre, int ovre) // intervallet [nedre, ovre]
	{
		// Legger til 1 for å få med øvre verdi
		return _rnd.nextInt(ovre - nedre + 1) + nedre;
	}

	public double nesteDesimaltall(double nedre, double ovre) // intervallet <nedre, ovre>
	{
		return (ovre - nedre) * _rnd.nextDouble() + nedre;
	}
}