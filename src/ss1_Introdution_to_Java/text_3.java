package ss1_Introdution_to_Java;

import java.util.Scanner;

public class text_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rate = 23000;
        System.out.println("Nhập số tiền:");
        int mn = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn muốn quy đổi sang VND hay USD:");
        String a = sc.nextLine();
        int money;
        if (a.equals("USD")||a.equals("usd")){
            money = mn/rate;
            System.out.println(" Tổng số tiền là:" + money);
        }else if (a.equals("VND")||a.equals("vnd")){
            money = mn*rate;
            System.out.println(" Tổng số tiền là:" + money);
        }


    }
}
