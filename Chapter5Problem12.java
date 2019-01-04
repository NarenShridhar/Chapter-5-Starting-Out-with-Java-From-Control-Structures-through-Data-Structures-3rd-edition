import java.util.Scanner;

public class Chapter5Problem12
{
	public static double kineticEnergy(double mass, double velocity)
	{
		double kineticEnergy;
		kineticEnergy = (0.5) * mass * (velocity * velocity);
		return kineticEnergy;
	}

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double kineticEnergy = 0;
		double mass = 0;
		double velocity = 0;

		System.out.println("Enter an objects mass in kilograms: ");
		mass = keyboard.nextDouble();

		System.out.println("Enter an objects velocity in meters per second: ");
		velocity = keyboard.nextDouble();

		kineticEnergy = kineticEnergy(mass, velocity);

		System.out.println("The kinetic energy for an object traveling at speed " + velocity + " meters per second, weighing " + mass +
			" kilograms, is: " + kineticEnergy);
	}
}