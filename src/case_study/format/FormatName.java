package case_study.format;

import java.util.regex.Pattern;

public class FormatName {
    private static final String REGEX_NAME = "^([A-Z][a-z]{1,})(\\s[A-Z][a-z]{0,}){1,}";
    public static boolean validateName (String name){return Pattern.matches(REGEX_NAME,name);
    }
}
