import java.util.Scanner;
class Kilometers_to_miles
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Distance(in_km) : ");
		int a = space.nextInt();
		double b = a * 1.6;
		System.out.println("Distance(in_miles) : "+b);
	}
}