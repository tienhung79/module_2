package ss10_Stack_queue;

import java.util.*;

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
        System.out.println(Arrays.toString(array));
        ArrayDeque<String> queue = new ArrayDeque();
        for (int i = (array.length-1); i >= 0; i--) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        String[] emptyString = new String[length];
        for (int i = 0; i < emptyString.length; i++) {
            while (!queue.isEmpty()) {
                emptyString[i]= queue.remove();
            }
        }

        System.out.println(Arrays.toString(emptyString));
        if (array==emptyString)
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
