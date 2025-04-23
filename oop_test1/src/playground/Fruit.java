package playground;

public class Fruit {
    public Fruit (String name){
        System.out.println("Fruit constructor is invoked");
    }
}

class Apple extends Fruit {
    Apple(String name){
        super(name);
    }
}
