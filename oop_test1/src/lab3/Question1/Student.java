package lab3.Question1;

public class Student extends Person{
    private final int FRESHMEN = 1;
    private final int SOPHOMORE = 2;
    private final int JUNIOR = 3;
    private final int SENIOR = 4;
    private int status;

    Student(){

    }

    Student(String name, String address, String phoneNumber, String email, int status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public int getStatus() {
        return status;
    }
}
