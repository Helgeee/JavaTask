package zanyatie11.Block1;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите: ");
        int number = scanner.nextInt();

        if (isDigitsInDescendingOrder(number)) {
            System.out.println("расположены по убыванию");
        } else {
            System.out.println(" не расположены по убыванию");
        }

}


    public static boolean isDigitsInDescendingOrder(int number) {
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = number / 1000;

        return (digit1 < digit2) && (digit2 < digit3) && (digit3 < digit4);
    }
}