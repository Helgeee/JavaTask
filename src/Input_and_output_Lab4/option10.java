package Input_and_output_Lab4;
import java.util.Scanner;

public class option10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку S:");
        String S = scanner.nextLine();
        System.out.println("Введите подстроку S0:");
        String S0 = scanner.nextLine();
        System.out.println("Введите номер K:");
        int K = scanner.nextInt();

        int count = 0;
        int fromIndex = 0;
        while (true) {
            int index = S.indexOf(S0, fromIndex);
            if (index == -1) {
                break;
            }
            count++;
            if (count == K) {
                System.out.println("Номер позиции начиная с которой в строке S содержится " + K + "-е вхождение подстроки S0: " + index);
                return;
            }
            fromIndex = index + 1;
        }
        System.out.println("Количество вхождений подстроки S0 в строке S меньше " + K);
    }
}

