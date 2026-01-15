import java.util.Scanner;
class Same
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Distance(in yards) : ");
		int a = space.nextInt();
		double b = a/3.0;
		double c = b/1760;
		System.out.println("Distance(in feet) : " +b);
		System.out.println("Distance(in yards) : " +c);
	}
}