import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean flag =true;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

            System.out.println("Nhập ngày tháng năm");
           String date = sc.nextLine();
            df.setLenient(false);
            df.parse(date);
        System.out.println(date);

    }
}