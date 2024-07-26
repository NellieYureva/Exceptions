package Exception;
public class DateException extends Exception{
    public DateException() {
    }

    public void dataException(String birthDate) {
        System.out.printf("Дата рождения должна быть в формате дд.мм.гггг: %s", birthDate);
        System.out.println();
    }
}