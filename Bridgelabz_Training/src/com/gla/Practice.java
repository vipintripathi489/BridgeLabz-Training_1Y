package com.gla;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Practice {
    public int[] linearSearch() {

    }

    public int[] search(){

    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();

        int arr[] = new Int [b];

        for (int i = 0; i < b; i++)
        {
            arr[i] = a.nextInt();
        }

        for (int i = 0; i < b; i++)
        {
            if (arr[i] == c)
            {
                System.out.println("Element_found_in_indexing : "+i);
            }
        }
    }
}
