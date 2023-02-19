package ss2_Loop_Array;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ:" + i);
            array[i] = sc.nextInt();

        }
        int min = array[0];
        for (int i = 0; i < args.length; i++) {
            if (array[i] < min) {
                array[i] = min;
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là :" + min);
    }
}
