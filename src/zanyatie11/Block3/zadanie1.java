package zanyatie11.Block3;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        String encryptedNumber = encryptNumber(number);
        System.out.println("Зашифрованное число: " + encryptedNumber);
    }

    public static String encryptNumber(int number) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        String encryptedNumber = "";
        String numberAsString = String.valueOf(number);

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Character.getNumericValue(numberAsString.charAt(i));
            encryptedNumber += letters[digit];
        }

        return encryptedNumber;
    }

}
