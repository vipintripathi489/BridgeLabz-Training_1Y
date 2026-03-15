package com.gla.methods;

public class Solution {
    public static void area(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
    public void circum(double radius)
    {
        double circ = 2 * Math.PI * radius;
        System.out.println(circ);
    }

    public static void main(String[] args) {
        area(12);
        Solution s1 = new Solution();
        s1.circum(12);
        s1.area(10);
        area(15);
    }
}
