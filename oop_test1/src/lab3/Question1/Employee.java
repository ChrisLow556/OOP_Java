package lab3.Question1;

public class Employee extends Person {
    private String office;
    private int salary;
    private MyDate dateHired;

    Employee() {

    }

    Employee(String name, String address, String phoneNumber, String email, String office, int salary,
            MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

}