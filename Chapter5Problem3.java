import java.util.Scanner;

public class Chapter5Problem3
{

	public static double getLength(double rectangleLength)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		rectangleLength = keyboard.nextDouble();
		return rectangleLength;
	}

	public static double getWidth(double rectangleWidth)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle: ");
		rectangleWidth = keyboard.nextDouble();
		return rectangleWidth;
	}

	public static double getArea(double rectangleLength, double rectangleWidth)
	{
		double rectangleArea;
		rectangleArea = rectangleLength * rectangleWidth;
		return rectangleArea;
	}

	public static void displayArea(double rectangleLength, double rectangleWidth, double getArea)
	{
		System.out.println("A rectangle with length: " + rectangleLength + " width: " + rectangleWidth + " has an area of: " + getArea);
	}

	public static void main (String[] args)
	{

		double userLength = getLength(rectangleLength);
		double userWidth = getWidth(rectangleWidth);
		displayArea(rectangleLength, rectangleWidth, getArea(rectangleLength, rectangleWidth));
	}
}