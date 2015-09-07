import static javax.swing.JOptionPane.*;

public class Oving1Oppgave2132
{
	public static void main(String[] args)
	{
		try
		{
			String timerTekst = showInputDialog("Antall timer: ").replace(",", ".");
			double timer = Double.parseDouble(timerTekst);

			String minutterTekst = showInputDialog("Antall minutter: ").replace(",", ".");
			double minutter = Double.parseDouble(minutterTekst);

			String sekunderTekst = showInputDialog("Antall sekunder: ").replace(",", ".");
			double sekunder = Double.parseDouble(sekunderTekst);

			if(timer < 0 || minutter < 0 || sekunder < 0) // Kan ikke være negativ tid!
			{
				showMessageDialog(null, "Input kan ikke være negativ!");
				return;
			}

			double totaleSekunder = finnUtAntallSekunder(timer, minutter, sekunder);
			showMessageDialog(null, "Det er totalt " + totaleSekunder + " sekunder.");
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun tall!");
			return;
		}
	}
	public static double finnUtAntallSekunder(double timer, double minutter, double sekunder)
	{
		return (timer*3600) + (minutter*60) + sekunder;
	}
}