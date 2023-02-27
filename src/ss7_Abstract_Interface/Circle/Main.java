package ss7_Abstract_Interface.Circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle =new Rectangle();
        Square square = new Square();
        double random= Math.floor(Math.random()*100);
        circle.setRadius(2);
        circle.setResize(random);
        rectangle.setHeight(3);
        rectangle.setWeight(2);
        rectangle.setResize(random);
        square.setSide(4);
        square.setResize(random);
        double[] array = new double[3];
        array[0] = circle.getArea();
        array[1]= rectangle.getArea();
        array[2]= square.getArea();
        System.out.println("size up:"+random);
        System.out.println(Arrays.toString(array));
    }
}
