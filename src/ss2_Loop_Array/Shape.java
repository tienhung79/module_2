package ss2_Loop_Array;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài");
        int a = sc.nextInt();
        System.out.println("Nhập độ rộng");
        int b= sc.nextInt();
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++ ){
                System.out.print('*');

            }System.out.println("");
        }

//        System.out.println("Nhập chiều cao của tam giác");
//        int h= sc.nextInt();
//        for (int k=0;k<h;k++) {
//            for (int g = 0; g < k; g++) {
//                System.out.print('*');
//            }
//            System.out.println(" ");
//
//        }
//        for (int l=0;l<h;l++){
//            for (int g=h;g>l;g--){
//                System.out.print('*');
//            }
//            System.out.println(" ");
//        }

    }
}
