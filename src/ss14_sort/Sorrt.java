package ss14_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sorrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lenghth = Integer.parseInt(sc.nextLine());
        int[] array = new int[lenghth];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ : " + i);
            array[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng ban đầu là: "+Arrays.toString(array));
        System.out.println("Mảng sau khi sắp xếp là: "+Arrays.toString(insertSort(array)));
    }
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int pos = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > pos; j--) {
                System.out.println("đổi "+arr[j+1] +"" +"bằng "+ arr[j]);
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = pos;
        }
        return arr;
    }
}
