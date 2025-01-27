package problemstatetment.hospitalpatientmanagement;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "Ravi", 30, 1500.0, 5);
        Patient outPatient = new OutPatient("P002", "Mohit", 40, 500.0);

        processPatient(inPatient);
        processPatient(outPatient);

        // Add and view records
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) inPatient;
            record.addRecord("Admitted for surgery.");
            record.addRecord("Prescribed painkillers.");
            record.viewRecords();
        }

        if (outPatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) outPatient;
            record.addRecord("Consulted for a headache.");
            record.viewRecords();
        }
    }

    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());
        System.out.println("--------------------------------");
    }

}
