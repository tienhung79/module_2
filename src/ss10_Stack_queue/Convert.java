package ss10_Stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number ;
        System.out.println("Nhập số muốn chuyển đổi để thêm vào mảng hoặc nhập 0 để thoát:");
        number = scanner.nextInt();
         while (number != 0){
             int residue = number % 2;
             stack.push(residue);
             number /= 2;
         }
        System.out.print("Số sau khi chuyển đổi là :");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
