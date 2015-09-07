import static javax.swing.JOptionPane.*;

public class Oving1Oppgave2131
{
	static final double CM_PER_TOMME = 2.54;
	public static void main(String[] args)
	{
		String tommeTekst = showInputDialog("Antall tommer: ").replace(",", ".");
		double tommer;
		try
		{
			tommer = Double.parseDouble(tommeTekst);
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun tall!");
			return;
		}

		if(tommer < 0)
		{
			showMessageDialog(null, "Input kan ikke være negativ!");
			return;
		}

		double antallCm = tommerTilCm(tommer);
		showMessageDialog(null, tommer + " tommer tilsvarer " + antallCm + " cm.");
	}
	public static double tommerTilCm(double antallTommer)
	{
		return antallTommer * CM_PER_TOMME;
	}
}