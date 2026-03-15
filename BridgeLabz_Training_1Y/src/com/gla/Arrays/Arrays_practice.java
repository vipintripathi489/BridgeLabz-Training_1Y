package com.gla.Arrays;
import java.util.*;

public class Arrays_practice {
    public static void main(String[] args) {

    }

        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int arr[] = new Int [b];
        int arr1[] = new Int [b];

        for(int i = 0; i < b; i++)
        {
            arr[i] = a.nextInt();
        }

        for(int i = 0; i < b; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                arr1[i] = arr[i];
            }
        }

        for(int i = 0; i < b; i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
