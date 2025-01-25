package Patient;

// Abstract class Patient with common fields and methods
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for patientId
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to calculate the medical bill for each type of patient
    abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Interface MedicalRecord with methods addRecord and viewRecords
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient subclass implementing calculateBill
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int numberOfDays;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
    }

    // Implementing the calculateBill method for InPatient
    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
    }

    // Implementing addRecord and viewRecords methods from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
        System.out.println("Record added: " + record);
    }

    @Override
    public void viewRecords() {
        if (medicalHistory != null) {
            System.out.println("Medical History: " + medicalHistory);
        } else {
            System.out.println("No medical history available.");
        }
    }
}

// OutPatient subclass implementing calculateBill
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;
    
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Implementing the calculateBill method for OutPatient
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing addRecord and viewRecords methods from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        this.diagnosis = record;
        System.out.println("Diagnosis added: " + record);
    }

    @Override
    public void viewRecords() {
        if (diagnosis != null) {
            System.out.println("Diagnosis: " + diagnosis);
        } else {
            System.out.println("No diagnosis available.");
        }
    }
}

// Main class to test the implementation
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating an InPatient object and calculating the bill
        InPatient inPatient = new InPatient(101, "Jony", 45, 200, 5);
        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());
        inPatient.addRecord("Heart Surgery");
        inPatient.viewRecords();

        // Creating an OutPatient object and calculating the bill
        OutPatient outPatient = new OutPatient(102, "Pappu", 34, 150);
        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());
        outPatient.addRecord("Fever and Cold");
        outPatient.viewRecords();
    }
}
