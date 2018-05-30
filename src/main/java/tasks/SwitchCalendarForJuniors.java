package tasks;

import java.io.IOException;
import java.util.Scanner;

public class SwitchCalendarForJuniors {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter month from range 1-12: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextByte();
        String monthName;
        switch (month) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Опрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default:
                monthName = "Нет такого месяца, сорян";
                break;
        }
        System.out.println("Название месяца: " + monthName);
    }
}
