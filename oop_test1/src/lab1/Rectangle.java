package lab1;
public class Rectangle {

    //Set the attributes of the Rectangle object
    double width = 1;
    double height = 1;

    //Create an empty constructor
    public Rectangle() {

    }

    //Create a constructor that receives the Width and Height in the parameters
    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    //A function that calculates area
    public double getArea(){
        return width*height;
    }

    //A function that calculates perimeter
    public double getPerimeter(){
        return width*2 + height*2;
    }
    
}

class test1 {
    public static void main(String[] args) {
        
        //Create an instance of the rectangle class called rectangle1 and rectangle2
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        //Display output
        System.out.println("Rectangle 1:");
        System.out.println("width: " + rectangle1.width);
        System.out.println("height: " + rectangle1.height);
        System.out.printf("area: %.2f \n", rectangle1.getArea());
        System.out.printf("perimeter: %.2f \n\n", rectangle1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("width: " + rectangle2.width);
        System.out.println("height: " + rectangle2.height);
        System.out.printf("area: %.2f \n", rectangle2.getArea());
        System.out.printf("perimeter: %.2f \n", rectangle2.getPerimeter());
                         
    }
}
