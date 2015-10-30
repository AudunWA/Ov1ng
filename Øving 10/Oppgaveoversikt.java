// Øving 10 oppgave 12.10.1
public class Oppgaveoversikt
{
	private Student[] studenter;
	private int antStud = 0;
	
	public Oppgaveoversikt(int antStud)
	{
		this.antStud = antStud;
		this.studenter = new Student[antStud];
		fyllStudenter();
	}
	
	private void fyllStudenter()
	{
		for(int i = 0; i < studenter.length; i++)
		{
			studenter[i] = new Student("Student" + i, 0);
		}
	}
	
	public int getAntallStudenter()
	{
		return studenter.length; // ELLER antStud
	}
	
	public int getAntallOppgaver(String navn)
	{
		for(int i = 0; i < studenter.length; i++)
		{
			if(studenter[i].getNavn().equals(navn))
			{
				return studenter[i].getAntOppg();
			}
		}
		
		return -1;
	}
	
	public void registrerNyStudent(Student student)
	{
		Student[] nyArray = new Student[studenter.length + 1]; // Ny, utvidet array
		
		// Legg inn gamle
		for(int i = 0; i < studenter.length; i++)
		{
			nyArray[i] = studenter[i];
		}
		
		// Legg inn ny student i nyArray
		nyArray[studenter.length] = student;
		
		// Bytte ut array
		studenter = nyArray;
		antStud++;
	}
	
	public void okAntOppg(String navn, int okning)
	{
		for(int i = 0; i < studenter.length; i++)
		{
			if(studenter[i].getNavn().equals(navn))
			{
				studenter[i].okAntOppg(okning);
			}
		}
	}
}