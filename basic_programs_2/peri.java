import java.util.Scanner;
class Peri
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Perimeter_of_square : ");
		int a = space.nextInt();
		double b = a/4.0;
		System.out.println("Side_of_square : "+b);
	}
}