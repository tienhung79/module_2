package ss1_Introdution_to_Java;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập tên của bạn:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello:" + name);
    }
}
