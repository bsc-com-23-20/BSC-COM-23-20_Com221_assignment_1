class Faculty extends Employee{
     // Instance variables, attributes of the office class
     private String officeHours;
     private String rank;
 
     // Constructor
     public Faculty(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
         super(personName, pAddress, phoneNumber, emailAddress, office, salary, dateHired);
         this.officeHours = officeHours;
         this.rank = rank;
     }
 
     // Getters and setters
     public String getOfficeHours(){ 
         return officeHours;
     }
     public void setOfficeHours(String officeHours){
         this.officeHours = officeHours;
     }
     public String getRank(){ 
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }

    //@override
    public String toString() {
        return "Faculty: " + super.toString();

    }
}