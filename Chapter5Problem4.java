import java.util.Scanner;

public class Chapter5Problem4
{

	public static double getNumberOfRooms()
	{
		Scanner keyboard = new Scanner(System.in);
		double numberOfRoomsToBePainted;

		System.out.println("Enter the number of rooms to be painted: ");
		numberOfRoomsToBePainted = keyboard.nextDouble();

		while(numberOfRoomsToBePainted < 1)
		{
			System.out.println("The number of rooms to be painted must be atleast 1, invalid entry.");
			System.out.println("Enter the number of rooms to be painted: ");
			numberOfRoomsToBePainted = keyboard.nextDouble();
		}

		return numberOfRoomsToBePainted;
	}

	public static double getPaintPrice()
	{
		Scanner keyboard = new Scanner(System.in);
		double priceOfPaintPerGallon;

		System.out.println("Enter the price of paint per gallon: ");
		priceOfPaintPerGallon = keyboard.nextDouble();

		while(priceOfPaintPerGallon <= 0)
		{
			System.out.println("The price of paint per gallon needs to be over $0.00, invalid entry.");
			System.out.println("Enter the price of paint per gallon: ");
			priceOfPaintPerGallon = keyboard.nextDouble();
		}

		return priceOfPaintPerGallon;
	}

	public static double getTotalWallSpace(double numberOfRoomsToBePainted)
	{
		Scanner keyboard = new Scanner(System.in);
		double squareFeetOfWallSpacePerRoom;
		double totalSquareFeetOfWallSpace = 0;

		for(int rooms = 1; rooms <= numberOfRoomsToBePainted; rooms++)
		{
			System.out.println("Enter the amount of square feet of wall space for room " + rooms);
			squareFeetOfWallSpacePerRoom = keyboard.nextDouble();
			while(squareFeetOfWallSpacePerRoom <= 0)
			{
				System.out.println("The square feet of wall space in a room must be over 0, invalid entry.");
				System.out.println("Enter the amount of square feet of wall space for room " + rooms);
				squareFeetOfWallSpacePerRoom = keyboard.nextDouble();
			}
			totalSquareFeetOfWallSpace = totalSquareFeetOfWallSpace + squareFeetOfWallSpacePerRoom;
		}

		return totalSquareFeetOfWallSpace;
	}

	public static double numberOfGallonsOfPaintRequired(double totalSquareFeetOfWallSpace)
	{
		double gallonsOfPaintRequired;
		gallonsOfPaintRequired = (totalSquareFeetOfWallSpace/115) * 1;
		return gallonsOfPaintRequired;
	}

	public static double hoursOfLaborRequired(double totalSquareFeetOfWallSpace)
	{
		double hoursOfLaborRequired;
		hoursOfLaborRequired = (totalSquareFeetOfWallSpace/115) * 8;
		return hoursOfLaborRequired;
	}

	public static double costOfPaint(double priceOfPaintPerGallon, double gallonsOfPaintRequired)
	{
		double costOfPaintRequired;
		costOfPaintRequired = priceOfPaintPerGallon * gallonsOfPaintRequired;
		return costOfPaintRequired;
	}

	public static double laborCharges(double hoursOfLaborRequired, double hourlyCostOfLabor)
	{
		double totalLaborCharges;
		final double HOURLY_COST_OF_LABOR = 18;
		totalLaborCharges = hoursOfLaborRequired * HOURLY_COST_OF_LABOR;
		return totalLaborCharges;
	}

	public static double totalCost(double costOfPaintRequired, double totalLaborCharges)
	{
		double totalCostRequired;
		totalCostRequired = costOfPaintRequired + totalLaborCharges;
		return totalCostRequired;
	}

	public static void displayData(double numberOfRoomsToBePainted, double totalSquareFeetOfWallSpace, double priceOfPaintPerGallon,
									double gallonsOfPaintRequired, double hoursOfLaborRequired, double costOfPaintRequired, 
									double totalLaborCharges, double totalCostRequired)
	{
		String outputString;
		outputString = String.format("User number of rooms: %d\nTotal wall space: %.2f\nPrice of paint per gallon: $%,.2f\nGallons of paint" + 
			" required: %.1f\nHours of labor required: %.1f\nCost of paint: $%,.2f\nLabor Charges: $%,.2f" + 
			"\nTotal Cost: $%.2f", numberOfRoomsToBePainted, totalSquareFeetOfWallSpace, priceOfPaintPerGallon, gallonsOfPaintRequired,
			hoursOfLaborRequired, costOfPaintRequired, totalLaborCharges, totalCostRequired);
		System.out.println(outputString);
	}

	public static void main (String[] args)
	{
		final double HOURLY_COST_OF_LABOR = 18;
		double numberOfRoomsToBePainted = getNumberOfRooms();
		double totalSquareFeetOfWallSpace = getTotalWallSpace(numberOfRoomsToBePainted);
		double priceOfPaintPerGallon = getPaintPrice();
		double gallonsOfPaintRequired = numberOfGallonsOfPaintRequired(totalSquareFeetOfWallSpace);
		double hoursOfLaborRequired = hoursOfLaborRequired(totalSquareFeetOfWallSpace);
		double costOfPaintRequired = costOfPaint(priceOfPaintPerGallon, gallonsOfPaintRequired);
		double totalLaborCharges = laborCharges(hoursOfLaborRequired, HOURLY_COST_OF_LABOR);
		double totalCostRequired = totalCost(costOfPaintRequired, totalLaborCharges);
		displayData(numberOfRoomsToBePainted, totalSquareFeetOfWallSpace, priceOfPaintPerGallon, gallonsOfPaintRequired,
			hoursOfLaborRequired, costOfPaintRequired, totalLaborCharges, totalCostRequired);
	}

}