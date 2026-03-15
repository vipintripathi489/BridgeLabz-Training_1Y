package StringsLevel_1;

import java.util.Scanner;

public class QuestionFirst
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        compareStrings(str1, str2);
    }

    public static void compareStrings(String str1, String str2)
    {
        boolean a = true;

        if(str1.length() != str2.length())
        {
            a = false;
        }
        else
        {
            for(int i = 0; i < str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i))
                {
                    a = false;
                }
            }
        }

        boolean b = str1.equals(str2);

        System.out.println("charAt comparison: " + a);
        System.out.println("equals() comparison: " + b);
        if(a == b)
        {
            System.out.println("Both results are same");
        }
        else
        {
            System.out.println("Results are different");
        }
    }
}
