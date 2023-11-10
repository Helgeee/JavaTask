package Methods;


import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double x, y;
        System.out.print("Введите значение переменной x: ");
    x = scanner.nextDouble();

        System.out.print("Введите значение переменной y: ");
    y = scanner.nextDouble();

    double min1 = Math.min(2 * x, Math.abs(x - y));
    double min2 = Math.min(4.5, (x + y) / 3);

    double result = Math.min(min1, min2);

        System.out.println("Наименьшее значение: " + result);
}
}
