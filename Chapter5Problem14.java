import java.io.*;

public class Chapter5Problem14
{
	public static boolean isPrime(int userNumber)
	{
		int evenDivisions = 0;

		for(int currentDivision = 1; currentDivision <= userNumber; currentDivision++)
		{
			if(userNumber % currentDivision == 0)
			{
				evenDivisions = evenDivisions + 1;
				if((evenDivisions > 2) || (userNumber == 1))
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main (String[] args) throws IOException
	{
		PrintWriter fileToWrite = new PrintWriter("/Users/NarenShridhar/Documents/JavaPrograms/ChapterFiveProgrammingChallenges/primeNumbers.txt");

		for(int currentNumber = 1; currentNumber <= 100; currentNumber++)
		{
			if(isPrime(currentNumber))
			{
				fileToWrite.println(currentNumber);
			}
		}
		fileToWrite.close();
		System.out.println("All prime numbers have been written to the file!");
	}
}