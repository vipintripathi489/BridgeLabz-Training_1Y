class Student {

    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public String getName() {
        return name;
    }

    // toString() method to print details neatly
    @Override
    public String toString() {
        return "Student Name: " + name +
               "\nMarks in Subject 1: " + marks1 +
               "\nMarks in Subject 2: " + marks2 +
               "\nMarks in Subject 3: " + marks3;
    }
}

class Analyzer {

    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    public String findGrade(double average) {

        if (average >= 90)
            return "A+";
        else if (average >= 75)
            return "A";
        else if (average >= 60)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "Fail";
    }
}

public class StudentPerformanceAnalyzer {

    public static void main(String[] args) {

        Student s1 = new Student("Anant", 85, 78, 92);

        Analyzer analyzer = new Analyzer();

        double average = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(average);

        System.out.println("===== Student Performance Report =====\n");
        System.out.println(s1);  // Uses toString()
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}