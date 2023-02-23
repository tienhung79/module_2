package ss6_Inheritance.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double weight) {
        super(radius, color);
        this.height = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(),2)*this.height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + ','+"radius="+getRadius()+','+ "color="+getColor()+
                '}';
    }
}
