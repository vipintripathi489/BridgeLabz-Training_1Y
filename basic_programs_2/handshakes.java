import java.util.Scanner;
class Handshakes
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Number_of_students : ");
		int a = space.nextInt();
		int b = (a * (a - 1))/2;
		System.out.println("Number_of_handshakes : "+b);
	}
}