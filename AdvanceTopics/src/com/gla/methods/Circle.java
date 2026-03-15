package com.gla.methods;

import java.util.Scanner;

public class Circle {
    public void areaOfCircle(int radius){
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);
    }

    public void circumferanceOfCircle(int radius){
        double circumferance = Math.PI * 2 * radius;
        System.out.println(circumferance);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int c = a.nextInt();

        Circle b = new Circle();
        b.areaOfCircle(c);
    }
}
