package Arrays;

import java.util.Scanner;

public class Zadanie2CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;
        int oddCount = 0;
        int oddSum = 0;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
            if (num % 2 != 0) {
                oddCount++;
                oddSum += num;
            }
        }

        double average = (double) sum / N;

        System.out.println("Наибольшее значение массива: " + max);
        System.out.println("Наименьшее значение массива: " + min);
        System.out.println("Общая сумма всех элементов: " + sum);
        System.out.println("Среднее арифметическое всех элементов: " + average);
        System.out.print("Все нечетные значения: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
