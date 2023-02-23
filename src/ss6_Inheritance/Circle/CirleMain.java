package ss6_Inheritance.Circle;

public class CirleMain {
    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.setRadius(3);
        circle.setColor("red");
        System.out.println("Area="+circle.getArea());
        System.out.println(circle.toString());
    }
}
