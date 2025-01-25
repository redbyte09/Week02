package Patient;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Patient
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class to represent a Doctor
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to simulate a consultation
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
    }

    // Display all patients of the doctor
    public void displayPatients() {
        System.out.println("Doctor " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Class to represent the Hospital
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
            System.out.println();
        }
    }
}

// Main class to demonstrate the hospital system
public class Main {
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient("Janni");
        Patient patient2 = new Patient("Jane ");
        Patient patient3 = new Patient("Endrew");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Alli");
        Doctor doctor2 = new Doctor("Dr. Bobby");

        // Assign patients to doctors
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient3);
        doctor2.addPatient(patient1); // John Doe consults with Dr. Bob too

        // Simulate consultations
        doctor1.consult(patient1);
        doctor2.consult(patient3);

        // Create a hospital and add doctors
        Hospital hospital = new Hospital("City Hospital");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Display hospital details
        hospital.displayHospitalDetails();
    }
}

