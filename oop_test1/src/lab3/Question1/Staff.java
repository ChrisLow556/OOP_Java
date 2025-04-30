package lab3.Question1;

public class Staff extends Employee{
    private String title;

    Staff(){

    }

    Staff(String name, String address, String phoneNumber, String email, String office, String salary,
    MyDate dateHired,String title){
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public String getTitle() {
        return title;
    }
}
