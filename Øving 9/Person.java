// Øving 9 oppgave 11.10.1
public class Person
{
	private String fornavn;
	private String etternavn;
	private int fodselsaar;

	public String getFornavn()
	{
		return fornavn;
	}

	public String getEtternavn()
	{
		return etternavn;
	}

	public int getFodselsaar()
	{
		return fodselsaar;
	}
	
	public Person(String fornavn, String etternavn, int fodselsaar)
	{
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fodselsaar = fodselsaar;
	}
}