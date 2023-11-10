package Arrays;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine().toLowerCase();

        System.out.println("Введите символ, процент вхождения которого вы хотите подсчитать:");
        char characterToCount = scanner.next().toLowerCase().charAt(0);

        int stringLength = inputString.length();
        int characterCount = 0;

        for (int i = 0; i < stringLength; i++) {
            if (inputString.charAt(i) == characterToCount) {
                characterCount++;
            }
        }

        double percentage = ((double) characterCount / stringLength) * 100;

        System.out.println("Процент вхождения символа '" + characterToCount + "' в строку: " + percentage + "%");
    }
}
