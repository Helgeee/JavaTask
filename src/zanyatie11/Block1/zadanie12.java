package zanyatie11.Block1;
import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Ошибка!");
            return;
        }

        int firstDigit = number / 100;
        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;

        int newNumber = lastDigit * 100 + middleDigit * 10 + firstDigit;
        System.out.println(newNumber);
    }

}
