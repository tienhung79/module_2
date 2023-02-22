import java.sql.Array;
import java.util.Arrays;

public class ThuatToan {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int count =1;
        for (int i = 0; i < 5 ; i++) {
            System.out.println(array[i][i]=count);
            count++;
            System.out.println(Arrays.toString(array[i]));
            System.out.println(" ");
        }for (int i = 5; i >=0; i--) {
            System.out.println(array[i][i]=count);
            count++;
            System.out.println(Arrays.toString(array[i]));
            System.out.println(" ");
        }

    }
}
