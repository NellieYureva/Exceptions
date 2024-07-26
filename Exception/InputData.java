package Exception;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
                String data = iScanner.nextLine();
                String[] arrayData = data.split(" ");
                if (arrayData.length == 6) {
                    return arrayData;
                } else System.out.println("Введено некорректное число данных, попробуйте еще раз");
            }
        }

    }
}
