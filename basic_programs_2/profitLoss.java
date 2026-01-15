import java.util.Scanner;
class profitLoss
{
	public static void main(String args[])
	{
		Scanner integer = new Scanner(System.in);
		System.out.print("Cost_price : ");
		int a = integer.nextInt();
		System.out.print("Selling_price : ");
		int b = integer.nextInt();
		int profit = b - a;
		System.out.println("Profit : "+profit);
		double prf = profit*100/a;
		System.out.print("Profit percentage : "+prf);
	}
}