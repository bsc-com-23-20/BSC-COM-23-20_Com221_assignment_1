


public class Person{
   
   /*attributes of the Person class*/
    private String personName = "";
 private String pAddress = "";
private int phoneNumber;
private String emailAddress = "";

//constructor
public Person(String personName, String pAddress, int phoneNumber, String emailAddress){
    this.personName = personName;
    this.pAddress = pAddress;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;


}

//getters
public String getPersonName(){
    return personName;
}
public String getPAddress(){
    return pAddress;

}
public int getPhoneNumber(){
    return phoneNumber;
}
public String getEmailAddress(){
    return emailAddress;
}

//setters
public void setPersonName(String personName){
    this.personName = personName;
}
public void setPAddress(String pAddress){
    this.pAddress = pAddress;

}
public void setPhoneNumber(int phoneNumber){
    this.phoneNumber = phoneNumber;
}
public void setEmailAddress(String emailAddress){
    this.emailAddress = emailAddress;

}
//overriding the toString method

    public String toString() {
        return "Person: " + personName;
    }
}