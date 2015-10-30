// Øving 10 oppgave 12.10.1
public class Testklient
{
	public static void main(String[] args)
	{
		Oppgaveoversikt o = new Oppgaveoversikt(4);
		System.out.println(o.getAntallOppgaver("Petter"));
		
		o.registrerNyStudent(new Student("Petter", 4));
		System.out.println(o.getAntallOppgaver("Petter"));
		
		o.okAntOppg("Petter", 3);
		System.out.println(o.getAntallOppgaver("Petter"));
		
		o.registrerNyStudent(new Student("Johan", 0));
		System.out.println(o.getAntallOppgaver("Johan"));
		
		System.out.println(o.getAntallStudenter());
	}
}