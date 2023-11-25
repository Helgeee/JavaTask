package zanyatie11.Block1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int number = scanner.nextInt();

        boolean hasRepeatingDigits = checkForRepeatingDigits(number);

        if (hasRepeatingDigits) {
            System.out.println("В номере есть повторяющиеся цифры.");
        } else {
            System.out.println("В номере нет повторяющихся цифр.");
        }
    }

    public static boolean checkForRepeatingDigits(int number) {
        String digits = String.valueOf(number);
        Set<Character> uniqueDigits = new HashSet<>();

        for (char digit : digits.toCharArray()) {
            if (uniqueDigits.contains(digit)) {
                return true;
            }
            uniqueDigits.add(digit);
        }

        return false;
    }
}
