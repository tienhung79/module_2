package ss10_Stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
   public static boolean checkBracket(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap so luong phan tu cua mang:");
      int length = Integer.parseInt(sc.nextLine());
      char[] arrayString = new char[length];
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < arrayString.length; i++) {
         System.out.println("Nhap ky tu thu"+i);
         arrayString[i]=sc.nextLine().charAt(0);
      }
      System.out.println(Arrays.toString(arrayString));
      for (int i = 0; i < arrayString.length; i++) {
         if (arrayString[i]=='('){
          stack.push(arrayString[i]);
         }
         if (arrayString[i]==')'){
            if (stack.isEmpty()){
               return false;
            }else{
               stack.pop();
            }
         }
      }
      if (stack.isEmpty()){
         return true;
      }else {
         return false;
      }
   }

   public static void main(String[] args) {
      System.out.println(checkBracket());
   }
}
