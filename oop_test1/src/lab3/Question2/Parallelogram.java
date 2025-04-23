package lab3.Question2;

public class Parallelogram extends Quadilateral{
    
    Parallelogram() {

    }

    Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double getArea() {
        return calculateArea();
    }

}
