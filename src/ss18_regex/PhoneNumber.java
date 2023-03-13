package ss18_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String REGEX_PHONENUMBER = "^[0]{2}+\\d{8}$";

    public static boolean validateClassName(String regex) {
        return Pattern.matches(REGEX_PHONENUMBER, regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập SDT: ");
        String phonenumber = sc.nextLine();
        System.out.println(validateClassName(phonenumber));
    }
}
