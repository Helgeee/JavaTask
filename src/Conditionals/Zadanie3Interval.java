package Conditionals;
import java.util.Scanner;

public class Zadanie3Interval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("Число находится в промежутке [0 - 14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Число находится в промежутке [15 - 35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Число находится в промежутке [36 - 50]");
        } else if (number > 50 && number <= 100) {
            System.out.println("Число находится в промежутке [50 - 100]");
        } else {
            System.out.println("Число не входит ни в один из имеющихся числовых промежутков");
        }
    }
}
