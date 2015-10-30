// Øving 10 oppgave 12.10.1
public class Student
{
	private String navn;
	private int antOppg;

	public String getNavn()
	{
		return navn;
	}
	
	public int getAntOppg()
	{
		return antOppg;
	}
	
	public Student(String navn, int antOppg)
	{
		this.navn = navn;
		this.antOppg = antOppg;
	}
	
	public void okAntOppg(int okning)
	{
		antOppg += okning;
	}
	
	public String toString()
	{
		return "navn: " + navn + ", antOppg: " + antOppg;
	}
}