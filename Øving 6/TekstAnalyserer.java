// Oppgave 7.8.3 klasse (klient i TekstAnalyseClient.java)
public class TekstAnalyserer
{
	private String _tekst;
	private int[] _antallTegn;

	public TekstAnalyserer(String tekst)
	{
		_tekst = tekst;
		_antallTegn = new int[30]; // antall(a-� lowercase + andre tegn)

		analyserTekst();
	}

	// Fyller _anntalTegn ut i fra _tekst
	private void analyserTekst()
	{
		for(int i = 0; i < _tekst.length(); i++)
		{
			char c = Character.toLowerCase(_tekst.charAt(i)); // Gj�r om til liten bokstav, vi bryr oss ikke
			int targetIndex = finnIndeks(c);
			if(targetIndex < 0 || targetIndex > 28)
				targetIndex = 29; // Alle tegn skal i _antallTegn[29]

			_antallTegn[targetIndex]++;
		}
	}

	public int antallForskjelligeBokstaver()
	{
		int antall = 0;
		for(int i = 0; i < 29; i++)
		{
			if(_antallTegn[i] > 0)
				antall++;
		}

		return antall;
	}

	public int antallBokstaver()
	{
		int antall = 0;
		for(int i = 0; i < 29; i++)
		{
			antall += _antallTegn[i];
		}

		return antall;
	}

	public double prosentIkkeBokstaver()
	{
		return (double)_antallTegn[29] / (double)(_antallTegn[29] + antallBokstaver());
	}

	public int antallForekomster(char bokstav)
	{
		bokstav = Character.toLowerCase(bokstav); // Gj�r om til liten bokstav, vi bryr oss ikke
		int targetIndex = (int)(bokstav - 97);
		if(targetIndex < 0 || targetIndex > 28)
			throw new IllegalArgumentException("Kun bokstaver.");

		return _antallTegn[targetIndex];
	}

	public char[] oftestFunnet()
	{
		String ofteste = "";
		int oftesteAntall = -1;
		for(int i = 0; i < 29; i++)
		{
			if(_antallTegn[i] > oftesteAntall) // Bytt ut gamle
			{
				ofteste = Character.toString(finnChar(i));
				oftesteAntall = _antallTegn[i];
			}
			else if(_antallTegn[i] == oftesteAntall) // Pluss p�
			{
				ofteste += Character.toString(finnChar(i));
			}
		}
		return ofteste.toCharArray();
	}

	private int finnIndeks(char c)
	{
		switch(c)
		{
			case '�': // 26
				return 26;

			case '�': // 27
				return 27;

			case '�': // 28
				return 28;

			default:
				return (int)(c - 97);
		}
	}

	private char finnChar(int indeks)
	{
		switch(indeks)
		{
			case 26: // �
				return '�';

			case 27: // �
				return '�';

			case 28: // �
				return '�';

			default:
				return (char)(indeks + 97);
		}
	}
}