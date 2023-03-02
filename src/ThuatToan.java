import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí phần tử bạn muốn lấy");
        int number = Integer.parseInt(sc.nextLine());
        int[] array = {7,1,2,0,8};
        int sum1 = 0;
        int sum2 ;
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }for (int i = 0; i < array.length; i++) {
            sum1+=array[i];
        }
        System.out.println(sum);
        for (int i = 0; i < array.length; i++) {
            if (i == number) {
                for (int j = number; j < array.length; j++) {
                    sum1 -= array[j];
                }
            }
        }
        System.out.println(sum1);
        sum2=sum-sum1-array[number];
        System.out.println(sum2);
        if (sum1==sum2){
            System.out.println("Mảng đẹp");
        }else {
            System.out.println("Mảng không đẹp");
        }
    }
}
