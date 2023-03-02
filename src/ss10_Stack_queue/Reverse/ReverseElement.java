package ss10_Stack_queue.Reverse;

import java.util.*;


public class ReverseElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần tử:");
        int length = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[length];
        for (int i = 0; i < length ; i++) {
            System.out.println("Nhập phần tử thứ: "+(i+1));
            int mNumber = Integer.parseInt(sc.nextLine());
            array[i]= mNumber;
            stack.push(mNumber);
        }
        System.out.println(stack);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            array[i]= stack.pop();
        }
        System.out.println(stack);

    }
}
