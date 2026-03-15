import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false; // invalid age
        }

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();

        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:\n");

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = obj.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println(" Invalid age entered!");
            } else if (result) {
                System.out.println(" Student CAN vote");
            } else {
                System.out.println(" Student CANNOT vote");
            }

            System.out.println();
        }

        sc.close();
    }
}
