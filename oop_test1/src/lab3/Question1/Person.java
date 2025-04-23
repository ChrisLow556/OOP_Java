package lab3.Question1;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    Person(){

    }

    Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString(){
        String employeeString = "Name: " + this.getName() + " Class: " + this.getClass().getName();
        return employeeString;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }
}
