package Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Пожалуйста, введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, * или /): ");
        char operation;
        do {
            operation = scanner.next().charAt(0);
        } while (operation != '+' && operation != '-' && operation != '*' && operation != '/');
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
        }
        return result;
    }
}