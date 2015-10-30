// Øving 8 oppgave 8.16.1
public class NewString
{
	// Testprogram
	public static void main(String[] args)
	{
		NewString s = new NewString("denne setningen kan forkortes");
		System.out.println(s.shorten());
		System.out.println(s.removeLetter('e'));
	}
	
	private String baseString;

	public NewString(String baseString)
	{
		this.baseString = baseString;
	}

	public String shorten()
	{
		String[] splitted = baseString.split(" ");
		String shortened = "";
		for(int i = 0; i < splitted.length; i++)
		{
			if(splitted[i].length() == 0)
				continue;
			
			shortened += splitted[i].charAt(0);
		}
		
		return shortened;
	}
	
	public String removeLetter(char letter)
	{
		return baseString.replace(Character.toString(letter), "");
	}
}