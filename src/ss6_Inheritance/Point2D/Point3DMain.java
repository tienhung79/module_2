package ss6_Inheritance.Point2D;

public class Point3DMain {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setZ(1);
        point3D.setX(2);
        point3D.setY(3);
        System.out.println(point3D.getXYZ());
        System.out.println("x="+ point3D.getX());
        System.out.println("y="+ point3D.getY());
        System.out.println("z="+ point3D.getZ());
    }
}
