import java.util.ArrayList;

//Hospital class
class Hospital {
    public String hospitalName;
    public ArrayList<Doctor> doctors;
    public ArrayList<Patient> patients;

    //Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + this.hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("Doctor: " + d.doctorName);
        }
    }

    public void showPatients() {
        System.out.println("Patients in " + this.hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("Patient: " + p.patientName);
        }
    }
}

//Doctor class
class Doctor {
    public String doctorName;
    public ArrayList<Patient> patients;

    Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showConsultedPatients() {
        System.out.println("Patients consulted by Doctor " + this.doctorName );
        for (Patient p : patients) {
            System.out.println(p.patientName);
        }
    }
}

//Patient class
class Patient {
    public String patientName;
    public ArrayList<Doctor> doctors;

    Patient(String patientName) {
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showConsultingDoctors() {
        System.out.println("Doctors consulted by Patient " + this.patientName);
        for (Doctor d : doctors) {
            System.out.println(d.doctorName);
        }
    }
}

public class HospitalManagement{
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Mohan");
        Doctor doctor2 = new Doctor("Deepak");

        Patient patient1 = new Patient("ABC");
        Patient patient2 = new Patient("XYZ");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);


        hospital.showDoctors();
        hospital.showPatients();

        // Consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);

        doctor1.showConsultedPatients();
        doctor2.showConsultedPatients();

        patient1.showConsultingDoctors();
        patient2.showConsultingDoctors();
    }
}
