package lab3.Question2;

public class Quadilateral {
    protected Point p1, p2, p3, p4 ;

    Quadilateral(){

    }

    Quadilateral(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double calculateArea(){
        Point [] points = {p1, p2, p3, p4};
        double sum1 = 0, sum2 = 0;
        for(int i = 0; i<points.length; i++){
            // The if statement checks if the last point is accessed or not
            // It will loop the next second x/y point to the first x/y point to prevent nullPointer error
            if(i == points.length - 1){
                sum1 += points[i].getX() * points[0].getY();
                sum2 += points[i].getY() * points[0].getX();
            }else{
                sum1 += points[i].getX() * points[i+1].getY();
                sum2 += points[i].getY() * points[i+1].getX();
            }
        }
        return 0.5 * (Math.abs(sum1 - sum2));
    }

    //sets the points for the shape
    public void setPoints(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    //gets the points for the shape
    public Point[] getPoints(){
        Point [] points = {p1, p2, p3 ,p4};
        return points;
    }

}
