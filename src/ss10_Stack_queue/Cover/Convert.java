package ss10_Stack_queue.Cover;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển đổi :");
        int number = scanner.nextInt();
        while (number != 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }
        System.out.print("Số sau khi chuyển đổi là :");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
