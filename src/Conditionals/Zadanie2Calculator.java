package Conditionals;

import java.util.Scanner;

public class Zadanie2Calculator {
    public static void main(String[] args) {
        double operand1 = 10;
        double operand2 = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите знак арифметической операции (+, -, *, /): ");
        String sign = input.next();

        switch (sign) {
            case "+":
                System.out.println("Результат: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.println("Результат: " + (operand1 / operand2));
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Неверный знак операции");
        }
    }
}

