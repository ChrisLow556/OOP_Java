package lab3.Question1;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    Faculty(){

    }

    Faculty(String name, String address, String phoneNumber, String email, String office, int salary,
    MyDate dateHired, int officeHours, String rank){
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
