package lab3.Question1;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2020, 5, 3);
        Person person1 = new Person("Chris", "33 Street", "01119195968", "clxh.gmail.com");
        Student student1 = new Student("Chris", "33 Street", "01119195968", "clxh.gmail.com", 1);
        Employee employee1 = new Employee("Chris", "33 Street", "01119195968", "clxh.gmail.com", "SE", "12000", date);
        Staff staff1 = new Staff("Chris", "33 Street", "01119195968", "clxh.gmail.com", "SE", "12000", date, "Lecturer");
        Faculty faculty1 = new Faculty("Chris", "33 Street", "01119195968", "clxh.gmail.com", "SE", "12000", date, 7, "Leader" );

        System.out.println(person1.toString());
        System.out.println(student1.toString());
        System.out.println(employee1.toString());
        System.out.println(staff1.toString());
        System.out.println(faculty1.toString());
    }
}
