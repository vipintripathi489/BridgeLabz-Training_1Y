package com.university.department.cse;

class Course {

    String courseName;
    int duration;
    double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
    }
}

public class MainApp {

    public static void main(String[] args) {

        Course c1 = new Course("B.Tech CSE", 48, 450000);
        c1.displayCourseDetails();
    }
}