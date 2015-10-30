// Øving 8 oppgave 8.16.3
import java.util.StringTokenizer;

public class TextHandling
{
	// Testprogram
	public static void main(String[] args)
	{
		TextHandling t = new TextHandling("Dette er en periode. Dette er en annen. ÆØÅæøå.");
		System.out.println("Antall ord: " + t.wordCount());
		System.out.println("Gjennomsnittlig ordlengde: " + t.averageWordLength());
		System.out.println("Gjennomsnittlig periodelengde: " + t.averagePeriodLength());
		
		t.replace("Dette", "Hun");
		System.out.println("Input: " + t.toString());
		System.out.println("Input uppercase: " + t.toUpperCase());
	}
	
	private String baseString;

	public TextHandling(String baseString)
	{
		this.baseString = baseString;
	}
	
	public int wordCount()
	{
		return baseString.split(" ").length;
	}
	
	public int averageWordLength()
	{
		int totalWordLength = 0;
		String[] splitted = baseString.split(" ");
		for(int i = 0; i < splitted.length; i++)
		{
			//System.out.println(splitted[i]);
			totalWordLength += splitted[i].length();
		}
		
		return totalWordLength / splitted.length;
	}

	public int averagePeriodLength()
	{
		StringTokenizer splitter = new StringTokenizer(baseString, ".!:?");
		int periodCount = splitter.countTokens();
		int totalLength = 0;
		
		while(splitter.hasMoreTokens())
		{
			String period = splitter.nextToken();
			
			// Fjerner fra lengde som skal deles på hvis den er tom
			if(period.length() == 0)
				periodCount--;
			
			//System.out.println(period);
			totalLength += period.length();
		}
		
		return totalLength / periodCount;
	}
	
	public void replace(String s1, String s2)
	{
		baseString = baseString.replace(s1, s2);
	}
	
	public String toString()
	{
		return baseString;
	}
	
	public String toUpperCase()
	{
		return baseString.toUpperCase();
	}
}