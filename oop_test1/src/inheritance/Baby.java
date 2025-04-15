package inheritance;
//A baby is also a person, so it inherits the people class
public class Baby extends People{
    
    //use the super keyword to pass values to the parent class
    Baby(String name){
        super(name);
    }

    //however, a baby cannot say Hi so, we override the original method
    //and make the baby say googoo gaga
    @Override
    public void sayHi(){
        System.out.println("Goo Goo Ga Ga");
    }

    public static void main(String[] args) {
        Baby baby1 = new Baby("Alex");
        System.out.println(baby1.name);
        baby1.sayHi();
    }
}
