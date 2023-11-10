package Conditionals;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie1Translator {
    public static void main(String[] args) {
        Map<String, String> weatherWords = new HashMap<>();
        weatherWords.put("солнечно", "sunny");
        weatherWords.put("дождь", "rain");
        weatherWords.put("ветренно", "windy");
        weatherWords.put("туман", "fog");
        weatherWords.put("облачно", "cloudy");
        weatherWords.put("гроза", "storm");
        weatherWords.put("снег", "snow");
        weatherWords.put("тепло", "warm");
        weatherWords.put("холодно", "cold");
        weatherWords.put("пасмурно", "overcast");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово на русском языке для перевода на английский:");
        String russianWord = scanner.nextLine().toLowerCase();

        if (weatherWords.containsKey(russianWord)) {
            System.out.println("Перевод на английский: " + weatherWords.get(russianWord));
        } else {
            System.out.println("Такого слова нет в словаре.");
        }
    }
}