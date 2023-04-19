public class Test{
    public static void main(String[] args){
        Person person1 = new Person("Mercy Nago", "namiwawa 43 St", 899023459 , "mercynagoli@gmail.com");
        System.out.println(person1);

        Student student1 = new Student("Ivy Okoye", "18 Dubai", 78932678 ,"ivyokoye3@gmail.com", Student.JUNIOR);
        System.out.println(student1);

        MyDate dateHired = new MyDate("", "", 2023, "", "", 0.0, null, 2023, 7, 15);
        dateHired.setDate(System.currentTimeMillis());
        Employee employee1 = new Employee("Lupo Peanut", "Senti 18b", 39568989 , "lupoPeanuts@hotmail.com", "B001", 5000000.0, dateHired);
        System.out.println(employee1);
    }
}