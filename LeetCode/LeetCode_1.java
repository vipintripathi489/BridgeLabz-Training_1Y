import java.util.Scanner;
import java.util.Arrays;

class LeetCode_1
{
	public static void main(String args[])
	{
		int sum = 0;
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int arr[] = new int[b];
		int c = arr.length;
		System.out.println();
		
		for (int i = 0;i < c;i++)
		{
			arr[i] = a.nextInt();
		}
		System.out.println();
		int d = a.nextInt();
		System.out.println();
		
		for (int i = 0;i < c;i++)
		{
			for (int j = i + 1;j < c;j++)
			{
				if (arr[i] + arr[j] == d)
				{
					sum = sum + 1;
				}
			}
		}
		System.out.println("Total_number_of_pairs_are : "+sum);
	}
}