import java.util.Scanner;
class friends
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter_the_height_and_age_first :");
		int b = a.nextInt();
		int c = a.nextInt();
		System.out.println("Enter_the_height_and_age_second :");
		int d = a.nextInt();
		int e = a.nextInt();
		System.out.println("Enter_the_height_and_age_third :");
		int f = a.nextInt();
		int g = a.nextInt();
		if (b > d && b > f)
		{
			System.out.println("Amar_is_tallest.");
		}
		else if (d > b && d > f)
		{
			System.out.println("Akbar_is_tallest.");
		}
		else
		{
			System.out.println("Anthony_is_tallest.");
		}
		if (c < e && c < g)
		{
			System.out.println("Amar_is_youngest.");
		}
		else if (e < c && e < g)
		{
			System.out.println("Anthony_is_youngest.");
		}
		else
		{
			System.out.println("Akbar_is_youngest.");
		}
	}
}