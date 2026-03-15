import java.util.Scanner;
import java.util.Arrays;

class Number{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int arr[] = new Int [5];
		for (int i = 0;i < 5;i++)
		{
			arr[i] = a.nextInt();
			if (arr[i] > 0)
			{
				if (arr[i] % 2 == 0)
				{
					System.out.println(arr[i] + " is_even.");
				}
				else
				{
					System.out.println(arr[i] + " is_odd.");
				}
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
		if (arr[0] > arr[4])
		{
			System.out.println("First_number_is_largest.");
		}
		else if (arr[0] < arr[4])
		{
			System.out.println("Last_number_is_largest.");
		}
		else
		{
			System.out.println("Both_First_&_Last_numbers_are_equal.");
		}
	}
}