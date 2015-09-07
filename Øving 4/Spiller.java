import java.util.Random;

public class Spiller
{
	// Antall poeng oppnådd
	private int _sumPoeng;

	// Bestemmer om vi bruker reglene for vanskelig modus
	private Boolean _vanskeligModus;

	// Random-instansen vi bruker for å kaste terning
	private Random _terning;

	public int getSumPoeng()
	{
		return _sumPoeng;
	}

	public Spiller(Random terning, Boolean vanskeligModus)
	{
		_terning = terning;
		_vanskeligModus = vanskeligModus;
	}

	public Boolean erFerdig()
	{
		if(_vanskeligModus)
			return _sumPoeng == 100;
		else
			return _sumPoeng > 100;
	}

	public void kastTerningen()
	{
		int kast = _terning.nextInt(6) + 1;
		if(kast == 1)
		{
			_sumPoeng = 0;
		}
		else if(_vanskeligModus && _sumPoeng > 100)
		{
			_sumPoeng -= kast;
		}
		else
		{
			_sumPoeng += kast;
		}
	}
}