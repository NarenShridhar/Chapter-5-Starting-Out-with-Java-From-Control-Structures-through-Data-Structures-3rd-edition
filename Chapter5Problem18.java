import java.util.Scanner;
import java.util.Random;

public class Chapter5Problem18
{
	public static String generateComputerColor(Random random)
	{
		int colorIndex;
		colorIndex = random.nextInt(5);
		String computerChosenColor = "";

		if(colorIndex == 0)
		{
			computerChosenColor = "Red";
		}

		else if(colorIndex == 1)
		{
			computerChosenColor = "Green";
		}

		else if(colorIndex == 2)
		{
			computerChosenColor = "Blue";
		}

		else if(colorIndex == 3)
		{
			computerChosenColor = "Orange";
		}

		else if(colorIndex == 4)
		{
			computerChosenColor = "Yellow";
		}
		System.out.println("Computer has chosen a color");
		return computerChosenColor;
	}

	public static String getUserColor(Scanner keyboard)
	{
		String userColor = "";
		System.out.println("User, guess the computer's color");
		userColor = keyboard.nextLine();
		return userColor;
	}

	public static boolean compareColors(String computerColor, String userColor)
	{
		/*String computerColor;
		String userColor;
		computerColor = color1;
		userColor = color2;*/

		if(computerColor.equalsIgnoreCase(userColor))
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	public static void displayUserCorrectGuesses(int userCorrectGuesses)
	{
		System.out.println("The user correctly guessed " + userCorrectGuesses + " out of 10 guesses!");
	}
	public static void main (String[] args)
	{
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		String computerColor;
		String userColor;
		int userCorrectGuesses = 0;

		for(int currentGuessNumber = 1; currentGuessNumber <= 10; currentGuessNumber++)
		{
			computerColor = generateComputerColor(random);
			userColor = getUserColor(keyboard);
			System.out.println("The computer selected: " + computerColor + " and you selected: " + userColor);
			if(compareColors(computerColor, userColor))
			{
				userCorrectGuesses = userCorrectGuesses + 1;
			}
		}
		displayUserCorrectGuesses(userCorrectGuesses);
	}
}