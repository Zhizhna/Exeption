import exeption.WrongLoginExeption;
import exeption.WrongPasswordExeption;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern LoginPattern = Pattern.compile( "[a-zA-Z0-9]{1,20}");

    private static final Pattern PasswordPattern = Pattern.compile( "[a-zA-Z0-9]{1,20}");

    public static void validate(
        String login,
        String password,
        String confirmPassword
    ){

        if (!LoginPattern.matcher(login).matches()) {
            throw new WrongLoginExeption("Login does not follow described rules");
        }

        if (!PasswordPattern.matcher(password).matches()){
            throw new WrongPasswordExeption("Password does not follow described rules");
        }

        if (!password.equals(confirmPassword)){
            throw new WrongPasswordExeption("Passwords must be equal");
        }

    }
}
