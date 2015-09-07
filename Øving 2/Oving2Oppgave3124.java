import static javax.swing.JOptionPane.*;

public class Oving2Oppgave3124
{
	public static void main(String[] args)
	{
		double prisA;
		int mengdeA;
		double prisB;
		int mengdeB;
		try
		{
			prisA = Double.parseDouble(showInputDialog("Pris på kjøttdeig A (NOK): ").replace(',','.'));
			mengdeA = Integer.parseInt(showInputDialog("Hvor mye av kjøttdeig A (gram): "));

			prisB = Double.parseDouble(showInputDialog("Pris på kjøttdeig B (NOK): ").replace(',','.'));
			mengdeB = Integer.parseInt(showInputDialog("Hvor mye av kjøttdeig B (gram): "));
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun tall!");
			return;
		}

		double prisPerGramA = regnUtPrisPerGram(prisA, mengdeA);
		double prisPerGramB = regnUtPrisPerGram(prisB, mengdeB);

		if(prisPerGramA < prisPerGramB)
			showMessageDialog(null, "Kjøttdeig A er rimeligst!");
		else if(prisPerGramA == prisPerGramB)
			showMessageDialog(null, "Begge kjøttdeigene er like rimelig!");
		else
			showMessageDialog(null, "Kjøttdeig B er rimeligst!");
	}
	public static double regnUtPrisPerGram(double pris, int mengde)
	{
		return pris/mengde;
	}
}