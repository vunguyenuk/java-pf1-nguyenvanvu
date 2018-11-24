package RegularExpression.ValidateClassName;


public class SchoolClassTest {
    public static final String[] valid = new String[]{"C0318G"};
    public static final String[] notValid = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        SchoolClassExample schoolClassExample = new SchoolClassExample();

        for(String className: valid ){
            boolean isValid = schoolClassExample.validate(className);
            System.out.println("Your class name: " + className + " is valid: " + isValid);
        }


        for(String className: notValid ){
            boolean isNotValid = schoolClassExample.validate(className);
            System.out.println("Your class name: " + className + " is valid: " + isNotValid);
        }
    }
}
