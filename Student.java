class Student extends Person{
    //defining the class constants 
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    //instance variable
    private String status;

    // constructor for the student class including attributes inherited in the person class
    public Student(String personName, String pAddress, int phoneNumber, String emailAddress, String status) {
        super(personName, pAddress, phoneNumber, emailAddress);
        this.status = status;
    }
// Getter and setter for status variable
public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

    // no getters and setters required for constants

// overriding the toString() method
    public String toString() {
        return "Student: " + super.toString();
    }
}
    
