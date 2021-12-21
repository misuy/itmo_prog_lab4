public class IllegalNameException extends RuntimeException
{
    public IllegalNameException()
    {
        super("К сожалению, вы ввели недопустимое имя. Повторите попытку.");
    }
}