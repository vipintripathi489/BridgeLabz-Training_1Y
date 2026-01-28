import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		if ( (b + c + d)/3 >= 80 && (b + c + d)/3 <= 100)
		{
			System.out.println("A : (Level_4)aboveAgency-normalizationStandards");
		}
		else if( (b + c + d)/3 < 80 && (b + c + d)/3 > 69)
		{
			System.out.println("B : (Level_3)atAgency-normalizationStandards");
		}
		else if( (b + c + d)/3 < 70 && (b + c + d)/3 > 59)
		{
			System.out.println("C : (Level_2)below,butApproachingAgency-normalizationStandards");
		}
		else if( (b + c + d)/3 < 60 && (b + c + d)/3 > 49)
		{
			System.out.println("D : (Level_1)wellBelowAgency-normalizationStandards");
		}
		else if( (b + c + d)/3 < 50 && (b + c + d)/3 > 39)
		{
			System.out.println("E : (Level_1)tooBelowAgency-normalizationStandards");
		}
		else if( (b + c + d)/3 < 40)
		{
			System.out.println("R : RedialStandards");
		}
		else{
			System.out.println("Invalid");
		}
	}
}