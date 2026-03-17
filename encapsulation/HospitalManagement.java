import java.util.*;

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Class
abstract class Patient {

    // Encapsulation
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (private)
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Protected methods to update sensitive data safely
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // Return copy for safety
    }

    // Abstract Method
    public abstract double calculateBill();

    // Concrete Method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Total Bill: ₹" + calculateBill());
        System.out.println("--------------------------------------");
    }
}

// InPatient Class
class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.numberOfDays = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge + 2000; // Extra treatment charges
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
        setDiagnosis("Admitted - Under Treatment");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

// OutPatient Class
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee + 500; // Basic test charges
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
        setDiagnosis("Consulted - Outpatient");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

// Main Class
public class HospitalPatientManagement {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Anant Raj", 21, 5, 3000);
        Patient p2 = new OutPatient(102, "Riya Sharma", 25, 1000);

        patients.add(p1);
        patients.add(p2);

        // Adding records
        ((MedicalRecord) p1).addRecord("Fever and Infection");
        ((MedicalRecord) p2).addRecord("Regular Checkup");

        // Polymorphism
        for (Patient p : patients) {
            p.getPatientDetails();
            ((MedicalRecord) p).viewRecords();
            System.out.println("===================================");
        }
    }
}