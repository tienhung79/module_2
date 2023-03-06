package ss13_thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxStringIncreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String string = sc.nextLine();
        LinkedList<Character> max =new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j < string.length() ; j++) {
               if (string.charAt(j)>list.getLast()){
                   list.add(string.charAt(j));
               }
                if (list.size()> max.size()){
                    max.clear();
                    max.addAll(list);
                }
            }

        }
        for (Character temp: max
             ) {
            System.out.print(temp);
        }

    }
}
