package ss1_Introdution_to_Java;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rate = 23000;
        int input;
        do {
            System.out.println("Nhập số tiền lớn hơn 0");
            input = Integer.parseInt(sc.nextLine());
        } while (input < 0);
        System.out.println("Bạn muốn quy đổi sang VND hay USD:");
        String a = sc.nextLine();
        int money;
        if (a.equals("USD") || a.equals("usd")) {
            money = input / rate;
            System.out.println(" Tổng số tiền là:" + money);
        } else if (a.equals("VND") || a.equals("vnd")) {
            money = input * rate;
            System.out.println(" Tổng số tiền là:" + money);
        }


    }
}
