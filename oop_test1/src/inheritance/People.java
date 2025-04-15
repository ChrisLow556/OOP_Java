package inheritance;

public class People {
    protected String name;

    People(String name){
        this.name = name;
    }

    public void sayHi(){
        System.out.println("Say Hi");
    }
}
