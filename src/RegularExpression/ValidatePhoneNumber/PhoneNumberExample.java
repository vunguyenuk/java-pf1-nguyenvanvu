package RegularExpression.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static final String PHONE_REGEX = "^(\\([0-9]{2}\\)-)(\\(0+([1-9]){9}\\))$";

    public PhoneNumberExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
