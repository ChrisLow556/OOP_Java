package lab3.Question2;

public class Point {
    private double x,y;

    Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    //returns x coordinate
    public double getX() {
        return x;
    }

    //returns y coordinate
    public double getY() {
        return y;
    }

    //sets the points
    public void setPoint(double  x, double  y){
        this.x = x;
        this.y = y;
    }
}
