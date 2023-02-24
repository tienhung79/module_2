package ss6_Inheritance.Point_MoveablePoint;

public class MoveablePointMain {
    public static void main(String[] args) {
        MoveablePoint moveablePoint =new MoveablePoint();
        moveablePoint.setX(5);
        moveablePoint.setY(4);
        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(2);
//        moveablePoint.setSpeed(5,6);
        System.out.println(moveablePoint.getxSpeed());
        System.out.println(moveablePoint.getSpeed());
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.getXY());
    }
}
