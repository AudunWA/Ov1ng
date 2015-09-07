import static javax.swing.JOptionPane.*;

public class PrimtallKalkulator
{
	public static void main(String[] args)
	{
		String tallString;
		int tall;

		while((tallString = showInputDialog("Se om et tall er et primtall (Esc for å avslutte): ")) != null)
		{
			try
			{
				tall = Integer.parseInt(tallString);
			}
			catch(NumberFormatException x)
			{
				showMessageDialog(null, "Input er i feil format. Kun hele tall!");
				return;
			}

			int deleligMed = 0;

			if(tall > 2)
			{
				for(int i = 2; i < tall; i++)
				{
					if(tall % i == 0) // Delelig!
					{
						deleligMed = i;
						break;
					}
				}
			}

			if(deleligMed > 0)
				showMessageDialog(null, "Tallet " + tall + " er delelig med " + deleligMed);
			else
				showMessageDialog(null, "Tallet " + tall + " er et primtall.");
		}
	}
}