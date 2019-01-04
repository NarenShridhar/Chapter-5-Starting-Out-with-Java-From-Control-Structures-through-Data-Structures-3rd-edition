import java.util.Scanner;

public class Chapter5Problem2
{
	public static double calculateRetail(double wholeSaleCost, double markupPercentage)
	{

		double retailPrice;
		retailPrice = ((markupPercentage/100) * wholeSaleCost) + wholeSaleCost;
		return retailPrice;
	}

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double wholeSaleCost;
		double markupPercentage;

		System.out.println("What was the wholesale cost of the item?");
		wholeSaleCost = keyboard.nextDouble();

		System.out.println("What was the markupPercentage of the item?");
		markupPercentage = keyboard.nextDouble();

		System.out.println("The item has a retail price of: " + calculateRetail(wholeSaleCost, markupPercentage));

	}
}