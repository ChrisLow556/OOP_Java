package lab3.Question2;

public class Trapezoid extends Quadilateral{

    Trapezoid(){

    }

    Trapezoid(Point p1, Point p2, Point p3, Point p4){
        super(p1,p2,p3,p4);
    }

    //calculates area of shape
    public double getArea(){
        return calculateArea();
    }
}
