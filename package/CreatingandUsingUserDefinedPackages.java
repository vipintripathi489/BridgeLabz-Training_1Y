class Student {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Faculty {

    String name;
    String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student("Anant", 101);
        Faculty f1 = new Faculty("Dr. Sharma", "Data Structures");

        System.out.println("---- Student Details ----");
        s1.displayStudent();

        System.out.println("\n---- Faculty Details ----");
        f1.displayFaculty();
    }
}