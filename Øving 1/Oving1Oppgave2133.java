import static javax.swing.JOptionPane.*;

public class Oving1Oppgave2133
{
	public static void main(String[] args)
	{
		String sekunderTekst = showInputDialog("Antall sekunder: ");
		int sekunder;
		try
		{
			sekunder = Integer.parseInt(sekunderTekst);
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun hele tall!");
			return;
		}

		// Kontrollerer input
		if(sekunder < 0)
		{
			showMessageDialog(null, "Input kan ikke være negativ!");
			return;
		}

		int gjenværendeSekunder = sekunder;

		int timer = gjenværendeSekunder / 3600;
		gjenværendeSekunder -= timer*3600; // Vi trekker fra så vi kun teller de gjenværende minuttene og deretter sekundene

		int minutter = gjenværendeSekunder / 60;
		gjenværendeSekunder -= minutter*60;

		showMessageDialog(null, sekunder + " sekund(er) tilsvarer " + timer + " time(r), " + minutter + " minutt(er) og " + gjenværendeSekunder + " sekund(er).");
	}
}