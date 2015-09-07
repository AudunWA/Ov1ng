import static javax.swing.JOptionPane.*;

public class Oving2Oppgave3123
{
	public static void main(String[] args)
	{
		int aar;
		try
		{
			aar = Integer.parseInt(showInputDialog("Hvilket �r?"));
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun hele tall!");
			return;
		}

		// Kontrollerer input
		if(aar < 0)
		{
			showMessageDialog(null, "Input kan ikke v�re negativ!");
			return;
		}

		if(aar % 100 == 0)
		{
			if(aar % 400 == 0) // Hundre�r, men ogs� skudd�r
			{
				showMessageDialog(null, aar + " er et skudd�r!");
			}
			else
			{
				showMessageDialog(null, aar + " er IKKE et skudd�r!");
			}
		}
		else if(aar % 4 == 0) // Vanlig skudd�r
		{
			showMessageDialog(null, aar + " er et skudd�r!");
		}
		else // Vanlig �r
		{
			showMessageDialog(null, aar + " er IKKE et skudd�r!");
		}
	}
}