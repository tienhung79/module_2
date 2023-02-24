package ss7_Abstract_Interface;

public class Rectangle implements iResize {
    private double weight;
    private double height;
    public Rectangle(){

    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.weight*this.height;
    }

    @Override
    public void setResize(double percent) {
        this.height=this.height+(this.height*percent);
        this.weight=this.weight+(this.weight*percent);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
