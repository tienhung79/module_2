package ss10_Stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số muốn chuyển đổi để thêm vào mảng");
            number = scanner.nextInt();
            int residue = number % 2;
            stack.push(residue);
            number /= 2;
        } while (number > 0);
        System.out.print("Số sau khi chuyển đổi là :");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
