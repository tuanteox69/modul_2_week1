package Validate_ten_cua_lophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass_Example {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAMECLASS_REGEX = "^[C,A,P]{1}+[0-9]{4}+[G, H, I, K, L, M]{1}$";

    public NameClass_Example() {
        this.matcher = matcher;
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
