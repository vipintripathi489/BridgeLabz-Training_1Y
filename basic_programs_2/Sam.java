import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Maths : ");
		int a = input.nextInt();
		System.out.print("Physics : ");
		int b = input.nextInt();
		System.out.print("Chemistry : ");
		int c = input.nextInt();
		int avg = (a + b + c)/3;
		System.out.print("Average : "+avg);
	}
	
}