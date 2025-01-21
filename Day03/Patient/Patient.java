package Patient;

public class Patient {
    // Static variable 
    
    private static String hospitalName = "Global Hospital";
    
    // Static variable to keep track of total patients
    private static int totalPatients = 0;
    
    // Final variable to uniquely identify each patient
    private final int patientID;
    
    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;
    
    // Constructor using 'this' to initialize name, age, ailment, and patientID
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients when a new patient is admitted
    }
    
    // Static method to get the total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }
    
    // Getter methods
    public int getPatientID() {
        return patientID;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAilment() {
        return ailment;
    }
    
    // Method to display patient details if the object is an instance of Patient
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + this.getPatientID());
            System.out.println("Name: " + this.getName());
            System.out.println("Age: " + this.getAge());
            System.out.println("Ailment: " + this.getAilment());
            System.out.println("Hospital Name: " + hospitalName);
        } else {
            System.out.println("This object is not an instance of Patient class.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of Patient
        Patient patient1 = new Patient(1, "Alice", 30, "Fever");
        Patient patient2 = new Patient(2, "Bob", 45, "Cold");
        
        // Displaying patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        
        // Displaying the total number of patients admitted
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}
