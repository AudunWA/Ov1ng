// Øving 9 oppgave 11.10.1
import static javax.swing.JOptionPane.*;
public class Testklient
{
	public static void main(String[] args)
	{
		boolean fortsett = true;
		Person person = new Person("Jan", "Otze", 1982);
		ArbTaker arbeidstaker = new ArbTaker(person, 1, 2002, 50000, 0.276);
		
		while(fortsett)
		{
			StringBuilder info = new StringBuilder();
			
			info.append("Arbeidstakernummer: " + arbeidstaker.getArbtakernr() + "\n");
			info.append("Navn: " + arbeidstaker.getFormeltNavn() + "\n");
			info.append("Fodselsaar: " + arbeidstaker.getPersonalia().getFodselsaar() + "\n");
			info.append("Alder: " + arbeidstaker.getAlder() + "\n");
			info.append("Annsettelsesaar: " + arbeidstaker.getAnsettelsesaar() + "\n");
			info.append("Aar i bedriften: " + arbeidstaker.getAntallAar() + "\n");
			info.append("Maanedslonn: " + arbeidstaker.getMaanedslonn() + "kr\n");
			info.append("Skatteprosent: " + arbeidstaker.getSkatteprosent()*100 + "%\n");
			info.append("Skattetrekk/mnd: " + String.format("%.2f", arbeidstaker.getSkattetrekkMnd()) + "kr\n");
			info.append("Skattetrekk/aar: " + arbeidstaker.getSkattetrekkAar() + "kr\n");
			info.append("Bruttolonn/aar: " + arbeidstaker.getBruttoLonnAar() + "kr\n");

			int valg = showOptionDialog(null, info.toString(), "Personinformasjon", 0, PLAIN_MESSAGE, null, new String[] {"Rediger", "Sjekk aar ansatt", "Lukk"}, "Lukk");
			switch(valg)
			{
				case 0: // Rediger
					String variabel = (String)showInputDialog(null, "Velg hva du vil redigere:", "Personinformasjon", QUESTION_MESSAGE, null, new String[] {"Maanedslonn", "Skatteprosent"}, "");
					if(variabel == null)
						fortsett = false;
					
					String input = showInputDialog(null, "Sett inn ny verdi:");
					if(input == null)
					{
						fortsett = false;
						break;
					}
					
					switch(variabel)
					{
						case "Maanedslonn":
							arbeidstaker.setMaanedslonn(Double.parseDouble(input));
							break;
						case "Skatteprosent":
							arbeidstaker.setSkatteprosent(Double.parseDouble(input)/100d);
							break;
					}
					
					break;
					
				case 1: // Sjekk aar ansatt
					int aar = Integer.parseInt(showInputDialog(null, "Sjekk aar:"));
					if(arbeidstaker.harVaertAnsattLengere(aar))
					{
						showMessageDialog(null, arbeidstaker.getFormeltNavn() + " har vaert ansatt lengere enn " + aar + " aar.");
					}
					else
					{
						showMessageDialog(null, arbeidstaker.getFormeltNavn() + " har ikke vaert ansatt lengere enn " + aar + " aar.");
					}
					break;
					
				default:
					fortsett = false;
					break;
			}
		}
	}
}