package ss5_AM_StaticMethod.Circle;

import ss5_AM_StaticMethod.Circle.Circle;

public class CircleMain {
    public static void main(String[] args) {
        double r =5;
        Circle circle = new Circle(r);
        System.out.println(circle.getArea());

    }
}
