package RegularExpression.ValidateAccount;


public class AccountTestValidate {
    public static final String[] isValid = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] isNotValid = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for(String account: isValid){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is: " + account + " is valid: " + isValid);
        }

        for(String account: isNotValid){
            boolean isNotValid = accountExample.validate(account);
            System.out.println("Account is: " + account + " is valid: " + isNotValid);
        }
    }
}