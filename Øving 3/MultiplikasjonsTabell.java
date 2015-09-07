import static javax.swing.JOptionPane.*;

public class MultiplikasjonsTabell
{
	public static void main(String[] args)
	{
		int fra;
		int til;

		try
		{
			fra = Integer.parseInt(showInputDialog("Vis gangetabellen fra: "));
			til = Integer.parseInt(showInputDialog("Til: "));
		}
		catch(NumberFormatException x)
		{
			showMessageDialog(null, "Input er i feil format. Kun hele tall!");
			return;
		}

		for(int i = fra; i <= til; i++)
		{
			System.out.println(i + "-gangen:");
			for(int j = 1; j <= 10; j++)
			{
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println(""); // Finere formatering
		}
	}
}