import java.util.Scanner;

public class Chapter5Problem11
{
	public static double profitOrLoss(double numberOfShares, double purchasePricePerShare, double purchaseComissionPaid, double salePricePerShare, 
	double saleCommissionPaid)
	{
		double profitOrLoss;
		profitOrLoss = ((numberOfShares * salePricePerShare) - saleCommissionPaid) - ((numberOfShares * purchasePricePerShare) + purchaseComissionPaid);
		return profitOrLoss;
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double profitOrLoss = 0;
		double numberOfShares = 0;
		double purchasePricePerShare = 0;
		double purchaseComissionPaid = 0;
		double salePricePerShare = 0;
		double saleCommissionPaid = 0;
		double totalProfitOrLoss = 0;
		char repeat; 
		//String input;

		do
		{
			System.out.println("Enter the number of shares purchased: ");
			numberOfShares = keyboard.nextDouble();

			System.out.println("Enter the purchase price per share: ");
			purchasePricePerShare = keyboard.nextDouble();

			System.out.println("Enter the purchase commission paid: ");
			purchaseComissionPaid = keyboard.nextDouble();

			System.out.println("Enter the sale price per share: ");
			salePricePerShare = keyboard.nextDouble();

			System.out.println("Enter the sale commission paid: ");
			saleCommissionPaid = keyboard.nextDouble();

			profitOrLoss = profitOrLoss(numberOfShares, purchasePricePerShare, purchaseComissionPaid, salePricePerShare, saleCommissionPaid);

			System.out.println("Your net on this trade was: $" + profitOrLoss);

			totalProfitOrLoss = totalProfitOrLoss + profitOrLoss;

			System.out.println("Would you like to calculate your profit or loss from another set of stock sales?");
			System.out.println("Enter 'Y for yes or anything else to exit.");
			keyboard.nextLine();
			repeat = keyboard.nextLine().charAt(0);

		} while(repeat == 'Y' || repeat == 'y');

		System.out.println("Your net on all of your stock sales was: $" + totalProfitOrLoss);
	}
}