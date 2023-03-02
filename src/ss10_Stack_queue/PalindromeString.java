package ss10_Stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang");
        int length= Integer.parseInt(sc.nextLine());
        String[] array = new String[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu "+ i);
            array[i]= sc.nextLine();
        }
        Queue queue = new LinkedList();
        for (int i = (array.length-1); i >= 0; i--) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        String emptyString = " ";
        while (!queue.isEmpty()) {
            emptyString += queue.remove();
        }
        if (Arrays.toString(array).equals(emptyString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
