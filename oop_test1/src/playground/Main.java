package playground;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "red");
        GeometricObject o1 = new GeometricObject(5, "blue");

        GeometricObject g1 = new Circle(5, "Purple");

        System.out.println(circle1 instanceof Circle);
        System.out.println(circle1 instanceof GeometricObject);
        System.out.println(o1 instanceof GeometricObject);
        System.out.println(o1 instanceof Circle);

        System.out.println(g1 instanceof Circle);
        System.out.println(g1 instanceof GeometricObject);

        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> cities2 = new ArrayList<String>();

    }
}
