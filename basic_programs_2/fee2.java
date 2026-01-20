import java.util.Scanner;
class Fee2
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Enter_your_fee : ");
		int a = space.nextInt();
		System.out.print("Enter_discount_to_be_applied : ");
		int b = space.nextInt();
		double c = a/100 * b;
		System.out.println("Discount_fee : "+c);
		double d = a - c;
		System.out.println("Fee_after_discount : "+d);
	}
}