package ss2_Loop_Array;



import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        System.out.println("nhập phần tử cần tìm và xóa");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int[] array={1,2,3,4,5,6};
        for (int i=0;i<array.length;i++){
            if (a==array[i]){
                for (int j=i;j<array.length-1;j++) {
                    array[j] =array[j+1];
                    array[j+1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
