package case_study.format;

import java.util.regex.Pattern;

public class FormatDate {
    private static final String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    public static boolean formatDate(String date){ return Pattern.matches(REGEX_DATE,date);
    }
}
