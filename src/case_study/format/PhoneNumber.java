package case_study.format;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String REGEX_PHONENUMBER = "^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$";

    public static boolean validateNumberOfPhone(String regex) {
        return Pattern.matches(REGEX_PHONENUMBER, regex);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập SDT: ");
//        String phonenumber = sc.nextLine();
//        System.out.println(validateClassName(phonenumber));
//    }
}
