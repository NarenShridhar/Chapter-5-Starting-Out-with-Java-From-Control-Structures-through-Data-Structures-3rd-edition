public class Chapter5Problem5
{
	public static double fallingDistance(int fallingTime)
	{
		double distance;
		double g = 9.8;
		distance = ((double)1/2) * g * Math.pow(fallingTime, 2);
		return distance;
	}

	public static void displayHeader()
	{
		System.out.println("Time\t\tFalling Time\n------\t\t----------");
	}

	public static void main (String[] args)
	{
		displayHeader();
		for(int currentTime = 1; currentTime <= 10; currentTime++)
		{
			System.out.println(currentTime + "\t\t" + fallingDistance(currentTime));
		}
	}
}