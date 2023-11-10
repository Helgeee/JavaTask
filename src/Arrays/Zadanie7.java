package Arrays;
import java.util.Arrays;

public class Zadanie7 {
    public static void main(String[] args) {
        double[] numbers = {3.14, 2.71, 5.0, 1.618, 0.0, 9.8, 4.5, 6.2, 7.3, 8.4};

        Arrays.sort(numbers);

        double min = numbers[0];
        double max = numbers[numbers.length - 1];

        double difference = max - min;

        System.out.println("Разность между максимальным и минимальным числом: " + difference);
    }
}
