package Circle;
import java.util.Scanner;
public class Zadanie4Delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во клиентов:");
        int n = scanner.nextInt();

        long routes = calculateRoutes(n);
        System.out.println("Количество вариантов доставки товара: " + routes);
    }

    private static long calculateRoutes(int n) {
        long factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        return factorial;
    }
}