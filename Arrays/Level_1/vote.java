import java.util.Scanner;
import java.util.Arrays;

class vote_check
{
	public static void main(String args[])
	{
		int sum = 0,cod = 0,inv = 0;
		Scanner space = new Scanner(System.in);
		
		int a = 10;
		int arr[] = new int [a];
		
		for (int i = 0;i < a;i++)
		{
			arr[i] = space.nextInt();
			if (arr[i] >= 18)
			{
				sum += 1;
			}
			else if (arr[i] < 18 && arr[i] > 0)
			{
				cod += 1;
			}
			else
			{
				inv += 1;
			}
		}
		System.out.print("The_number_of_students_that_can_vote_are_"+sum);
		System.out.print("_the_number_of_students_those_can't_vote_are_"+cod);
		System.out.println("_and_the_invalid_entries_are_"+inv);
	}
}