package ss2_Loop_Array;

import java.util.Scanner;
import java.util.Arrays;

public class AddValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int number = sc.nextInt();
        int[] array1 = new int[number];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử thứ"+i);
            array1[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        int number2;
        do {
            System.out.println("nhập độ dài của mảng mới phải lớn hơn độ dài mảng cũ");
            number2 = sc.nextInt();
        } while (number >= number2);
        int[] array2 = new int[number2];
        System.out.println("nhập phần tử cần thêm vào mảng:");
        int newVale = sc.nextInt();
        System.out.println("nhập vị trí cần thêm vào mảng:");
        int index = sc.nextInt();

        if (index <= -1 || index >= (array1.length - 1)) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i];
            }
            for (int j = array2.length - 1; j > 0; j--) {
                array2[j] = array2[j - 1];
                if (j == index) {
                    array2[j] = newVale;
                    break;
                }
            }
            System.out.println(Arrays.toString(array2));
        }
    }
}
