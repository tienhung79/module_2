package ss4_class_object.Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chữ nhật là:"+rectangle.toString());
        System.out.println("Diện tích là:"+rectangle.getArea());
        System.out.println("Chu vi là:"+rectangle.getPerimeter());
    }
}
