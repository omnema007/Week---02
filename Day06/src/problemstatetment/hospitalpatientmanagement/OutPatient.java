package problemstatetment.hospitalpatientmanagement;

//Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosisDetails;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosisDetails = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        this.diagnosisDetails += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis Details:");
        System.out.println(diagnosisDetails.isEmpty() ? "No records found." : diagnosisDetails);
    }
}
