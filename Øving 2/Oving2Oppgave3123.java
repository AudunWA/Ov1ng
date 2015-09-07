import static javax.swing.JOptionPane.*;

public class Oving2Oppgave3123
{
	public static void main(String[] args)
	{
		int aar;
		try
		{
			aar = Integer.parseInt(showInputDialog("Hvilket år?"));
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun hele tall!");
			return;
		}

		// Kontrollerer input
		if(aar < 0)
		{
			showMessageDialog(null, "Input kan ikke være negativ!");
			return;
		}

		if(aar % 100 == 0)
		{
			if(aar % 400 == 0) // Hundreår, men også skuddår
			{
				showMessageDialog(null, aar + " er et skuddår!");
			}
			else
			{
				showMessageDialog(null, aar + " er IKKE et skuddår!");
			}
		}
		else if(aar % 4 == 0) // Vanlig skuddår
		{
			showMessageDialog(null, aar + " er et skuddår!");
		}
		else // Vanlig år
		{
			showMessageDialog(null, aar + " er IKKE et skuddår!");
		}
	}
}