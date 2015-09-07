// Oppgave 7.8.3 klient
import static javax.swing.JOptionPane.*;

public class TekstAnalyseClient
{
	public static void main(String[] args)
	{
		String testTekst = showInputDialog("Skriv inn tekst som skal analyserer:");
		while(testTekst != null && !testTekst.isEmpty())
		{
			System.out.println("Input: " + testTekst);
			TekstAnalyserer analyse = new TekstAnalyserer(testTekst);

			int antallForskjellige = analyse.antallForskjelligeBokstaver();
			int antallTotalt = analyse.antallBokstaver();
			double prosentTegn = analyse.prosentIkkeBokstaver() * 100;
			int antallC = analyse.antallForekomster('c');
			char[] oftestFunnet = analyse.oftestFunnet();

			System.out.println("Antall forskjellige bokstaver: " + antallForskjellige);
			System.out.println("Antall bokstaver: " + antallTotalt);
			System.out.println("Prosent tegn: " + prosentTegn);
			System.out.println("Antall av bokstaven C: " + antallC);
			System.out.println("Oftest funnet bokstav(er): " + new String(oftestFunnet));

			testTekst = showInputDialog("Skriv inn tekst som skal analyserer:");
		}
	}
}