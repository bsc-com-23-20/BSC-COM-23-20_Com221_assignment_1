/*
+------------------------+
|        MyDate          |
+------------------------+
| -year: int             |
| -month: int            |
| -day: int              |
+------------------------+
| +MyDate()              |
| +MyDate(elapsedTime: long)|
| +MyDate(year: int, month: int, day: int)|
| +getYear(): int        |
| +getMonth(): int       |
| +getDay(): int         |
| +setDate(elapsedTime: long): void|
+------------------------+*/

 import java.util.Calendar; // importing the built in java calendar class

public class MyDate extends Employee{
    private int year ;
    private int month ;
    private int day;

    //no-arg constructor
    public MyDate(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired){
        super(personName, pAddress, phoneNumber, emailAddress, office, salary, dateHired);
        setDate(System.currentTimeMillis());

    }
    //constructor that constructs a mydate object with specified elapsed time 
    public MyDate(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, long elapsedTime){
        super(personName, pAddress, phoneNumber, emailAddress, office, salary, dateHired);
        setDate(elapsedTime);


    }
    // constructor that constructs the mydate object with specified year,month and date
    public MyDate(String personName, String pAddress, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired,int year, int month, int day){
        super(personName, pAddress, phoneNumber, emailAddress, office, salary, dateHired);
        this.year = year;
    this.month = month;
    this.day = day;
}

// Getter method for year 
public int getYear() {
    return year;
}

// Getter method for month
public int getMonth() {
    return month;
}

// Getter method for day 
public int getDay() {
    return day;
}

// Method to set a new date for the object using the elapsed time
public void setDate(long elapsedTime) {
    
    // calling the built in calendar java class
    Calendar calendar = Calendar.getInstance();

    calendar.setTimeInMillis(elapsedTime);

    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
}
}



