import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;
    private int pin;
    // TO DO: Constructor that takes an IDcopy
    public Physician(Integer id) {
        this.id = id;
        this.patientNotes = new ArrayList<>();
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    public boolean assignPin(int pin) {
        // Pin must be exactly 4 digits
        return String.valueOf(pin).length() == 4;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // Checks the physician's id against the given id
        return confirmedAuthID.equals(this.getId());
    }


    // TO DO: Setters & Getters
    public ArrayList<String> getPatientNotes(){
        return this.patientNotes;
    }
    public void setPatientNotes(ArrayList<String> patientNotes){
        this.patientNotes = patientNotes;
    }
}
