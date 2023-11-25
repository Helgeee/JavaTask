package zanyatie11.Block2;
//сти на экран числа от 1000 до 9999 такие, что среди цифр
  //     нет цифр 5 и цифры 6.
public class zadanie17 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if (!containsDigit(i, 5) && !containsDigit(i, 6)) {
                System.out.println(i);
            }
        }
    }

    private static boolean containsDigit(int number, int digit) {
        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
