package Conditionals;

public class Zadanie4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;
        int num4 = 15;

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }

        System.out.println("Наименьшее число: " + min);
    }
}
