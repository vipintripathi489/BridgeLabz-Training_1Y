import java.util.Scanner;
class Tri
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Base(in cm) : ");
		int a = space.nextInt();
		System.out.print("Height(in cm) : ");
		int b = space.nextInt();
		double c = 1/2.0 * a * b;
		System.out.println("Area(in sq cm) : " +c);
		System.out.println("Area(in sq in) : " +(c * 1/2.54 * 1/2.54));
	}
}