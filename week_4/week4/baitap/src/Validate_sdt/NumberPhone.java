package Validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_REGEX = "^(0|\\+0-9)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
    private static Pattern pattern;
    private Matcher matcher;

    public NumberPhone() {
    }

    public NumberPhone(Matcher matcher) {
        this.matcher = matcher;
    }

    public boolean validate(String regex){
        pattern= Pattern.compile(NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
