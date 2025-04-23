package lab3.Question2;

public class Main {
    public static void main(String[] args) {
        // 1) A simple trapezoid:
        //    bottom base from (0,0)→(4,0), top base from (1,2)→(3,2)
        Trapezoid t = new Trapezoid(
            new Point(0, 0),
            new Point(4, 0),
            new Point(3, 2),
            new Point(1, 2)
        );
        // area = ((4 + 2) / 2) * 2 = 6.0

        // 2) A parallelogram:
        //    base (0,0)→(5,0), side up to (6,3) and back to (1,3)
        Parallelogram p = new Parallelogram(
            new Point(0, 0),
            new Point(5, 0),
            new Point(6, 3),
            new Point(1, 3)
        );
        // area = base (5) * height (3) = 15.0

        // 3) A rectangle:
        //    width 5, height 3
        Rectangle r = new Rectangle(
            new Point(0, 0),
            new Point(5, 0),
            new Point(5, 3),
            new Point(0, 3)
        );
        // area = 5 * 3 = 15.0

        Square s = new Square(
            new Point(0, 0),
            new Point(4, 0),
            new Point(4, 4),
            new Point(0, 4) 
        );
        // area = 4 * 4 = 16.0

        // 5) (Optional) Test a raw quadrilateral via shoelace
        //    here it’s a 4×3 rectangle, so area = 12.0
        Quadilateral q = new Quadilateral(
            new Point(0, 0),
            new Point(4, 0),
            new Point(4, 3),
            new Point(0, 3)
        );

        System.out.println("Trapezoid area: "    + t.getArea());
        System.out.println("Parallelogram area: "+ p.getArea());
        System.out.println("Rectangle area: "    + r.getArea());
        System.out.println("Square area: "       + s.getArea());
        System.out.println("Quad (raw) area: "   + q.calculateArea());
    }
}
