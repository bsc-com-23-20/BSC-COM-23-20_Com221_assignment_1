class Employee extends Person{
    private String office = "";
    private double salary;
    private MyDate dateHired;


//constructor for creating the employee object with some attributes inherited from the person class
    public Employee(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(personName, pAddress, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
     // Getters and setters
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    // overriding the tostring() method
    public String toString() {
        return "Employee: " + super.toString();
    }
}
