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
			showMessageDialog(null, "Input kan ikke v�re negativ!");
			return;
		}

		int gjenv�rendeSekunder = sekunder;

		int timer = gjenv�rendeSekunder / 3600;
		gjenv�rendeSekunder -= timer*3600; // Vi trekker fra s� vi kun teller de gjenv�rende minuttene og deretter sekundene

		int minutter = gjenv�rendeSekunder / 60;
		gjenv�rendeSekunder -= minutter*60;

		showMessageDialog(null, sekunder + " sekund(er) tilsvarer " + timer + " time(r), " + minutter + " minutt(er) og " + gjenv�rendeSekunder + " sekund(er).");
	}
}