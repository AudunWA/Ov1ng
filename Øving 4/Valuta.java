public class Valuta
{
	// Hverdagsnavn
	private String _name;

	// Internasjonal kode
	private String _code;

	// Hvor mange norske kroner det går per enhet av denne valuta
	private double _nokPerEnhet;

	public String getName()
	{
		return _name;
	}

	public String getCode()
	{
		return _code;
	}

	public double getNokPerEnhet()
	{
		return _nokPerEnhet;
	}

	public Valuta(double nokPerEnhet)
	{
		_name = "Ukjent";
		_code = "???";
		_nokPerEnhet = nokPerEnhet;
	}

	public Valuta(String name, String code, double nokPerEnhet)
	{
		_name = name;
		_code = code;
		_nokPerEnhet = nokPerEnhet;
	}

	public double tilNok(double antallValuta)
	{
		return antallValuta * _nokPerEnhet;
	}
	public double tilValuta(double antallNok)
	{
		return antallNok / _nokPerEnhet;
	}
}