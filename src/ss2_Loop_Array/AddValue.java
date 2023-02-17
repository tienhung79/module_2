package ss2_Loop_Array;

import java.util.Scanner;
import java.util.Arrays;
public class AddValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Độ dài của mảng");
        int Length = sc.nextInt();
        Integer[] array = new Integer[Length];
        for (int i=0;i<array.length;i++){
            System.out.println("Phần tử thứ:"+(i+1));
            array[i]= sc.nextInt();
        }
//        System.out.println("bạn muốn thêm bao nhiều phần tử vào mảng:");
        System.out.println("Bạn muốn thêm vào vị trí nào");
        int index = sc.nextInt();
        System.out.println("Bạn thêm phần tử nào");
        int input = sc.nextInt();
        array[index]=input;
        for (int j=0;j<array.length;j++){
            if (index==j){
                Length++;
                for (int k=0;k< array.length;k++){
                    array[j]=array[j+1];
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
