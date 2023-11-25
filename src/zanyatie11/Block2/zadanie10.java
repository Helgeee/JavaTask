package zanyatie11.Block2;

public class zadanie10 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Сумма квадратов первых " + n + " натуральных чисел: " + sum);
    }
}
