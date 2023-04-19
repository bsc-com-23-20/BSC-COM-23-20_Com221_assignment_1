class Staff extends Employee{
    private String title;

    public Staff(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(personName, pAddress, phoneNumber, emailAddress,office, salary, dateHired);
        this.title = title;
    }
    //getter and setter for title
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    //overriding the toString() method
    public String toString() {
        return "Staff: " + super.toString();
    }
    
}