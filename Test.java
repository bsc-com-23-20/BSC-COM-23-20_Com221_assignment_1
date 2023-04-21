public class Test{
    public static void main(String[] args){
        // tester for the person class
        Person person1 = new Person("Mercy Nago", "namiwawa 43 St", 899023459 , "mercynagoli@gmail.com");
        System.out.println(person1);

        // testing the Student class
        Student student1 = new Student("Ivy Okoye", "18 Dubai", 78932678 ,"ivyokoye3@gmail.com", Student.JUNIOR);
        System.out.println(student1);

        // testing the mydate class
        MyDate dateHired = new MyDate("", "", 2023, "", "", 0.0, null, 2023, 7, 15);
        dateHired.setDate(System.currentTimeMillis());
        // testing the employee class
        Employee employee1 = new Employee("Lupo Peanut", "Senti 18b", 39568989 , "lupoPeanuts@hotmail.com", "B001", 5000000.0, dateHired);
        System.out.println(employee1);

        // testing the faculty class
        Faculty faculty1 = new Faculty("Alice Kotamo", "123 Chirunga", 35906932 ,"ak@unima.com", "B006", 750000.0, dateHired, "M-F 7am-4pm", "Senior Lecturer");
        System.out.println(faculty1);

        // testing the staff class
        Staff staff1 = new Staff("Essyln Huwa", "Naisi street 34", 89038587 , "essHuwa@gmail.com", "B009", 4000000.0, dateHired, "Accounts Assistant");
        System.out.println(staff1);
   
   
   
    }
}