package ss2_Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfADiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng ");
        int number = sc.nextInt();
        int number2;
        do {
            System.out.println("Nhập độ dài phần tử phải bằng độ dài mảng");
            number2 = sc.nextInt();
        } while (number != number2);
        int[][] array = new int[number][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ" + i + j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng đường chéo thứ nhất:" + sum);
        int sum1 = 0;
        for (int i = array.length-1; i >= 0; i--) {
            sum1 += array[i][i];
        }
        System.out.println("Tổng đường chéo thứ hai:" + sum1);
    }
}
