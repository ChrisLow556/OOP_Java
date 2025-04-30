package lab3.Question1;

public class Student extends Person{
    private final String status;

    Student(){
        this.status = "Unknown"; // Default value for status
    }

    Student(String name, String address, String phoneNumber, String email, String status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public String getStatus() {
        return status;
    }
}
