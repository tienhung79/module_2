package case_study.format;

import java.util.regex.Pattern;

public class FormatNameFacility {
    private static final String REGEX_NAME = "^[A-Z][a-z]{4}$";
    public static boolean formatNameFacilityVilla(String regex){return Pattern.matches(REGEX_NAME,regex);
    }
}
