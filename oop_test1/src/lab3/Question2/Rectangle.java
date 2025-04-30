package lab3.Question2;

public class Rectangle extends Parallelogram{
    Rectangle(){

    }

    Rectangle(Point p1, Point p2, Point p3, Point p4){
        super(p1, p2, p3, p4);
    }

    public double getArea(){
        double area = getLength(p1, p2) * getLength(p2, p3);
        return area;
    }

    public double getLength(Point a, Point b){
        double diffX = a.getX() - b.getX();
        double diffY = a.getY() - b.getY();
        double length = Math.sqrt(diffX*diffX + diffY*diffY);

        return length;
    }
}
