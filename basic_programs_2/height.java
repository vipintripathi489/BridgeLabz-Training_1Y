import java.util.Scanner;
class Height
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Height(in cm) : ");
		int a = space.nextInt();
		double b = a/2.54;
		System.out.println("Height(in inches) : "+b);
		double c = b/12;
		System.out.println("Height(in foots)"+c);
	}
}