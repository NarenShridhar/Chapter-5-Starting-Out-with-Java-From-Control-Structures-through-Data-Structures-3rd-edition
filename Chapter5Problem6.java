public class Chapter5Problem6
{
	public static double Celsius(double fahrenheit)
	{
		double celsius;
		celsius = ((double)5/9) * (fahrenheit - 32);
		return celsius;
	}

	public static void displayHeader()
	{
		System.out.println("Fahrenheit\t\tCelsius\n----------\t\t-------");
	}

	public static void main (String[] args)
	{
		displayHeader();
		for(int currentTemperature = 0; currentTemperature <= 20; currentTemperature++)
		{	
			System.out.println(currentTemperature + "\t\t\t" + Celsius(currentTemperature));
		}
	}
}