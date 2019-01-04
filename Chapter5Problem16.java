import java.util.Scanner;

public class Chapter5Problem16
{
	public static double presentValue(double futureValue, double annualInterestRate, double numberOfYears)
	{
		double presentValue;
		presentValue = futureValue/(Math.pow((1 + annualInterestRate), numberOfYears));
		return presentValue;
	}

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double presentValue = 0;
		double futureValue = 0;
		double annualInterestRate = 0;
		double numberOfYears = 0;
		char repeat;

		do
		{
			System.out.println("Enter the future value you want in the account: ");
			futureValue = keyboard.nextDouble();

			while(futureValue <= 0)
			{
				System.out.println("The future value of your account must be greater than 0, please enter an amount that reflects that: ");
				System.out.println("Enter the future value you want in the account: ");
				futureValue = keyboard.nextDouble();
			}

			System.out.println("Enter the annual interest rate (AS A DECIMAL!) that you expect the account to grow by: ");
			annualInterestRate = keyboard.nextDouble();

			while(annualInterestRate > 1)
			{
				System.out.println("It is highly unlikely your money grows by over 100% each year. Invalid entry.");
				System.out.println("Enter the annual interest rate (AS A DECIMAL!) that you expect the account to grow by: ");
				annualInterestRate = keyboard.nextDouble();
			}

			System.out.println("Enter the number of years you plan to let the money sit in the account for: ");
			numberOfYears = keyboard.nextDouble();

			while(numberOfYears < 1)
			{
				System.out.println("Your money must grow for more than one year. Please re-enter the amount of years your money will sit for: ");
				System.out.println("Enter the number of years you plan to let the money sit in the account for: ");
				numberOfYears = keyboard.nextDouble();
			}

			presentValue = presentValue(futureValue, annualInterestRate, numberOfYears);

			System.out.println("The present value you will need to deposit is: $" + presentValue);

			System.out.println("Would you like to try a new present value calculation?");
			System.out.println("Enter 'Y for yes or anything else to exit.");
			keyboard.nextLine();
			repeat = keyboard.nextLine().charAt(0);
		} while(repeat == 'Y' || repeat == 'y');
	}
}