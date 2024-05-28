package exeption;

public class WrongPasswordExeption extends RuntimeException {
    public WrongPasswordExeption(String messageDis){
        super(messageDis);
    }
}
