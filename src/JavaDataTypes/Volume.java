package JavaDataTypes;

public class Volume {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        double R = 5.0;
        double h = 10.0;

        double V = PI * R * R * h;
        System.out.println("Объем цилиндра: " + V);

        double S = 2 * PI * R * R + 2 * PI * R * h;
        System.out.println("Площадь поверхности цилиндра: " + S);
}}
