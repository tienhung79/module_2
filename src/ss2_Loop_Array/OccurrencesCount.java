package ss2_Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int number = Integer.parseInt(sc.nextLine());
        char[] array = new char[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ:" + i);
            array[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(array));
        count(array);
    }

    static int count(char[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự số lần xuất hiện");
        char character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (character == array[i]) {
                count++;
            }
        }
        System.out.println("Số lần ký tự xuất hiện:" + count);
        return count;
    }
}
