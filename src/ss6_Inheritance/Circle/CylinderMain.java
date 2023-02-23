package ss6_Inheritance.Circle;

public class CylinderMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(1);
        cylinder.setColor("blue");
        System.out.println("volume="+cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
