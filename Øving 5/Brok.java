public class Brok
{
	private int _teller;
	private int _nevner;

	public int getTeller()
	{
		return _teller;
	}

	public int getNevner()
	{
		return _nevner;
	}

	public Brok(int teller, int nevner)
	{
		if(nevner == 0)
			throw new IllegalArgumentException("Kan ikke dele med 0.");
		_teller = teller;
		_nevner = nevner;
	}

	public Brok(int teller)
	{
		_teller = teller;
		_nevner = 1;
	}

	// Testklient
	public static void main(String[] args)
	{
		Brok b1 = new Brok(5, 10);
		Brok b2 = new Brok(1,5);
		b1.multipliserMedBrok(b2);
		System.out.println(b1.getTeller() + "/" + b1.getNevner());
		b1.forkort();
		System.out.println(b1.getTeller() + "/" + b1.getNevner());
	}

	public void summerMedBrok(Brok brok)
	{
		if(_nevner != brok.getNevner()) // Gang teller med motsatte nevner
		{
			_teller *= brok.getNevner();
			int annenTeller = brok.getTeller() * _nevner;

			// Sett ny nevner
			_nevner *= brok.getNevner();
			// Så plusser vi sammen tellere som nå har felles nevner
			_teller += annenTeller;
		}
		forkort();
	}

	public void substraherMedBrok(Brok brok)
	{
		if(_nevner != brok.getNevner()) // Gang teller med motsatte nevner
		{
			_teller *= brok.getNevner();
			int annenTeller = brok.getTeller() * _nevner;

			// Sett ny nevner
			_nevner *= brok.getNevner();
			// Så substraherer vi sammen tellere som nå har felles nevner
			_teller -= annenTeller;
		}
		forkort();
	}

	public void multipliserMedBrok(Brok brok)
	{
		_teller *= brok.getTeller();
		_nevner *= brok.getNevner();

		forkort();
	}

	public void dividerMedBrok(Brok brok)
	{
		_teller *= brok.getNevner();
		_nevner *= brok.getTeller();

		forkort();
	}

	public void forkort()
	{
		int fellesDeler = GCD(_teller, _nevner);
		_teller /= fellesDeler;
		_nevner /= fellesDeler;
	}

	// Hentet fra http://stackoverflow.com/questions/6618994/simplifying-fractions-in-java
	// Finner største tall a og b begge kan deles på (implementerer Euklids algoritme)
	private int GCD(int a, int b)
	{
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}
}