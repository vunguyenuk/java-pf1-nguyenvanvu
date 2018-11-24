package RegularExpression.ValidatePhoneNumber;

public class PhoneNumberTest {
    public static final String[] valid = new String[]{"(84)-(0934856175)"};
    public static final String[] notValid = new String[]{"(a8)-(2222222)"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();

        for(String phone: valid){
            boolean isValid = phoneNumberExample.validate(phone);
            System.out.println("Your phone: " + phone + " is valid: " + isValid);
        }

        for(String phone: notValid){
            boolean isNotValid = phoneNumberExample.validate(phone);
            System.out.println("Your phone: " + phone + " is valid: " + isNotValid);
        }
    }
}
