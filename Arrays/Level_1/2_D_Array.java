import java.util.Scanner;
import java.util.Arrays;

class arr
{
	public static void main(String args[])
	{
		int k = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter_row : ");
		int a = sc.nextInt();
		System.out.print("Enter_column : ");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		System.out.println();
		
		System.out.println("Enter_elements_for_2D : ");
		for (int i = 0;i < a;i++)
		{
			for (int j = 0; j < b;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("2D_Matrix : ");
		for (int i = 0;i < a;i++)
		{
			for (int j = 0; j < b;j++)
			{
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println();
			System.out.println();
		}
		
		int arr1[] = new int[a * b];
		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
				while (k < a * b)
				{
					arr1[k] = arr[i][j];
					k++;
					break;
				}
			}
		}		
		System.out.println();
		
		System.out.println("1D_Matrix_of_same_elements : ");
		for (int i = 0;i < a * b;i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}
}
