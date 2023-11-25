package zanyatie11.Block3;
import java.util.Random;
public class zadanie3 {
    public static void main(String[] args) {
        int length = generateRandomLength(3, 10);
        int count = 2;

        String password = generatePassword(length, count);
        System.out.println(password);
    }

    public static int generateRandomLength(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String generatePassword(int length, int count) {
        StringBuilder password = new StringBuilder();
        int countOfExclamation = 0;
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            if (countOfExclamation < count && random.nextBoolean()) {
                password.append("!");
                countOfExclamation++;
            } else {
                password.append(generateRandomChar());
            }
        }

        return password.toString();
    }

    public static char generateRandomChar() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}
