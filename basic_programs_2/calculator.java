import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("First_number : ");
		double a = space.nextDouble();
		System.out.print("Second_number : ");
		double b = space.nextDouble();
		System.out.println("Addition : " +(a + b));
		System.out.println("Difference : " +(a - b));
		System.out.println("Multiplication : " +(a * b));
		System.out.println("Division : " +(a/b));
	}
}