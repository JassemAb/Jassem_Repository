

import java.util.ArrayList;
import java.util.Date;

public  class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    private int pin;

    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id , String role){
        this.employeeID = id;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        // Pin must be 6 digits or more
        if (String.valueOf(pin).length() >= 6) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // Compares the ids
        if (!confirmedAuthID.equals(this.getId())) {
            // If they are not a match, create an incident report
            authIncident();
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // Returns a list of strings (incidents reported)
        return this.securityIncidents;
    }

    public void authIncident() {
        // Create an incident report for failed authorization attempts
        String report = String.format("Datetime Submitted : %s \n ,", new Date());
        report+= String.format("Id : %s \n" , this.employeeID);
        report+=String.format("Notes : Authorization Failed For this User \n");
        securityIncidents.add(report);
    }

    // TO DO: Setters & Getters
    public Integer getEmployeeID(){
        return this.employeeID;
    }
    public void setEmployeeID(Integer id){
        this.employeeID = id;
    }

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents(){
        return this.securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents){
        this.securityIncidents = securityIncidents;
    }
}
