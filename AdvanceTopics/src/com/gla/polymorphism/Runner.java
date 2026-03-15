package com.gla.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Calculator a = new Calculator();

        int sum1 = a.add(1, 2);
        double sum2 = a.add(1.1, 2.2);
        String sum3 = a.add("1", "2");

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
