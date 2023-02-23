package ss6_Inheritance.Point2D;

public class Point2dMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(3);
        point2D.setY(4);
        System.out.println(point2D.getXY());
        System.out.println("x="+point2D.getX());
        System.out.println("y="+point2D.getY());
    }
}
