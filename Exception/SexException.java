package Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String sex) {
        System.out.printf("Пол должен быть символом латиницей f или m: %s", sex);
        System.out.println();
    }
}
