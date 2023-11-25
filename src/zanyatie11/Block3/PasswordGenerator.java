package zanyatie11.Block3;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int minLength = 6;
        int maxLength = 20;
        int minUpperCase = 2;
        int maxDigits = 5;

        String password = generatePassword(minLength, maxLength, minUpperCase, maxDigits);
        System.out.println("Сгенерированный пароль: " + password);
    }

    public static String generatePassword(int minLength, int maxLength, int minUpperCase, int maxDigits) {
        Random random = new Random();

        int passwordLength = random.nextInt(maxLength - minLength + 1) + minLength;
        int upperCaseCount = random.nextInt(passwordLength - minUpperCase + 1) + minUpperCase;
        int digitCount = random.nextInt(maxDigits + 1);

        StringBuilder passwordBuilder = new StringBuilder(passwordLength);


        for (int i = 0; i < passwordLength; i++) {
            char c;


            if (upperCaseCount > 0) {
                c = (char) (random.nextInt(26) + 'A');
                upperCaseCount--;
            }

            else if (digitCount > 0) {
                c = (char) (random.nextInt(10) + '0');
                digitCount--;
            }

            else {
                c = (char) (random.nextInt(26) + 'a');
            }

            passwordBuilder.append(c);
        }


        int underscoreIndex = random.nextInt(passwordLength);
        passwordBuilder.setCharAt(underscoreIndex, '_');

        return passwordBuilder.toString();
    }
}