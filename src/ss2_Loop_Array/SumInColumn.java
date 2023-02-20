package ss2_Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng ");
        int number = sc.nextInt();
        System.out.println("Nhập độ dài phần tử");
        int number2 = sc.nextInt();
        int[][] array = new int[number][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ" + i + j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Tổng là:" + sum(array));

    }

    static int sum(int[][] array) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int j;
        do {
            System.out.println("Bạn muốn tính cột thứ mấy:");
            j = sc.nextInt();
        } while (j < 0);
        for (int i = 0; i < array.length; i++) {
            sum += array[i][j];
        }
        return sum;
    }
}
