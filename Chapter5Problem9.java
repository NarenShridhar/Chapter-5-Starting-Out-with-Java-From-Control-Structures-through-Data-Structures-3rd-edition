import java.util.Scanner;

public class Chapter5Problem9
{
	public static double distance(double speed, double time)
	{
		double distance;
		distance = speed * time;
		return distance;
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double distance = 0;
		double speed = 0;
		double time = 0;

		System.out.println("Enter the speed of the vehicle: ");
		speed = keyboard.nextDouble();

		System.out.println("Enter the time the vehicle has traveled: ");
		time = keyboard.nextDouble();

		distance = distance(speed, time);

		System.out.println("The distance you traveled for a vehicle moving " + speed + " fast and for " + time + " long is: " + distance);
	}
}