package zanyatie11.Block2;

public class zadanie20 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int num = i;
            int sumOfCubes = 0;

            while (num > 0) {
                int digit = num % 10;
                sumOfCubes += Math.pow(digit, 3);
                num /= 10;
            }

            if (sumOfCubes == i) {
                System.out.println(i);
            }
        }
    }
}
