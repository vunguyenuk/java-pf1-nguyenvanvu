package tdd;

import java.util.regex.Pattern;

public class PasswordServices {
    public static boolean isPasswordValid(String password){
        Pattern specialCharacter = Pattern.compile("[^a-z0-9 ]");
        Pattern upperCaseCharacter = Pattern.compile("[A-Z]");
        Pattern number = Pattern.compile("[0-9]");

        if(password == null){
            return false;
        }
        if(password.length() < 8){
            return false;
        }

        if(!specialCharacter.matcher(password).find()){
            return false;
        }

        if(!upperCaseCharacter.matcher(password).find()){
            return false;
        }

        if(!number.matcher(password).find()){
            return false;
        }


        return true;
    }
}
