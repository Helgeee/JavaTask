package Arrays;
import java.util.Scanner;

//В заданной строке текста определите количество слов. Каждое слово отделено друг от
//        друга пробелом
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String inputString = scanner.nextLine();

        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i)) && !isWord) {
                isWord = true;
                wordCount++;
            } else if (inputString.charAt(i) == ' ') {
                isWord = false;
            }
        }

        System.out.println("Количество слов в строке: " + wordCount);
    }
    }

