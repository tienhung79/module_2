package ss7_Abstract_Interface;

public class Square implements iResize{
    private double side;
    public  Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public void setResize(double percent) {
         this.side=this.side+(this.side*percent);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
