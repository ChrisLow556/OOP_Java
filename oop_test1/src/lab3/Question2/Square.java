package lab3.Question2;

public class Square extends Rectangle{

    Square(){

    }

    Square(Point p1, Point p2, Point p3, Point p4){
        super(p1, p2, p3, p4);
    }

    //calculates area of shape
    @Override
    public double getArea() {
        double area = Math.pow(getLength(p1, p2), 2);
        return area;
    }
}
