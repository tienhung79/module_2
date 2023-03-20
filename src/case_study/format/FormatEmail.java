package case_study.format;

import java.util.regex.Pattern;

public class FormatEmail {
    private static final String REGEX_EMAIL ="^[A-Z a-z 0-9]{1,}[@][A-Z a-z 0-9]{1,}[.]com$";
    public static Boolean regexEmail(String regex){return Pattern.matches(REGEX_EMAIL,regex);
    }
}
