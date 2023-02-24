package ss7_Abstract_Interface;

public class Circle implements iResize {
    private double radius;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public void setResize(double percent) {
        this.radius= this.radius+(this.radius*percent);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
