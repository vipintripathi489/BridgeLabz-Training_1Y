import java.util.Scanner;

class CheckNumbers {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int b = 0; b < arr.length; b++) {
            arr[b] = a.nextInt();
        }

        for (int c = 0; c < arr.length; c++) {

            if (arr[c] > 0) {
                if (arr[c] % 2 == 0) {
                    System.out.println(arr[c] + " is Positive and Even");
                } else {
                    System.out.println(arr[c] + " is Positive and Odd");
                }
            } 
            else if (arr[c] < 0) {
                System.out.println(arr[c] + " is Negative");
            } 
            else {
                System.out.println(arr[c] + " is Zero");
            }
        }

        int d = arr[0];
        int e = arr[arr.length - 1];

        if (d == e) {
            System.out.println("First and last elements are Equal");
        } 
        else if (d > e) {
            System.out.println("First element is Greater than last element");
        } 
        else {
            System.out.println("First element is Less than last element");
        }
    }
}
