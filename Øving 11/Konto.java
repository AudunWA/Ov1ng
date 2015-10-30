// Øving 11 oppgave 16.13.3
import java.io.*;
import java.util.*;

public class Konto
{
	private static final String FILE_BALANCE = "saldo.txt";
	private static final String FILE_TRANSACTIONS = "transactions.txt";
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println(getBalance());
		updateBalance();
		System.out.println(getBalance());
	}
	
	private static void updateBalance() throws FileNotFoundException, IOException
	{
		double sumTransactions = 0;
		File file = new File(FILE_TRANSACTIONS);
		Scanner input = new Scanner(file);

		while(input.hasNext()) 
		{
			String nextLine = input.nextLine().toUpperCase();
			boolean positiveTransaction = nextLine.charAt(0) == 'I';
			double value = Double.parseDouble(nextLine.substring(1)); 
			
			if(positiveTransaction)
			{
				sumTransactions += value;
			}
			else
			{
				sumTransactions -= value;
			}
		}

		input.close();
		
		if(sumTransactions > 0)
		{
			addToBalance(sumTransactions);
		}
		else
		{
			// Delete transactions?
			file = new File(FILE_TRANSACTIONS);
			FileWriter writer = new FileWriter(file, false);

			writer.write("");
			writer.close();
		}
	}
	
	private static void addToBalance(double sum) throws IOException
	{
		double newBalance = getBalance() + sum;
		
		File file = new File(FILE_BALANCE);
		FileWriter writer = new FileWriter(file, false);

		writer.write(Double.toString(newBalance));
		writer.close();
	}
	
	private static double getBalance() throws FileNotFoundException
	{
		File file = new File(FILE_BALANCE);
		Scanner input = new Scanner(file);

		if(input.hasNext()) 
		{
			String rawData = input.nextLine();
			return Double.parseDouble(rawData); 
		}
		
		return 0;
	}
	
}