package ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(sc.nextLine());
        try {
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("cả a,b,c phải lớn hơn 0 ");
        }
        try {
            if (a+b<c||b+c<a||a+c<b){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}