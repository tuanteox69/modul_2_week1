package Validate_ten_cua_lophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass_Example {
    private Matcher matcher;
    private static final String NAMECLASS_REGEX = "^[CAP]{1}+[0-9]{4}+[GHIKLM]{1}$";

    public NameClass_Example() {
    }

    public NameClass_Example(Matcher matcher) {
        this.matcher = matcher;
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAMECLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
