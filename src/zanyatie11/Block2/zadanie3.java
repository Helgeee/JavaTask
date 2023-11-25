package zanyatie11.Block2;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
    }
}
