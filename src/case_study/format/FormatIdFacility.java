package case_study.format;

import java.util.regex.Pattern;

public class FormatIdFacility {
    private static final String REGEX_VILLA = "^[S][V][V][L]-\\d{4}$";
    public static boolean regexVilla(String regex){return Pattern.matches(REGEX_VILLA,regex);
    }
    private static final String REGEX_ROOM = "^[S][V][R][O]-\\d{4}$";
    public static boolean regexRoom(String regex){return Pattern.matches(REGEX_ROOM,regex);
    }
    private static final String REGEX_HOUSE = "^[S][V][H][O]-\\d{4}$";
    public static boolean regexHouse(String regex){return Pattern.matches(REGEX_VILLA,regex);
    }

}
