import java.util.Scanner;
class std
{
	public static void main(String args[])
	{
		Scanner space = new Scanner(System.in);
		System.out.print("Number_of_students : ");
		int a = space.nextInt();
		System.out.print("Number_of_pens : ");
		int b = space.nextInt();
		int c = b/a;
		System.out.println("The_number_of_pen_distributed_per_student_is : "+c);
		int d = b%a;
		System.out.println("The_number_of_pens_left : "+d);
	}
}