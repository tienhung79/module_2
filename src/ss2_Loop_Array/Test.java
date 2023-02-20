package ss2_Loop_Array;

import java.util.Scanner;
import java.lang.Math;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số:");
        int a = sc.nextInt();
        System.out.println("nhập số:");
        int b = sc.nextInt();
        int c =Math.max(a,b);
        System.out.println("Kết quả là:");
        System.out.println(c);
    }
}
