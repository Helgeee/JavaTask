package zanyatie11.Block3;
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int length = getRandomNumberInRange(3, 10);
        String randomString = generateRandomString(length);
        System.out.println(randomString);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        while (stringBuilder.length() < length) {
            char randomChar = (char) (random.nextInt(94) + 33); 
            if (randomChar == '!') {
                count++;
                if (count > 2) {
                    continue;
                }
            }
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}