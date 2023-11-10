package Methods;

public class Zadanie2 {
    public static void main(String[] args) {
        double x = 3.5;
        double y = 2.8;

        double a = Math.min(x, y);
        System.out.println("Наименьшее из х, у: " + a);

        double b = Math.min(Math.min(x + y, x * y), 0.5);
        System.out.println("Наименьшее из х + у, х • у, 0,5: " + b);
    }
}
