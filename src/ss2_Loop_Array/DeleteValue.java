package ss2_Loop_Array;


import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        System.out.println("nhập phần tử cần tìm và xóa");
        Scanner sc= new Scanner(System.in);
        int a = 4;
        int[] array={1,2,3,4,5,6};
        for (int i=0;i<array.length;i++){
            if (a==array[i]){
                i++;
                array[i]=0;
            }
        }
    }
}
