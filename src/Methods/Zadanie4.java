package Methods;

public class Zadanie4 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 7.0;

        double z = max(x, 2 * y - x) + max(5 * x + 3 * y, y);

        System.out.println("Результат: " + z);
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
}
