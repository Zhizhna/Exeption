import exeption.WrongLoginExeption;
import exeption.WrongPasswordExeption;

public class Main {
    public static void main(String[] args) {
        String login = "login";
        String password = "password";
        String confirmPassword = "confirmPassword";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginExeption | WrongPasswordExeption exeption){
            exeption.printStackTrace();
        }finally {

        }
    }
}