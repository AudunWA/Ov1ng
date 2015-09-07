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
			prisA = Double.parseDouble(showInputDialog("Pris p� kj�ttdeig A (NOK): ").replace(',','.'));
			mengdeA = Integer.parseInt(showInputDialog("Hvor mye av kj�ttdeig A (gram): "));

			prisB = Double.parseDouble(showInputDialog("Pris p� kj�ttdeig B (NOK): ").replace(',','.'));
			mengdeB = Integer.parseInt(showInputDialog("Hvor mye av kj�ttdeig B (gram): "));
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun tall!");
			return;
		}

		double prisPerGramA = regnUtPrisPerGram(prisA, mengdeA);
		double prisPerGramB = regnUtPrisPerGram(prisB, mengdeB);

		if(prisPerGramA < prisPerGramB)
			showMessageDialog(null, "Kj�ttdeig A er rimeligst!");
		else if(prisPerGramA == prisPerGramB)
			showMessageDialog(null, "Begge kj�ttdeigene er like rimelig!");
		else
			showMessageDialog(null, "Kj�ttdeig B er rimeligst!");
	}
	public static double regnUtPrisPerGram(double pris, int mengde)
	{
		return pris/mengde;
	}
}