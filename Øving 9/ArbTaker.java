// Øving 9 oppgave 11.10.1
import java.util.*;

public class ArbTaker
{
	private Person personalia;
	private int arbtakernr;
	private int ansettelsesaar;
	private double maanedslonn;
	private double skatteprosent;

	public Person getPersonalia()
	{
		return personalia;
	}

	public int getArbtakernr()
	{
		return arbtakernr;
	}

	public int getAnsettelsesaar()
	{
		return ansettelsesaar;
	}
	
	public double getMaanedslonn()
	{
		return maanedslonn;
	}
	
	public void setMaanedslonn(double nyVerdi)
	{
		maanedslonn = nyVerdi;
	}
	
	public double getSkatteprosent()
	{
		return skatteprosent;
	}
	
	public void setSkatteprosent(double nyVerdi)
	{
		skatteprosent = nyVerdi;
	}
	
	public ArbTaker(Person personalia, int arbtakernr, int ansettelsesaar, double maanedslonn, double skatteprosent)
	{
		this.personalia = personalia;
		this.arbtakernr = arbtakernr;
		this.ansettelsesaar = ansettelsesaar;
		this.maanedslonn = maanedslonn;
		this.skatteprosent = skatteprosent;
	}
	
	// Hvor mange kroner arbeidstakeren trekkes i skatt per maaned
	public double getSkattetrekkMnd()
	{
		return maanedslonn * skatteprosent;
	}
	
	// Bruttolonn per aar
	public double getBruttoLonnAar()
	{
		return maanedslonn * 12;
	}
	
	// Skattetrekk per aar
	public double getSkattetrekkAar()
	{
		return maanedslonn * 10.5 * skatteprosent; // 12 mnd - juni - 0.5 desember
	}
	
	public String getFormeltNavn()
	{
		return personalia.getEtternavn() + ", " + personalia.getFornavn();
	}
	
	public int getAlder()
	{
		int aar = GregorianCalendar.getInstance().get(Calendar.YEAR);
		return aar - personalia.getFodselsaar();
	}
	
	// Antall aar ansatt i bedriften
	public int getAntallAar()
	{
		int aar = GregorianCalendar.getInstance().get(Calendar.YEAR);
		return aar - ansettelsesaar;
	}
	
	// Om personen har vaert ansatt i mer enn aar aar.
	public boolean harVaertAnsattLengere(int aar)
	{
		return getAntallAar() > aar;
	}
}