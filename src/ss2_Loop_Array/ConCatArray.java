package ss2_Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ConCatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1:");
        int number = sc.nextInt();
        int[] array1 = new int[number];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử thứ:" + i);
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Nhập độ dài mảng 2:");
        int number2 = sc.nextInt();
        int[] array2 = new int[number2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử thứ:" + i);
            array2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < number; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < number2; i++) {
            array3[i + number] = array2[i];
        }

        System.out.println(Arrays.toString(array3));
    }
}
