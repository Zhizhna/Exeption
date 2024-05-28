package exeption;

public class WrongLoginExeption extends RuntimeException{
    public WrongLoginExeption(String messageDis){
        super(messageDis);
    }
}
