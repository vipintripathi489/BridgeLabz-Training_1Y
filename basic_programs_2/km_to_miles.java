import java.util.Scanner;
class Km_to_miles
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Distance(in miles) : ");
		int a = space.nextInt();
		double b = a * 1.6;
		System.out.print("Distance(in km) : "+b);
	}
}