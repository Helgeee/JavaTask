package zanyatie11.Block2;
//Сгенерируйте серию случайных чисел из 0, 1, 2 так, чтобы
    //    количество двоек было равно количеству нуле
import java.util.Random;
public class zadanie44 {

    public static void main(String[] args) {
        int length = 10;

        Random random = new Random();
        int count = 0;
        StringBuilder series = new StringBuilder();

        while (series.length() < length) {
            int randomNumber = random.nextInt(3);

            if (randomNumber == 0) {
                count++;
            } else if (randomNumber == 2) {
                count--;
            }

            series.append(randomNumber).append(" ");
        }

        System.out.println("Серия : " + series.toString());


        if (count == 0) {
            System.out.println("Количество двоек равно ");
        } else {
            System.out.println("Количество двоек не равно ");
        }
    }
}
