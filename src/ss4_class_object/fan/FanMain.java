package ss4_class_object.fan;

import java.util.Scanner;

public class FanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setSpeed(fan1.fast);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setSpeed(fan1.medium);
        System.out.println(fan2.toString());


    }
}
