import java.util.Random;

public class Chapter5Problem15
{
	public static boolean isEven(int number)
	{
		if((number % 2) == 0)
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	public static void main (String[] args)
	{
		Random random = new Random();
		int randomNumberGenerated;
		int numberOfEvenNumbers = 0;
		int numberOfOddNumbers = 0;
		for(int currentNumber = 1 ; currentNumber <= 100; currentNumber++)
		{
			randomNumberGenerated = random.nextInt(100) + 1;
			if(isEven(randomNumberGenerated))
			{
				numberOfEvenNumbers = numberOfEvenNumbers + 1;
			}

			else
			{
				numberOfOddNumbers = numberOfOddNumbers + 1;
			}
		}

		System.out.println("The number of even numbers generated is: " + numberOfEvenNumbers + 
			" and the number of odd numbers generated is: " + numberOfOddNumbers);
	}
}