import java.util.Scanner;

public class Chapter5Problem10
{
	public static double profitOrLoss(double numberOfShares, double purchasePricePerShare, double purchaseComissionPaid, double salePricePerShare, 
		double saleCommissionPaid)
	{
		double profitOrLoss;
		profitOrLoss = ((numberOfShares * salePricePerShare) - saleCommissionPaid) - ((numberOfShares * purchasePricePerShare) + purchaseComissionPaid);
		return profitOrLoss;
	}

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double profitOrLoss = 0;
		double numberOfShares = 0;
		double purchasePricePerShare = 0;
		double purchaseComissionPaid = 0;
		double salePricePerShare = 0;
		double saleCommissionPaid = 0;

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
	}
}