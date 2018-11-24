package RegularExpression.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SchoolClassExample {
    public static final String CLASS_REGEX = "^([CAP]+)([A-Za-z0-9]{4})([GHIKLM])";

    public SchoolClassExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
