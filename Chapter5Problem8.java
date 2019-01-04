import java.util.Scanner;

public class Chapter5Problem8
{
	public static double showKilometers(double meters)
	{
		double kilometers;
		kilometers = meters * 0.001;
		return kilometers;
	}

	public static double showInches(double meters)
	{
		double inches;
		inches = meters * 39.37;
		return inches;
	}

	public static double showFeet(double meters)
	{
		double feet;
		feet = meters * 3.281;
		return feet;
	}

	public static void menu()
	{
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double meters = -1;
		double userChoice = 0;
		double kilometers = 0;
		double inches = 0;
		double feet = 0;

		System.out.println("Enter a distance in meters: ");
		meters = keyboard.nextDouble();

		while(meters < 0)
		{
			System.out.println("You have entered an invalid number of meters. Meters should be greater than 0. Please input a different value: ");
			System.out.println("Enter a distance in meters: ");
			meters = keyboard.nextDouble();	
		}

		do
		{
			menu();
			System.out.println("Enter your choice: ");
			userChoice = keyboard.nextDouble();

			while(userChoice <= 0 || userChoice >= 5)
			{
				System.out.println("You have entered an invalid selection. Please choose 1-4 based on the menu.");
				menu();
				System.out.println("Enter your choice: ");
				userChoice = keyboard.nextDouble();
			}
			if(userChoice == 1)
			{
				kilometers = showKilometers(meters);
				System.out.println(meters + " meters is " + kilometers + " kilometers.");
			}

			else if(userChoice == 2)
			{
				inches = showInches(meters);
				System.out.println(meters + " meters is " + inches + " inches.");
			}

			else if(userChoice == 3)
			{
				feet = showFeet(meters);
				System.out.println(meters + " meters is " + feet + " feet.");
			}
			
		} while(userChoice != 4);
		System.out.println("Bye!");
	}
}