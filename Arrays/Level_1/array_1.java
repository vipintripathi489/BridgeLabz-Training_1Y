import java.util.Scanner;
import java.util.Arrays;

class array_1
{
	public static void main(String args[])
	{
		int sum = 0;
		
		Scanner space = new Scanner(System.in);
		int b = space.nextInt();
		int[] arr = new int [b];
		
		int a = arr.length;
		System.out.println("Length_of_array : "+a);
		
		for (int i = 0; i < a;i++)
		{
			arr[i] = space.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Using_for_loop : ");
		for (int i = 0; i < a;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Using_for_each_loop : ");
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		for (int i = a - 1; i >= 0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Linear_search : ");
		int c = space.nextInt();
		for (int i = 0;i < a;i++)
		{
			if (arr[i] == c)
			{
			System.out.println("Found_at_arr["+i+"]");
				break;
				
			}
			else
			{
				System.out.println("Not_found_in_arr["+i+"]");
			}
		}
		
		System.out.println("Sum_of_all_the_values_of_arrays.");
		for (int i = 0;i < a;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
	}
}