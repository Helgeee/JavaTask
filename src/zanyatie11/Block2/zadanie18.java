package zanyatie11.Block2;

public class zadanie18 {
    public static void main(String[] args) {
        for (int num = 10000; num <= 99999; num++) {
            if (num % 2 == 0 && getMiddleDigit(num) % 2 != 0 && getDigitSum(num) % 4 == 0) {
                System.out.println(num);
            }
        }
    }

    public static int getMiddleDigit(int num) {
        int digitCount = String.valueOf(num).length();
        int middleIndex = digitCount / 2;
        return Integer.parseInt(String.valueOf(num).substring(middleIndex, middleIndex + 1));
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        String numString = String.valueOf(num);
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return sum;
    }
}
