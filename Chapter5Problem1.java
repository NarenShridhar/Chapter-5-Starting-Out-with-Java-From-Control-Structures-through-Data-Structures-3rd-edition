import java.util.Scanner;

public class Chapter5Problem1
{
	Scanner keyboard = new Scanner(System.in);
	public static void showChar(String stringGiven, int characterPosition)
	{
		if((characterPosition < 0) || (characterPosition > stringGiven.length() - 1))
		{
			System.out.println("Please enter an index of 0 to the last index of " + stringGiven + " which is " + (stringGiven.length() - 1));
		}

		else
		{
			System.out.println("The character at position " + characterPosition + " in " + stringGiven + " is " + stringGiven.charAt(characterPosition));
		}
	}

	public static void main (String[] args)
	{
		showChar("New York", 2);
	}
}