package case_study.format;

import java.util.regex.Pattern;

public class FormatChoiceFuramaController {
    public static final String REGEX_FURAMACONTROLLER = "^[1-6]$";
    public static boolean formatChoiceFuramaController(String choice){
        return Pattern.matches(REGEX_FURAMACONTROLLER,choice);
    }
}
