package ss6_Inheritance.Point_MoveablePoint;

public class MoveablePointMain {
    public static void main(String[] args) {
        MoveablePoint moveablePoint =new MoveablePoint();
        moveablePoint.setSpeed(5,6);
        System.out.println(moveablePoint.getSpeed());
        System.out.println(moveablePoint.toString());
    }
}
